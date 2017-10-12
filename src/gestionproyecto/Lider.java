/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionproyecto;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Lider extends Programador {
    private ArrayList <Programador> Programadores; 

    public Lider(ArrayList<Programador> Programadores, String lenguaje, String nombre, int id, double salario) {
        super(lenguaje, nombre, id, salario);
        this.Programadores = Programadores;
    }

    public double calcularSalario(){
        double Bono = 0;
        double BonoExtra= 0; 
        if(lenguaje=="java"){
           Bono = this.salario*0.2;  
        }
        for (int i = 0; i < this.Programadores.size(); i++) {
            
            
            
        }
    }
    
    
    
}
