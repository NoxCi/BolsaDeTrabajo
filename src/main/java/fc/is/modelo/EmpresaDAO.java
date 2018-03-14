/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fc.is.modelo;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Oxium
 */
public class EmpresaDAO {
    private SessionFactory sessionFactory;
    
    public EmpresaDAO() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }
    public void guarda(Empresa p){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
         
           session.persist(p);
           
           tx.commit();
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
    }
    
    public List<Empresa> empresas() {
        List<Empresa> resultado = null;
        Session sesion = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = sesion.beginTransaction();
            String hql = "from Empleado";
            Query query = sesion.createQuery(hql);
            resultado = (List<Empresa>)query.list();
            tx.commit();
        } catch (Exception e) {
            if(tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            sesion.close();
        }
        return resultado;
    }
}
