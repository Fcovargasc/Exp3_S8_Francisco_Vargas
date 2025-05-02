
package exp3_s8_francisco_vargas;

import java.util.Scanner;
import java.util.ArrayList;

public class Exp3_S8_Francisco_Vargas {

    
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        ArrayList <Object>  asientos = new ArrayList<>();
        ArrayList <String> informacion= new ArrayList<>();
        int entrada=10000;
        double total=0.0;
        int opcion=0;
        int opcion2=0;
        int opcion3=0;
        Boolean opcion4=false;
        int opcion5=0;
        double estudiante=0.90;
        double terceraEdad= 0.85;
        String nombres="";
        String lugarAsientos="1 2 3\n4 5 6\n7 8 9\n";
        int asientosDisponibles=9;
        int asiento=0;
        System.out.println("BIENVENIDOS AL CAFE MORO");
        do{
            
        System.out.println("Presione \n1. Venta de asientos");
        System.out.println("2. Actualizar informacion");
        System.out.println("3. Reserva de asientos");
        System.out.println("4.Informacion de Promociones");
        System.out.println("5.Salir");
         opcion= scanner.nextInt();
         scanner.nextLine();
            
         //1. venta de asientos 2.actualizar informacion 3. reserva de asientos 4.info de promociones why not 5.salir
            switch (opcion){
                case 1 :
                    System.out.println("---Venta de asientos---");
                    if (opcion4==true) {
                System.out.println("---BOLETA---");
                   for (int i = 0; i < asientos.size(); i++) {
                    //System.out.println((i+1)+"."+nombres.get(i)+ "- $"+precios.get(i));
                    System.out.println(informacion.get(i)+": "+asientos.get(i));
                       System.out.println("Su Reserva a sido efectiva");
                          }break;
            }
                    
                    for (int i = 1; i <= asientosDisponibles; i++) {
                    
                System.out.print(i + " ");
                if (i % 3 == 0) {
                    System.out.println();
                }
            } do{
                    System.out.println("Seleccione su asiento");
                     asiento =scanner.nextInt();
                    
            }while(asiento<1 || asiento>9);
                    asientos.add(asiento);
                    informacion.add("ID Asiento");
                    do{              
                    System.out.println("Tiene descuento?");
                    System.out.println("Precione 1. Para Estudiante");
                    System.out.println("Precione 2. Para Tercera edad");
                    System.out.println("Precione 3. Para Publico general");        
                     opcion2 = scanner.nextInt();
                    }while(opcion2<1 || opcion2>3);
                        if (opcion2==1) {
                            System.out.println("Su descuento es del 10%");
                            total=entrada*estudiante;
                    }   else if(opcion2==2){
                            System.out.println("Su descuento es del 15%");
                            total=entrada*terceraEdad;
                    }   else if (opcion2==3){
                            System.out.println("No tiene descuento");
                            total=entrada;
                    }
                        informacion.add("Valor Total");
                        asientos.add(total);
                        
                        System.out.println("Introdusca su nombre y apellido");
                        scanner.nextLine();
                          nombres =scanner.nextLine();
                          
                         informacion.add("Nombre");
                         asientos.add(nombres);
                         do{
                         System.out.println("para pagar presione 1 para volver al menu principal precione 2");
                         opcion3=scanner.nextInt();
                         }while(opcion3>2 || opcion3<1);
                         
                         if (opcion3==1) {
                             System.out.println("---BOLETA---");
                             for (int i = 0; i < asientos.size(); i++) {
                            //System.out.println((i+1)+"."+nombres.get(i)+ "- $"+precios.get(i));
                            System.out.println(informacion.get(i)+": "+asientos.get(i));
                          }
                    }   else if (opcion3==2){
                            informacion.remove("ID Asiento");
                            informacion.remove("Valor Total");
                            informacion.remove("Nombre");
                            asientos.remove(asiento);
                            asientos.remove(total);
                            asientos.remove(nombres);
                             System.out.println("Redirigiendo al menu principal...");
                    }
                        
                       
                    break;
                case 2:
                    System.out.println("---Actualizar Informacion---");
                    if (asientos.isEmpty()) {
                        System.out.println("Primmero compre o reserve un asiento para poder Actualizar");
                        break;
                    }
                    
                    System.out.println("---Actualizacion de asientos---");
                    System.out.println("Ingrese el asiento a modificar");
                    int numeroAsiento= scanner.nextInt();
                        //obtenemos el indice del elemento
                    int indexActualizar = asientos.indexOf(numeroAsiento);
                        
                    if (indexActualizar!=-1) {
                       System.out.println("Ingrese un nuevo asiento");
                       System.out.println(lugarAsientos);
                       int nuevoAsiento=scanner.nextInt();
                       //actualiza el elemento
                        asientos.set(indexActualizar, nuevoAsiento);
                        System.out.println("Asiento actualizado ");
                        
                   }else {
                        System.out.println("Asiento no encontrado");
                        }
                        
                    
                    break;
                case 3:
                    System.out.println("---Reserva de asientos---");
                    for (int i = 1; i <= asientosDisponibles; i++) {
                    
                System.out.print(i + " ");
                if (i % 3 == 0) {
                    System.out.println();
                }
            } do{
                    System.out.println("Seleccione su asiento");
                     asiento =scanner.nextInt();
                    
            }while(asiento<1 || asiento>9);
                    asientos.add(asiento);
                    informacion.add("ID Asiento");
                    do{                    
                    System.out.println("Tiene descuento?");
                    System.out.println("Precione 1. Para Estudiante");
                    System.out.println("Precione 2. Para Tercera edad");
                    System.out.println("Precione 3. Para Publico general");        
                     opcion2 = scanner.nextInt();
                    }while(opcion2<1 || opcion2>3);
                        if (opcion2==1) {
                            System.out.println("Su descuento es del 10%");
                            total=entrada*estudiante;
                    }   else if(opcion2==2){
                            System.out.println("Su descuento es del 15%");
                            total=entrada*terceraEdad;
                    }   else if (opcion2==3){
                            System.out.println("No tiene descuento");
                            total=entrada;
                    }
                        informacion.add("Valor Total");
                        asientos.add(total);
                        
                        System.out.println("Introdusca su nombre y apellido");
                        scanner.nextLine();
                          nombres =scanner.nextLine();
                          
                         informacion.add("Nombre");
                         asientos.add(nombres);
                         do{
                         System.out.println("para pagar presione 1 para volver al menu principal precione 2");
                         opcion3=scanner.nextInt();
                         }while(opcion3>2 || opcion3<1);
                         
                         if (opcion3==1) {
                             System.out.println("---BOLETA---");
                             for (int i = 0; i < asientos.size(); i++) {
                            //System.out.println((i+1)+"."+nombres.get(i)+ "- $"+precios.get(i));
                            System.out.println(informacion.get(i)+": "+asientos.get(i));
                          }
                    }  else if(opcion3==2){
                             System.out.println("Redirigiendo al menu principal...");
                             opcion4=true;
                    }
                   break;
                case 4:
                    
                    System.out.println("Descuento estudiante 10%");
                    System.out.println("descuento tercera edad 15%");
                    System.out.println("Entrada General: $10000");
                    break;
                case 5:
                    break;
            }
        
        
        }while( opcion !=5);
        
    }
    
}
