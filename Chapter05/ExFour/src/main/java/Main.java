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
        List<Product> products =
                session.createQuery("SELECT DISTINCT p FROM Product p WHERE p.price>:minPrice", Product.class)
                       .setParameter("minPrice", 1000)
                       .getResultList();
        session.getTransaction().commit();

        System.out.println("All products(price>1000):");
        products.forEach(p ->
                System.out.println(p.getId() + " - " +
                        p.getName() + " - " + p.getPrice())
        );
    }
}
