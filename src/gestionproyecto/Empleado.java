/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionproyecto;

/**
 *
 * @author Estudiante
 */
public abstract class Empleado extends Contrato {
    protected String nombre; 

    public Empleado(String nombre, int id, double salario) {
        super(id, 100);
        this.nombre = nombre;
    }
    

    @Override
    public abstract double calcularSalario();

    @Override
    public abstract  String reportarNomina();
    
}
