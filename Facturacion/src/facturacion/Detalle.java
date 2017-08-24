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
public class Detalle {
    private int cantidadproductos;
    private Producto producto;

    public Detalle(int cantidadproductos, Producto producto) {
        this.cantidadproductos = cantidadproductos;
        this.producto = producto;
    }
    
    public double calcularsubtotal(){
    return (this.producto.getPrecio()*cantidadproductos)-this.producto.getPrecio()*this.producto.getImporte();
    }
}
