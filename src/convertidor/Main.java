/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

import convertidor.Convertidor;
import javax.swing.JOptionPane;
import convertidor.Interfaz;

/**
 *
 * @author Stiven
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //INICIAR INTERFAZ
        iniciarInterfaz();
    
        /*
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
         //IMPRIMIR RESPUESTA (LLAMAMOS AL METODO DE LA FORMA: NOMBRE DEL OBJETO - . - METODO DE LA CLASE
         System.out.println(convertidor.MostrarCantidad() + " Metros son " + convertidor.Calcular() + " CentiMetros");
         */
    }

    public static void iniciarInterfaz() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

}
