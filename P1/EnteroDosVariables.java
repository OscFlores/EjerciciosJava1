package P1;
import java.util.Scanner;
public class EnteroDosVariables {
    Scanner f = new Scanner(System.in);
     public void DosVariables(){
         int x,y;
         System.out.println("Ingrese un número");
         x = f.nextInt();
         System.out.println("Ingrese otro número");
         y = f.nextInt();
         int Div = x/y;
         int Por = x%y;
         System.out.println("El Resultado de la Division es:"+Div);
         System.out.println("El Resultado del Porcentaje es:"+Por);
     }
}
