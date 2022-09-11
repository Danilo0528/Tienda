package Fuentes;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KIRITODANI
 */
public class Tienda {
    private int nit;
    private String nombre;
    public ArrayList<Producto> listaProducto = new ArrayList<Producto>();
    public ArrayList<Vendedor> listaVendedor = new ArrayList<Vendedor>();
    private ArrayList<Factura> listaFactura = new ArrayList<Factura>();
    private ArrayList<FormaPago> listaFormaPago = new ArrayList<FormaPago>();
    private Date date;
    
    public static Scanner leer;
    

    
    

    public Tienda(int nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
        listaFormaPago= new ArrayList<>();
        listaFormaPago.add(new FormaPago(0, "Efectivo"));
        listaFormaPago.add(new FormaPago(1, "Tarjeta debito"));
        listaFormaPago.add(new FormaPago(2, "Tarjeta credito"));
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ArrayList<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public ArrayList<Vendedor> getListaVendedor() {
        return listaVendedor;
    }

    public void setListaVendedor(ArrayList<Vendedor> listaVendedor) {
        this.listaVendedor = listaVendedor;
    }

    public ArrayList<Factura> getListaFactura() {
        return listaFactura;
    }

    public void setListaFactura(ArrayList<Factura> listaFactura) {
        this.listaFactura = listaFactura;
    }

    public ArrayList<FormaPago> getListaFormaPago() {
        return listaFormaPago;
    }

    public void setListaFormaPago(ArrayList<FormaPago> listaFormaPago) {
        this.listaFormaPago = listaFormaPago;
    }   

    @Override
    public String toString() {
        return "Tienda{" + "nit=" + nit + ", nombre=" + nombre + '}';
    }
    //metodo buscarVendedor
    public Vendedor buscarVendedor(int codigoVendedor){
        
        for (Vendedor iterador: listaVendedor){
            if (codigoVendedor == iterador.getId())
                return iterador;
        }
        return null;
    }
    
        //metodo buscarProducto
    public Producto buscarProducto(int codigoProducto){
        for (Producto iterador: listaProducto){
           if (codigoProducto == iterador.getCodigo())
               return iterador;
        }
        return null;
        
    }
    
    public void agregarVendedor(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ID VENDEDOR");
        int idVendedor = teclado.nextInt();
        teclado.nextLine();
        System.out.println("NOMBRE DEL VENDEDOR");
        String nombreVendedor = teclado.nextLine();
        Vendedor aux = new Vendedor(idVendedor, nombreVendedor);
        listaVendedor.add(aux);
        System.out.println("El vendedor se agrego correctamente!!!");
        //System.out.println(listaVendedor);
           
    }
    
        public void agregarProducto(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("CODIGO DEL PRODUCTO");
        int codProducto = teclado.nextInt();
        System.out.println("DESCRIPCION DEL PRODUCTO");
        teclado.nextLine();
        String desProducto = teclado.nextLine();
        System.out.println("VALOR DEL PRODUCTO");
        double valProducto = teclado.nextDouble();
        Producto p = new Producto(codProducto, desProducto, valProducto);
        listaProducto.add(p);
        System.out.println("El producto se agrego correctamente!!!");
   
    }
        
       public void agregarFactura(Factura f){
        listaFactura.add(f);
    }
    
    //metodo buscarFormaPago
    public FormaPago buscarFormaPago(int codigo){
        for (var iterador: listaFormaPago){
           if (codigo == iterador.getId())
               return iterador;
        }
        return null;
    }
    
    

   
    
    
}
