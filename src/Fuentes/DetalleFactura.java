package Fuentes;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KIRITODANI
 */
public class DetalleFactura {
    private Producto producto;
    private int cantidad;
    
    public DetalleFactura() {
    }

    public DetalleFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "producto=" + producto + ", cantidad=" + cantidad + '}';
    }
    
    public double getSubtotal(){
        return this.cantidad* producto.getValorUnitario();
    }
    
            
}
