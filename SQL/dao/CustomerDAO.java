package SQL.dao;

import SQL.model.Customer;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class CustomerDAO implements DAOInterface<Customer> {
    public static CustomerDAO getInstance() {
        return new CustomerDAO();
    }
    @Override
    public List<Customer> selectAll() {
        List<Customer> list = null;
        try{
            SessionFactory sessionFactory = new HibernateUtil().getSessionFactory();
            if(sessionFactory!=null){
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                String hql = "FROM Customer";
                Query query = session.createQuery(hql);
                list = query.getResultList();
                transaction.commit();
                session.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Customer selectById(Customer customer) {
        Customer cus = null;
        try{
            SessionFactory sessionFactory = new HibernateUtil().getSessionFactory();
            if(sessionFactory!=null){
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                cus=session.get(Customer.class, customer.getCustomer_id());
                transaction.commit();
                session.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cus;
    }

    @Override
    public boolean insert(Customer customer) {
        try{
            SessionFactory sessionFactory = new HibernateUtil().getSessionFactory();
            if(sessionFactory!=null){
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                session.saveOrUpdate(customer);
                transaction.commit();
                session.close();
                System.out.println("Successful");
                return true;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Customer customer) {
        return false;
    }
}
