package SQL.dao;

import SQL.model.Order;
import SQL.model.Order_item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


import java.util.ArrayList;
import java.util.List;

public class OrderDAO implements DAOInterface<Order> {
    public static OrderDAO getInstance() {
        return new OrderDAO();
    }
    @Override
    public List<Order> selectAll() {
        return List.of();
    }

    @Override
    public Order selectById(Order order) {
        return null;
    }
    public List<Order> getOrdersByCustomerId(int customerId) {
        List<Order> list = new ArrayList<>();
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();

                String hql = "SELECT DISTINCT o FROM Order o " +
                        "LEFT JOIN FETCH o.order_items oi " +
                        "LEFT JOIN FETCH oi.product " +
                        "WHERE o.customer.id = :cid " +
                        "ORDER BY o.order_date DESC";

                list = session.createQuery(hql, Order.class)
                        .setParameter("cid", customerId)
                        .getResultList();


                transaction.commit();
                session.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    @Override
    public boolean insert(Order order) {
        try{
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                session.saveOrUpdate(order);
                transaction.commit();
                session.close();
                return true;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean insertItem(Order_item order) {
        try{
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                session.saveOrUpdate(order);
                transaction.commit();
                session.close();
                return true;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Order order) {
        return false;
    }
    public double getTotal(int orderId) {
        try{
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                String hql = "select SUM(oi.quantity * oi.product.product_price)"+"from Order_item oi where oi.order.order_id =:oid";
                double total = session.createQuery(hql, Double.class).setParameter("oid", orderId).uniqueResult();
                return total;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}
