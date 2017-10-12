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
public class Programador extends Empleado {
    protected String lenguaje; 
    

    public Programador(String lenguaje, String nombre, int id, double salario) {
        super(nombre, id, salario);
        this.lenguaje = lenguaje;
        
    }

    
    
    
    @Override
    public double calcularSalario() {
        double Bono = 0;
        if(lenguaje=="java"){
           Bono = this.salario*0.2;  
        }
        
        double salarioProgramador=this.salario+ Bono;
        return salarioProgramador;   
    }

    @Override
    public String reportarNomina() {
        return "Programador"+ this.nombre+" "+this.salario+ " "+this. lenguaje;
    }
    
}
