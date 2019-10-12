/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starcarrental.Controller;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;
import org.hibernate.SessionFactory;
import starcarrental.Model.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import starcarrental.Model.Employee;
import starcarrental.Model.Store;
/**
 *
 * @author Alejandro
 */
public class LoginManagement {
    
    public void getStores()
    {
        
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        //session.save(tx);
        tx.commit();
        session.close();
    }
    
    public static List<Store> getInformation()
    {
        
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        // This isn't sql!
        Query q = session.createQuery("from Store");
        List<Store> StoreList = q.list();
        tx.commit();
        session.close();
        
        return StoreList;
    
    }

    public static boolean validateUser(String store, String userName, String password)
    {     
        
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        // This isn't sql!
        Query q = session.createQuery("FROM" +
                                    "dbo.Store AS S " + 
                                    "JOIN dbo.Employee AS E ON E.id_store = S.id " +
                                    "JOIN dbo.[User] AS U ON E.id_user = U.id" +
                                    "WHERE S.name ='" + store + "' and E.userName ='" + userName + "' and E.password = '" + password + "'");
        
        boolean matchUser = q.list().isEmpty();        
        List<Store> StoreList = q.list();
        tx.commit();
        session.close();
        
        return matchUser;        
    }    
    
}
