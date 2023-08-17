
package Entidades;


import java.util.Random;

/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
*/
public class RevolverDeAgua {
    private int posActual;
    private int posAgua;
    
    public void llenarRevolver(){
        Random random = new Random();        
        posActual = random.nextInt(6);
        posAgua = random.nextInt(6);
        
    }

    public RevolverDeAgua() {
    }
    
    public boolean mojar(){
        return posAgua == posActual;
        
    }

    public void siguienteChorro() {
        if (posActual == 5) {
            posActual = 0;
            
        } else { posActual++;}
        
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }
    
    
    
    

    
    
    
}
