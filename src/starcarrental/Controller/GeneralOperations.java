/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starcarrental.Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import starcarrental.Model.HibernateUtil;

/**
 *
 * @author Alejandro
 */
public class GeneralOperations {
 
        public void storeInformation(Object obj)
    {        
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        // Creating a new session
        Session session;        
        session = sesion.openSession();
        // Starting the transaction against the server
        Transaction tx = session.beginTransaction();
        // Performing the action
        session.save(tx);
        // Storiing all the changes made during the transaction
        tx.commit();
        // Ending the session.
        session.close();
    }

}
