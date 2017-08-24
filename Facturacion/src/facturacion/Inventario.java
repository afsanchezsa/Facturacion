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
public class Inventario {
    private int cantidadcomprada;
    private Producto producto;

    public Inventario(int cantidadcomprada, Producto producto) {
        this.cantidadcomprada = cantidadcomprada;
        this.producto = producto;
    }
    
    public void reducirinventario(int cantidadcomprada){
    this.producto.reduceunidades(cantidadcomprada);
    }
}
