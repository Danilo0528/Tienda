package Fuentes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KIRITODANI
 */
public class Producto {
    public int codigo;
    public String descripcion;
    public double valorUnitario;

    //Constructores sobrecargados
    public Producto() {
        
    }   
    
    
    public Producto(int c,String d, double v){
        this.codigo = c;
        this.descripcion = d;
        this.valorUnitario = v;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    
 
    @Override
    public String toString(){
        return "Codigo: " + this.codigo + "Descripcion: " + this.descripcion + "Valor unitario: " + this.valorUnitario;
    }
    
    
    
    
    
}
