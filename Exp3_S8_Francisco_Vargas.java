
package exp3_s8_francisco_vargas;

import java.util.Scanner;
import java.util.ArrayList;

public class Exp3_S8_Francisco_Vargas {

    
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        ArrayList <Object>  asientos = new ArrayList<>();
        ArrayList <String> informacion= new ArrayList<>();
        String[] info={"Descuento estudiante 10%","descuento tercera edad 15%","Entrada General: $10000"};
        int entrada=10000;
        double total=0.0;
        int opcion=0;
        int opcion2=0;
        int opcion3=0;
        Boolean opcion4=false;
        double estudiante=0.90;
        double terceraEdad= 0.85;
        String nombres="";
        String lugarAsientos="1 2 3\n4 5 6\n7 8 9\n";
        String asiento="";
        String nuevoAsiento="";
        System.out.println("BIENVENIDOS AL CAFE MORO");
        do{
            
        System.out.println("Presione \n1. Venta de asientos");
        System.out.println("2. Actualizar informacion");
        System.out.println("3. Reserva de asientos");
        System.out.println("4.Informacion de Promociones");
        System.out.println("5.Salir");
         opcion= scanner.nextInt();
         scanner.nextLine();
            
         
            switch (opcion){
                case 1 :
                    
                    System.out.println("---Venta de asientos---");
                    if (opcion4==true) {
                System.out.println("---BOLETA---");
                   for (int i = 0; i < asientos.size(); i++) {
                   
                    System.out.println(informacion.get(i)+": "+asientos.get(i));
                       
                          }
                   System.out.println("Su Reserva a sido efectiva");
                   opcion4=false;
                   informacion.remove("ID Asiento");
                   informacion.remove("Valor Total");
                   informacion.remove("Nombre");
                   asientos.remove(asiento);
                   asientos.remove(total);
                   asientos.remove(nombres);
                   break;
            }
                    
                     
                    System.out.println(lugarAsientos);     
                    System.out.println("Seleccione su asiento");
                     asiento =scanner.nextLine();
                    
            
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
                        
                         
                        
                             System.out.println("---BOLETA---");
                             for (int i = 0; i < asientos.size(); i++) {
                                 
                            
                            System.out.println(informacion.get(i)+": "+asientos.get(i));
                          }
                    
                            informacion.remove("ID Asiento");
                            informacion.remove("Valor Total");
                            informacion.remove("Nombre");
                            asientos.remove(asiento);
                            asientos.remove(total);
                            asientos.remove(nombres);
                             System.out.println("...Redirigiendo al menu principal...");
                    
                        
                       
                    break;
                case 2:
                     
                    
                     System.out.println("---Actualizar Informacion---");
                    if (asientos.isEmpty()) {
                        System.out.println("Reserve un asiento para poder Actualizar");
                        
                        break;
                    }
                    System.out.println("");
                    System.out.println("---Actualizacion de asientos---");
                    System.out.println("");
                    System.out.println("Ingrese el asiento a modificar");
                    String numeroAsiento= scanner.nextLine();
                      
                    int indexActualizar = asientos.indexOf(numeroAsiento);
                        
                    if (indexActualizar!=-1) {

                       do{
                       System.out.println("Ingrese un nuevo asiento");
                       System.out.println(lugarAsientos);
                        nuevoAsiento=scanner.nextLine();
                           if (asientos.contains(nuevoAsiento)) {
                               System.out.println("Asiento no disponible");
                               
                           }
                       }while(asientos.contains(nuevoAsiento));
                      
                        asientos.set(indexActualizar, nuevoAsiento);
                        System.out.println("Asiento actualizado ");
                        System.out.println("Nuevo Asiento: "+asientos.get(indexActualizar));
                        
                   }else {
                        System.out.println("Asiento no encontrado");
                        }
                    break;
                case 3:
                    
                    System.out.println("---Reserva de asientos---");
                    System.out.println(lugarAsientos);
             do{
                    System.out.println("Seleccione su asiento");
                    asiento =scanner.nextLine();
                    if (asientos.contains(asiento)) {
                        System.out.println("Asiento no disponible");
                        
                    }
            }while(asientos.contains(asiento));
                    
                    
            
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
                         System.out.println("para pagar presione 1 para hacer efectiva su reserva primero presione  2 para volver al menu principal");
                         
                         opcion3=scanner.nextInt();
                         }while(opcion3>2 || opcion3<1);
                         
                         if (opcion3==1) {
                             System.out.println("---BOLETA---");
                             for (int i = 0; i < asientos.size(); i++) {
                            
                            System.out.println(informacion.get(i)+": "+asientos.get(i));
                            
                                 
                          }
                    }  else if(opcion3==2){
                             System.out.println("Redirigiendo al menu principal...");
                             opcion4=true;
                    }
                   break;
                case 4:
                    
                    
                    System.out.println(info[0]);
                    System.out.println(info[1]);
                    System.out.println(info[2]);
                    break;
                case 5:
                  
            }
        
        
        }while( opcion !=5);
         
    }
    
}
