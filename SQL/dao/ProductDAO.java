package SQL.dao;

import SQL.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class ProductDAO implements DAOInterface<Product> {
    public static ProductDAO getInstance() {
        return new ProductDAO();
    }
    @Override
    public List<Product> selectAll() {
        List<Product> list = null;
        try{
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                list = session.createQuery("from Product").getResultList();
                transaction.commit();
                session.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Product selectById(Product product) {
        Product p = null;
        try{
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                p = session.get(Product.class, product.getProduct_id());
                transaction.commit();
                session.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public boolean insert(Product product) {
        try{
            SessionFactory sessionFactory = new HibernateUtil().getSessionFactory();
            if(sessionFactory!=null){
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                session.saveOrUpdate(product);
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
    public boolean delete(Product product) {
        return false;
    }
}
