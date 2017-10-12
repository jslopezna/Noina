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
public class Consultor extends Contrato {
    private String Labor;

    public Consultor(String Labor, int id) {
        
        super(id, 220);
        this.Labor = Labor;
    }

    @Override
    public double calcularSalario() {
        return this.salario;
    }

    @Override
    public String reportarNomina() {
        return  "Consultor" + this.id + this.salario + " "+ this.Labor; 
    }
    
    
}
