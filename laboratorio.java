import java.util.Scanner;
 
public class laboratorio{
 
     
    public static void main(String[] args) {
         
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
        String cadena1 = ""; 
        String cadena2 = ""; 
         String cadena3 = ""; 
       while(!salir){
            
           System.out.println("1. Ingresar cadenas de caracteres");
           System.out.println("2.Mostrar caracter y su posicion dentro de la cadena");
           System.out.println("3.Division de numeros reales");
           System.out.println("4.Salir");
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                   System.out.println("Por favor ingrese una cadena de caracteres");
              cadena1 = sn.nextLine();
              cadena2 = sn.nextLine();
              cadena3 = sn.nextLine();
                 
                 String union;
                 union = cadena1+cadena2+cadena3;
                 System.out.println(union);               

                break;
               case 2:
                   System.out.println("Haz seleccionado la opcion de visualizacion de caracteres");
                 float length = cadenas.length();
                  System.out.println("La longitud de una cadena es:" + longitud);                  
                   System.out.println("La longitud de una cadena es:" + cadena2.length());
                    System.out.println("La longitud de una cadena es:" + cadena3.length());
                break;
                 
                case 3:
                String cadena1= " ";
                String cadena2 = " "; 
                String cadena3 = " ";

                System.out.println(cadena1.charAt());
                System.out.println(cadena2.charAt());
                System.out.println(cadena3.charAt());
                break;
                   case 4:
                   float numero1 = 0;
                   float numero2 = 0;
                   float resultado;
               Scanner reader = new Scanner (System.in);
                System.out.println("Ingrese el primer numero:");
                numero1 = reader.nextFloat();
               
                System.out.println("Ingrese el segundo numero:");
                numero2 = reader.nextFloat();

                resultado = numero1/numero2;
                System.out.println("La division es " + numero1 + " / " + numero2 + " = " + resultado);
                break;
                case 5:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
            
       }
        
    }
          
}
              


