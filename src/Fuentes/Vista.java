package Fuentes;


import static Fuentes.Tienda.leer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KIRITODANI
 */
public class Vista {
    
    /*private Tienda miTienda;

    public Vista(Tienda miTienda) {
        this.miTienda = miTienda;
    }

    public Tienda getMiTienda() {
        return miTienda;
    }

    public void setMiTienda(Tienda miTienda) {
        this.miTienda = miTienda;
    }

    
    public static void main (String [] args){
        Tienda tienda1 = new Tienda();
        tienda1.setNit(89845);
        tienda1.setNombre("Tienda Don Pepe");
        
        //Crear 3 vendedores
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setId(1);
        vendedor1.setNombre("Juan");
        Vendedor vendedor2 = new Vendedor();
        vendedor1.setId(2);
        vendedor1.setNombre("Enrrique");
        Vendedor vendedor3 = new Vendedor();
        vendedor1.setId(3);
        vendedor1.setNombre("Manuel");
        
       
        // Crear 5 productos
        //producto1
        Producto producto1 = new Producto();
        producto1.setCodigo(1020);
        producto1.setDescripsion("Leche");
        producto1.setPrecio(4500);
        //producto2
        Producto producto2 = new Producto();
        producto1.setCodigo(2012);
        producto1.setDescripsion("Ensalada de azucar");
        producto1.setPrecio(12000);
        //producto3
        
        Producto producto3 = new Producto();
        producto1.setCodigo(2017);
        producto1.setDescripsion("Arequipe");
        producto1.setPrecio(6000);
        
        
        //producto4
        Producto producto4 = new Producto();
        producto1.setCodigo(2022);
        producto1.setDescripsion("Coco");
        producto1.setPrecio(20000);
        
        
        //producto5
        Producto producto5 = new Producto();
        producto1.setCodigo(2040);
        producto1.setDescripsion("Atun");
        producto1.setPrecio(3000);
        
        
        
        //Crear los metodos de pago
        FormaPago metodoPago1 = new FormaPago();
        metodoPago1.setCodigo(0);
        metodoPago1.setDescripcion("Efectivo");
        // forma pago 2
        FormaPago metodoPago2 = new FormaPago();
        metodoPago1.setCodigo(1);
        metodoPago1.setDescripcion("Targeta Debito");
        //forma pago3
        FormaPago metodoPago3 = new FormaPago();
        metodoPago1.setCodigo(2);
        metodoPago1.setDescripcion("Targeta Credito");
        
        
        
        
        
        
        
    }

    @Override
    public String toString() {
        return "Vista{" + "miTienda=" + miTienda + '}';
    }

*/
private Scanner leer;
    private int numeroFactura;
    private Tienda miTienda;
   
    static ArrayList<Producto> productos = new ArrayList<>();
    static ArrayList<Vendedor> vendedores = new ArrayList<>();
    
    int opcion;
    
    public Vista(int nit, String nombre){
        this.miTienda = new Tienda(nit, nombre);
        this.leer = new Scanner(System.in);
        this.numeroFactura=100;
    }
    
    public void menu(){
       
        while (true){
            System.out.println("--------MENU PRINCIPAL-----");
            System.out.println("1. AGREGAR PRODUCTO");
            System.out.println("2. AGREGAR VENDEDOR");
            System.out.println("3. REALIZAR UNA VENTA");
            System.out.println("4. MOSTRAR TODAS LAS VENTAS");
            System.out.println("5. MONSTRAR EL VENDEDOR CON MAYOR VENTA");
            System.out.println("6. MOSTRAR LAS VENTAS DE UN VENDEDOR");
            System.out.println("7. MOSTRAR TODAS LAS VENTAS CON TARJETA DE CREDITO");
            System.out.println("8. SALIR");
            System.out.println("Digite una opción: ");
            opcion = leer.nextInt();
            this.leer.nextLine();
            
            switch (opcion) {
               case 1:
                   //Metodo crear producto-
                   miTienda.agregarProducto();
                   break;
               case 2:
                   //Metodo crear vendedor-
                   miTienda.agregarVendedor();
                   break;
               case 3: {
                   //crear factura (le damos los datos basicos de la factura y un arrayList vacio de detalle)
                   //llamar metodo agregarDetalles... menu para agregar productos de la factura.
                   System.out.println("-------------------------Tienda Don Pepe------------------------");
                   System.out.println("--------------" + this.miTienda.getNombre() + "-------------------");
                   System.out.println("------------------" + this.miTienda.getNit() + "-----------------");
                   System.out.println("-------------------- " + (new Date()) + "-------------------");
                   System.out.println("_________________________________________________________________________");
                   System.out.println("--------------------Listado de vendedores-------------------");
                   for (Vendedor v : this.miTienda.getListaVendedor()) {
                       System.out.println(v.toString());
                   }
                   System.out.println("Ingrese el codigo del vendedor: ");
                   int cven = leer.nextInt();
                   this.leer.nextLine();
                   Vendedor ven = this.miTienda.buscarVendedor(cven);
                   if (ven == null) {
                       System.out.println("El vendedor no existe!!");
                   }
                   int numeroFactura = 100 + this.miTienda.getListaFactura().size();
                   Factura factura = new Factura(numeroFactura, ven);
                   System.out.println("Debe ingresar la fecha (DD/MM/AAAA) a continuación:");
                   System.out.print("Dia: ");
                   int dia = leer.nextInt();
                   leer.nextLine();
                   System.out.print("Mes: ");
                   int mes = leer.nextInt();
                   leer.nextLine();
                   System.out.print("Anio: ");
                   int anio = leer.nextInt();
                   leer.nextLine();
                   factura.setFecha(new Fecha(dia, mes, anio));
                   int resp = 0;

                   do {
                       System.out.println(".............Listado de Productos............");
                       for (Producto p : this.miTienda.getListaProducto()) {
                           System.out.println(p.toString());
                       }
                       System.out.println("Ingrese el codigo del producto a comprar: ");
                       int pr = this.leer.nextInt();
                       this.leer.nextLine();
                       Producto prod = this.miTienda.buscarProducto(pr);
                       System.out.println("Ingrese la cantidad del producto a comprar: ");
                       int can = this.leer.nextInt();
                       this.leer.nextLine();
                       double total = can * prod.getValorUnitario();
                       factura.setTotalFactura(total + factura.getTotalFactura());
                       DetalleFactura df = new DetalleFactura(prod, can);
                       factura.agregarDetalle(df);
                       System.out.println("Digite 0 para continuar registrando productos o 1 para salir");
                       resp = this.leer.nextInt();
                       this.leer.nextLine();

                   } while (resp == 0);
                   
                   System.out.println("..................Listado de Medios de pago.................");

                   for (FormaPago iterador : this.miTienda.getListaFormaPago()) {
                       System.out.println(iterador);
                   }

                   System.out.println("Digita la forma de pago: ");
                   int fpago = leer.nextInt();
                   leer.nextLine();
                   FormaPago fp=miTienda.buscarFormaPago(fpago);
                   if (fp==null){
                       System.out.println("Forma de pago no existe!!!");
                       break;
                   }
                   factura.setFormaPago(fp);
                   
                   miTienda.agregarFactura(factura);
                   break;
               }
                case 4:
                    //Metodo mostrar ventas-
                    mostrarVentas();
                    break;
                case 5:
                    //Metodo vendedor con mayor venta-
                    //recorrer el array de facturas e ir validando la mayor venta!!
                    Vendedor venM = vendedorMayorVenta();
                    System.out.println("ID del vendedor  -> " + venM.getId());
                    System.out.println("El nombre del vendedor -> " + venM.getNombre());
                    break;
                case 6: {
                    //Metodo mostrar ventas de un vendedor-
                    //pedir el codigo del vendedor y recorrer el array para ver sus ventas!!
                    for (Vendedor v : this.miTienda.getListaVendedor()) {
                       System.out.println(v.toString());
                    }
                    System.out.println("Ingrese el codigo del vendedor: ");
                    int cven = leer.nextInt();
                    this.leer.nextLine();
                    for (var venta : ventasPorVendedor(cven)) {
                        imprimirFactura(venta);
                    }
                   break;
                }
                case 7:
                    //Metodo mostrar todas las ventas con TC-
                    //Recorrer el array de facturas y mostrar las que tengan forma de pago TC!!!
                    for (var venta : ventasConTarjeta()) {
                        imprimirFactura(venta);
                    }
                    break;
                case 8:
                    return  ;
                default:
                    System.out.println("Error!! opción no se encuentra en el menú");
                    break;
            }
        }  
    } 
    
    public void imprimirFactura(Factura factura) {
        System.out.println("Factura N°: " + factura.getNumero());
            System.out.println("Fecha: " + factura.getFecha());
            System.out.println("Vendedor: " + factura.getVendedor().getNombre());
            System.out.println("Forma de Pago: " + factura.getFormaPago().getDescripcion());
            System.out.printf("| %-4s | %-20s | %-5s | %-10s | %-10s |\n", "Cod.", "Descripción", "Cant.", "Valor Unt.", "Subtotal");
            for (var detalle : factura.getDetalleFactura()) {
                System.out.printf(
                        "| %4d | %-20s | %5d | %10.2f | %10.2f |\n",
                        detalle.getProducto().getCodigo(),
                        detalle.getProducto().getDescripcion(),
                        detalle.getCantidad(),
                        detalle.getProducto().getValorUnitario(),
                        detalle.getSubtotal());      
            }
            System.out.println("Total Factura -> " + factura.getTotalFactura());
    }
      
    public void mostrarVentas() {
        for (var venta : this.miTienda.getListaFactura()) {
            imprimirFactura(venta);
        }
    }
    
    public Vendedor vendedorMayorVenta(){
        double facturaMayor=0.0;
        Vendedor ven = new Vendedor();
        if (this.miTienda.getListaFactura().isEmpty()) {
            System.out.println("No se han registrado ventas hasta el momento!!!");
        } else for (var venta: this.miTienda.getListaFactura()){
            if (facturaMayor< venta.getTotalFactura()){
                facturaMayor = venta.getTotalFactura();
                ven = venta.getVendedor();
            }
        }
        return ven;
    }
    
    public ArrayList<Factura> ventasPorVendedor(int id){
        ArrayList<Factura> ventas = new ArrayList<>();
        for (var venta: this.miTienda.getListaFactura()){
            if (venta.getVendedor().getId() == id){
                ventas.add(venta);
            }
        }
        return ventas;
    }
    
    public ArrayList<Factura> ventasConTarjeta(){
        ArrayList<Factura> ventas = new ArrayList<>();
        for (var venta: this.miTienda.getListaFactura()){
            if (venta.getFormaPago().getId() == 2){
                ventas.add(venta);
            }
        }
        return ventas;
    }
    
    
    
    

    
    
    
    

    
    
    
            
    
    
}
