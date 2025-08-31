package compras;

import java.util.Scanner;
public class Compras {
    
    public static void main(String[] args) {               
        String vendedor;        
        double compra1,compra2,compra3,total_compra,prom_compra;        
        Scanner lectura =new Scanner(System.in);         
        System.out.print("Ingrese nombre del vendedor : ");
        vendedor = lectura.next();        
        System.out.print("Ingrese 1ra Compra :" );
        compra1 =lectura.nextDouble();
        System.out.print("Ingrese 2da Compra: " );
        compra2 =lectura.nextDouble();
        System.out.print("Ingrese 3ra Compra :" );
        compra3 =lectura.nextDouble();        
        total_compra=compra1+compra2+compra3;
        prom_compra=total_compra/3;        
        System.out.println("Compra 1: " + compra1);
        System.out.println("Compra 2: "  + compra2);
        System.out.println("Compra 3: " + compra3);
        System.out.println("total Compra: " + total_compra);
        System.out.println("Promedio de compras: " + prom_compra);       
    }
    
}
