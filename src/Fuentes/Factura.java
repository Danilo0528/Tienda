package Fuentes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KIRITODANI
 */


import static Fuentes.Tienda.leer;
import java.util.ArrayList;
import java.util.Scanner;


public class Factura {
   private int numero, dia, mes, anio;
   private double totalFactura;
   private Fecha fecha;
   private Vendedor vendedor;
   private FormaPago formaPago;
   private ArrayList <DetalleFactura> detalleFactura;
   private Tienda miTienda;
    
    
    //constructor
    
   public Factura (int numero, Vendedor vendedor){
        this.numero = numero;
        this.vendedor = vendedor;
        detalleFactura = new ArrayList<>();

    }

    
    

    public Factura(int numero, double totalFactura, Fecha fecha, Vendedor vendedor, FormaPago formaPago, ArrayList<DetalleFactura> detalleFactura) {
        this.numero = numero;
        this.totalFactura = totalFactura;
        this.fecha = fecha;
        this.vendedor = vendedor;
        this.formaPago = formaPago;
        this.detalleFactura = detalleFactura;
        
    }
    
    
/*Un constructor que reciba un numero de factura y un vendedor. En fecha debe
generar una fecha de tipo date y luego con los valores definidos por el sistema,
generar internamente un objeto de tipo Fecha (Usar funciones para capturar el
dia, mes y año) y en detalleFactura asignarle un arrayList vacio.*/
    
  public Factura(int numero, Vendedor vendedor, int dia, int mes, int anio){
        this.numero = numero;
        this.vendedor = vendedor;
        this.detalleFactura = new ArrayList<>();
        this.fecha = new Fecha(dia, mes, anio);
    }
  
    public Factura(int numero, Vendedor vendedor, Fecha fecha){
        this.numero = numero;
        this.vendedor = vendedor;
        this.detalleFactura = new ArrayList<>();
        this.fecha = new Fecha();
        fecha.setDia(dia);
        fecha.setMes(mes);
        fecha.setAnio(anio);
        
    }
    
    
    
    //metodos get ans set
        public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public ArrayList<DetalleFactura> getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(ArrayList<DetalleFactura> detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    

    
        //metodo de clase
/*. Crear un metodo que se llame agregarDetalle, que reciba un objeto
DetalleFactura y utilice la función add del arrayList para adicionar el detalle a
atributo detalleFactura.*/
    
     //Metodo agregarDetalle
    public void agregarDetalle(DetalleFactura df){
        this.detalleFactura.add(df);
    }
    
    
/*Crear un metodo que se llame agregarFormaPago que reciba
como parámetros un objeto de tipo FormaPago
y que guarde dicho objeto en el atributo de la factura
llamado formaPago.*/
    

//Metodo agregarFormaPago
    public void agregarFormaPago(FormaPago fp){
        this.formaPago = fp;
    }

  
    @Override
    public String toString() {
        return "Factura{" + "numero=" + numero + ", totalFactura=" + totalFactura + ", fecha=" + fecha + ", vendedor=" + vendedor + ", formaPago=" + formaPago + ", detalleFactura=" + detalleFactura + '}';
    }
    
}
    

