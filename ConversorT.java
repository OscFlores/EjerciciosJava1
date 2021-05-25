import java.util.Scanner;
public class ConversorT {
    Scanner sn = new Scanner(System.in);
     public void Convert(){
         double segundos;
         System.out.println("Ingrese la Cantidad a Convertir");
         segundos = sn.nextInt();
         System.out.println("EL Equivalente de Segundos a Minutos seria: "+segundos/60+" minutos");
         System.out.println("El Equivalente de Segundos a Horas seria: "+segundos/3600+" horas");
     }    
}
