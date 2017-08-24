/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.util.Date;

/**
 *
 * @author COMPAQ
 */
public class Venta {
    
    Factura factura;

    public Venta(int numero, int fecha, double descuento,String nombre,String domicilio,int documento) {
        this.factura = new Factura(numero,  fecha, descuento, nombre, domicilio, documento);
    }

 
    
   
    
    
}
