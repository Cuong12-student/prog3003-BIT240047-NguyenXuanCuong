/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author VICTUS
 */
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SessionFactory sessionFactory =
                new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Product.class)
                        .buildSessionFactory();

        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.persist(new Product("Laptop", 1500));
        session.persist(new Product("Mouse", 800));
        session.persist(new Product("Headphones", 1100));
        session.getTransaction().commit();
        List<Product> products =
                session.createQuery("FROM Product", Product.class)
                       .getResultList();

        System.out.println("All books:");
        products.forEach(b ->
                System.out.println(b.getId() + " - " +
                        b.getName() + " - " + b.getPrice())
        );
    }
}
