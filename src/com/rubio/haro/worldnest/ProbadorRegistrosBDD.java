package com.rubio.haro.worldnest;

import com.rubio.haro.worldnest.dao.EntidadArrendatario;
import com.rubio.haro.worldnest.dao.EntidadArrendatarioDAO;
import com.rubio.haro.worldnest.model.Arrendatario;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class ProbadorRegistrosBDD {

    public static void main(String[] args) {
        Arrendatario[] arrendatarios = {
            new Arrendatario("Ernesto Flores", "Arica 85", "55020645"),
            new Arrendatario("Laurda montiel", "Delia 23", "55020645"),
            new Arrendatario("Florencia Garcia", "Margarita 78", "55020645"),
            new Arrendatario("Diego Palacios", "Moctezuma 123", "55020645"),
            new Arrendatario("Rocio Delgado", "Fioris 120", "55020645"),
            new Arrendatario("Carlos Fuentes", "Flores 78", "55020645"),
            new Arrendatario("Karla Manriquez", "Nuevos Pinos 33", "55020645")
        };

        LinkedList<EntidadArrendatario> ees = new LinkedList<>();
        int id = 1;
        for (Arrendatario e : arrendatarios) {
            ees.add(new EntidadArrendatario(id++, e));
        }
        EntidadArrendatarioDAO eDao = new EntidadArrendatarioDAO();
        eDao.create(ees);
        //eDao.create(new EntidadArrendatario(1, "Rodrigo", "Arica 69", "5520798111"));

        List<EntidadArrendatario> misArrendatarios = eDao.read();
        for (EntidadArrendatario ee : misArrendatarios) {
            System.out.println(ee.getArrendatario());
        }
        EntidadArrendatario elEmpleado = new EntidadArrendatario(6, new Arrendatario("Karla De La O", "Revolucionarios 55", "84651315"));
        eDao.update(elEmpleado);
        System.out.println(eDao.read(new EntidadArrendatario(6)).getArrendatario());
       
        
//        Empleado[] empleados = {
//            new Empleado("Ernesto Flores", 5456.0, "Ingeniero"),
//            new Empleado("Laura montiel", 2456.0, "Secretaria"),
//            new Empleado("Florencia Garcia", 3356.0, "Contadora"),
//            new Empleado("Diego Palacios", 4156.0, "Abogado"),
//            new Empleado("Rocio Delgado", 9456.0, "Duenia"),
//            new Empleado("Carlos Fuentes", 3356.0, "Editor"),
//            new Empleado("Karla Manriquez", 5456.0, "Ingeniera")
//        };
//
//        LinkedList<EntidadEmpleado> ees = new LinkedList<>();
//        int id = 0;
//        for (Empleado e : empleados) {
//            ees.add(new EntidadEmpleado(id++, e));
//        }
//        EntidadEmpleadoDAO eDao = new EntidadEmpleadoDAO();
//        eDao.create(ees);
//        List<EntidadEmpleado> misEmpleados = eDao.read();
//        for (EntidadEmpleado ee : misEmpleados) {
//            System.out.println(ee.getEmpleado());
//        }
//        EntidadEmpleado elEmpleado = new EntidadEmpleado(6, new Empleado("Karla De La O", 6200.0, "Ingeniera"));
//        eDao.update(elEmpleado);
//        System.out.println(eDao.read(new EntidadEmpleado(6)).getEmpleado());
        eDao.close();
    }
}
