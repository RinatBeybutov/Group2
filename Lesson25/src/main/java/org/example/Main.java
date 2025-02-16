package org.example;

import org.hibernate.Session;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        // Add new Employee object
        /*EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail("demo-user@mail.com");
        emp.setFirstName("demo");
        emp.setLastName("user");*/
        User user = new User();
        user.setEmail("demo-user@mail.com");
        user.setName("demo");

       // session.persist(user);

        session.getTransaction().commit();


        //List<Customer> customers = session.createQuery("FROM Customer", Customer.class).list();
        // HQL = Hibernate Query Language
        var result = session.createQuery("select new CustomPair(u.name, u.email) FROM User u",
                CustomPair.class).list();
        result.forEach(System.out::println);

        HibernateUtil.shutdown();

    }
}