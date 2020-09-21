/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author carlo
 */
public class Test {

    public static void main(String args[]) {
        //INSERT 
        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        Transaction tra = ses.beginTransaction();
        Datosempleados datos = new Datosempleados();
        datos.setNombres("Laura");
        datos.setApellidos("Ramirez");
        datos.setEdad(23);
        datos.setTelefono("22202222");
        datos.setDireccion("Mi casa");
        ses.save(datos);
        tra.commit();

      //UPDATE
     /* SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        Transaction tra = ses.beginTransaction();
        Datosempleados datos = new Datosempleados();
        datos.setId(1);
        datos.setNombres("Laura");
        datos.setApellidos("Ramirez");
        datos.setEdad(23);
        datos.setTelefono("22202222");
        datos.setDireccion("Mi casa2");
        ses.update(datos);
        tra.commit();
*/
     //delete
  /*   SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        Transaction tra = ses.beginTransaction();
        Datosempleados datos = new Datosempleados();
        datos.setId(1);
        datos.setNombres("Laura");
        datos.setApellidos("Ramirez");
        datos.setEdad(23);
        datos.setTelefono("22202222");
        datos.setDireccion("Mi casa2");
        ses.delete(datos);
        tra.commit();
*/
    }
}
