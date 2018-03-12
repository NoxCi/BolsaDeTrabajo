/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fc.is.modelo;

import org.hibernate.Session;

/**
 *
 * @author Oxium
 */
public class FormacionacademicaDAO {
    Session session = null;
    public FormacionacademicaDAO() {
        this.session = (Session) HibernateUtil.getSessionFactory();
    }
}
