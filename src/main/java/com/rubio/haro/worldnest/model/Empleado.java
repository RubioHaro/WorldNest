package com.rubio.haro.worldnest.model;

/**
 * @author sdelaot
 */
public class Empleado {

    private String nombre;
    private double salario;
    private String grado;

    public Empleado() {
        this("Juan Perez", 4592.0, "Ingeniero");
    }

    public Empleado(String nombre, double salario, String grado) {
        this.nombre = nombre;
        this.salario = salario;
        this.grado = grado;
    }

    public void setEmpleado(String nombre, double salario, String grado) {
        this.nombre = nombre;
        this.salario = salario;
        this.grado = grado;
    }

    public Empleado(Empleado e) {
        this(e.nombre, e.salario, e.grado);
    }

    public Empleado getEmpleado() {
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getGrado() {
        return grado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario
                + ", grado=" + grado + "}\n";
    }
}
