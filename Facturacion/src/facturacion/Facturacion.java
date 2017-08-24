/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

/**
 *
 * @author COMPAQ
 */
public class Facturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Venta miventa=new Venta(1, 1, 20, "Andres","bogota", 99346);
        Producto papas=new Producto(154, 2);
        miventa.factura.agregardetalle(1, papas);
        miventa.factura.agregardetalle(5, papas);
        System.out.println("el subtotal es"+miventa.factura.sumasubtotales()+"y el total es"+miventa.factura.getTotal());
        
        
    }
    
}
