import java.util.Scanner;
public class EcuacionesLineales {
   Scanner sn = new Scanner(System.in);
   public void EjecutarEcuaciones(){
       double x,y,a,b,c,d,e,f;
       System.out.println("Encontrar el valor de x & y");
       System.out.println("x = ce - bf   ;  y = af - cd");
       System.out.println("    -------          --------");
       System.out.println("    ae - bd   ;      ae - bd");
       System.out.println("Ingrese el valor de a");
       a = sn.nextInt();
       System.out.println("Ingrese el valor de b");
       b = sn.nextInt();
       System.out.println("Ingrese el valor de c");
       c = sn.nextInt();
       System.out.println("Ingrese el valor de d");
       d = sn.nextInt();
       System.out.println("Ingrese el valor de e");
       e = sn.nextInt();
       System.out.println("Ingrese el valor de f");
       f = sn.nextInt();
       x = ( ((c*e)-(b*f))/((a*e)-(b*d))   );
       y = ( ((a*f)-(c*d))/((a*e)-(b*d))   );
       System.out.println("El valor de x es: "+x);
       System.out.println("El valor de y es: "+y);    
   }    
}
