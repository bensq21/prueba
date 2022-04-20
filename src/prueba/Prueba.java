package prueba;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * Este programa lee en una ventana números y los imprime por pantalla en orden de entrada
 * @author Bensq
 */
public class Prueba {
    
    /**
     * Pide un string y comprueba si es un número
     *
     * @return valor double que contiene un número
     */
    public static double leerNum() {
        /**
         * Variable String que recibe lo introducido en la ventana
         */
        String entrada;//string que se lee en el joptionpane
        /**
         * Variable boolean para saber si ha saltado algun error durante la lectura
         */
        boolean err;//si salta un error hara que el bucle se repita
        /**
         * Variable double a la que va a ser convertida el String de entrada
         */
        double num=0;//es la variable de salida
        do {//se repite mientras haya errores
            err = false;
            
            do {//lee el string y comprueba que es un número
                entrada = JOptionPane.showInputDialog("Introduce un número", "Número").trim();
                
            } while (entrada.matches("[0-9]+[,.]?\\d*") == false);//hace la comprobación de que el string es un número
            
            try {//intenta convertir el string en un número
                num = Double.parseDouble(entrada);//lo convierte
                
            } catch (Exception e) {//si salta cualquier error err pasa a ser verdadero y se repite el bucle
                
                err = true;
                System.out.println("No se ha podido leer el número.\nPruebe otra vez.");
            }
            
        } while (err);
        return num;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Double> listnum = new ArrayList<>(); // Crea el arraylist
        boolean salir=false;
        double num;
        
        do {            
            num=leerNum();
            listnum.add(num);
            System.out.println("Número introducido.");
            if(num==0) salir=true;
        } while (false==salir);
        
        for (Double i : listnum) {
            System.out.println("Este es el número: "+i);
        }

    }
    
}
