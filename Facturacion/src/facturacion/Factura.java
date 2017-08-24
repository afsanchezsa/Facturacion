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
public class Factura {
   private int numero;
   private int fecha;
   private Detalle[] detalles;
   private double descuento;
   private double iva;
   private  double total;
   private String pago;
   private Cliente cliente;
   private int i=0;

    public Factura(int numero, int fecha, double descuento,String nombre,String domicilio,int documento) {
        this.numero = numero;
        this.fecha = fecha;
        this.detalles = new Detalle[10];
        this.descuento = descuento;
        this.cliente=new Cliente(nombre, domicilio, documento);
    }

public void agregardetalle(int cantidad,Producto producto){
this.detalles[i]=new Detalle(cantidad,producto);
i++;
}
   
   public double  sumasubtotales(){
  for(int i=0;i<detalles.length;i++){
      
 total+= this.detalles[i].calcularsubtotal();
 
  
  }
  total-=(total*this.descuento);
  return total;
   }
   public void imprimir(){
   }

    public int getFecha() {
        return fecha;
    }

    public Detalle[] getDetalles() {
        return detalles;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getIva() {
        return iva;
    }

    public double getTotal() {
        return total;
    }

    public String getPago() {
        return pago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getI() {
        return i;
    }

    
   
   
   
   
}
