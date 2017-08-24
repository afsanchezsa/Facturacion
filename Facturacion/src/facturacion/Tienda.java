/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author COMPAQ
 */
public class Tienda {
    ArrayList<Venta>ventas;
    private double totalportiempo;
    private double totalfinal;

    public Tienda() {
    this.ventas=new ArrayList<Venta>();
    }
    public void agregarventa(int numero, int fecha, double descuento,String nombre,String domicilio,int documento){
    ventas.add(new Venta( numero, fecha,  descuento, nombre, domicilio, documento));
    }
    Venta vent;
    public double calculartotalportiempo(int ultimodia){
   for(int i=0;i<ventas.size();i++){
   vent=ventas.get(i);
   if(vent.factura.getFecha()<ultimodia){
   totalportiempo+=vent.factura.getTotal();
   }
   }
        return totalportiempo;
        
    }
    
    public double ventastotales(){
    for(int i=0;i<ventas.size();i++){
   vent=ventas.get(i);
   
   this.totalfinal+=vent.factura.sumasubtotales();
   
    }
    return totalfinal;
}
}
