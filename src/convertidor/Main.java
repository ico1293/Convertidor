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
        int eleccion = Integer.parseInt(JOptionPane.showInputDialog("1.Metros To Centimetros\n2.Litros To Galones\n3.Horas to Segundos"));
        double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad"));
        //SE CREA UN OBJETO DE LA SIGUIENTE FORMA: NOMBRE DE LA CLASE-NOMBRE DEL OBJETO-NEW-NOMBRE DEL CONSTRUCTOR
        Convertidor convertidor = new Convertidor(cantidad);
        
        switch (eleccion)
        {
            case 1: System.out.println(convertidor.MostrarCantidad() + " Metros son " + convertidor.CalcularMetrosToCentimetros() + " CentiMetros");
                break;
            case 2: System.out.println(convertidor.MostrarCantidad() + " Litros son " + convertidor.CalcularLitrosToGalones() + " Galones");
                break;
            case 3: System.out.println(convertidor.MostrarCantidad() + " Horas son " + convertidor.CalcularHorasToSegundos() + " Segundos");
                break;
        }
        
        /*
        //IMPRIMIR RESPUESTA (LLAMAMOS AL METODO DE LA FORMA: NOMBRE DEL OBJETO - . - METODO DE LA CLASE
        System.out.println(convertidor.MostrarCantidad() + " Metros son " + convertidor.Calcular() + " CentiMetros");
        */
    }
    
}
