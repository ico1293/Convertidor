/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

/**
 *
 * @author Stiven
 */
public class Convertidor {
    //VARIABLES GLOBALES (NATIVAS)
    double cantidad;
    double respuesta;
    double litros2Galones;
    double metros2Centimetros;
    double horas2Segundos;
    //CONSTRUCTORES
    //VALORES POR DEFECTO
    public Convertidor()
    {
        cantidad = 0;
        respuesta = 0;
        //UN LITRO EQUIVALE A 0.264 GALONES
        litros2Galones = 0.264;
        //UN METRO EQUIVALE A 100 CM
        metros2Centimetros = 100;
        //UNA HORA EQUIVALE A 3600 SEGUNDOS
        horas2Segundos = 3600;
    }
    //VALORES ASIGNADOS NATIVOS( OSEA AL LLAMAR ESTE CONSTRUCTOR O METODO CONVERTIDOR(NUMERO) ASIGNARA
    //NUMERO A LA VATIABLE NATIVA DE LA CLASE )
    public  Convertidor(double cantidad)
    {
        //EL THIS ES PARA DIFERENCIAR LA VARIABLE NATIVA DE LA VARIABLE PROPIA DEL METODO
        this.cantidad = cantidad;
        litros2Galones = 0.264;
        metros2Centimetros = 100;
        horas2Segundos = 3600;
        respuesta = 0;
    }
    //METODOS
    public double MostrarCantidad()
    {
        return cantidad;
    }
    
    public double CalcularMetrosToCentimetros()
    {
        respuesta = cantidad * metros2Centimetros;
        return respuesta;
    }
    
    public double CalcularLitrosToGalones()
    {
        respuesta = cantidad * litros2Galones;
        return respuesta;
    }
    
    public double CalcularHorasToSegundos()
    {
        respuesta = cantidad * horas2Segundos;
        return respuesta;
    }
    
}
