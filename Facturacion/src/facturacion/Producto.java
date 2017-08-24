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
public class Producto {
    private double precio;
    private int unidadesdisponibles;
    private double importe;

    public Producto(double precio, double importe) {
        this.precio = precio;
        this.importe = importe;
        this.unidadesdisponibles=10;
    }

    public double getPrecio() {
        return precio;
    }

    public int contarinventario() {
        return unidadesdisponibles;
    }

    public double getImporte() {
        return importe;
    }

    public void reduceunidades(int unidadescompradas) {
        this.unidadesdisponibles -= unidadescompradas;
    }
    
    
}
