/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starcarrental.Controller;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import starcarrental.Model.*;

/**
 *
 * @author Alejandro
 */
public class ControlCarManagement {
    

    public static List<String> getCategories()
    {
        
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        // This isn't sql!        
        Query q = session.createQuery("select CC.name from CarCategory as CC");
        List<String> CarCategoryList = q.list();
        tx.commit();
        session.close();
        
        return CarCategoryList;
        
    }     
    
    public static List<String> getBrands()
    {
        
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        // This isn't sql!        
        Query q = session.createQuery("select distinct C.brand from Car as C order by C.brand");
        List<String> CarCategoryList = q.list();
        tx.commit();
        session.close();
        
        return CarCategoryList;
        
    } 
    
    public static List<Car> getCarInformation(int storeID, String categoryFilter, String brandFilter)
    {
        
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        // category filter is under dev (It's a foreing key)
        if (true || categoryFilter.equals("") || categoryFilter.equals("All")) {
            categoryFilter = "1=1";
        }else
        {
            categoryFilter = "category = '" + categoryFilter + "'";
        }
        
        if (brandFilter.equals("") || brandFilter.equals("All")) {
            brandFilter = "1=1";
        }else
        {
            brandFilter = "brand = '" + brandFilter + "'";
        }
        
        Query q = session.createQuery("from Car where id_store=" + storeID + " and " + categoryFilter + " and " + brandFilter);
        List<Car> CarList = q.list();
        tx.commit();
        session.close();
        
        return CarList;
    
    }
}
