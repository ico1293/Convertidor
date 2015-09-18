/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;
import convertidor.Convertidor;
import javax.swing.JOptionPane;
/**
 *
 * @author Stiven
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese cantidad"));
        //SE CREA UN OBJETO DE LA SIGUIENTE FORMA: NOMBRE DE LA CLASE-NOMBRE DEL OBJETO-NEW-NOMBRE DEL CONSTRUCTOR
        Convertidor metros2Centimetros = new Convertidor(cantidad);
        
        
        //IMPRIMIR RESPUESTA (LLAMAMOS AL METODO DE LA FORMA: NOMBRE DEL OBJETO - . - METODO DE LA CLASE
        System.out.println(metros2Centimetros.MostrarCantidad() + " Metros son " + metros2Centimetros.Calcular() + " CentiMetros");
 
    }
    
}
