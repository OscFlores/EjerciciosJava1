package P1;
import java.util.Scanner;
public class IngresarFecha {
    Scanner sn = new Scanner(System.in);
  public void Ingreso(){
    int dia,mes,anio,cantidad,d,f,h; 
    System.out.println("Ingrese un Dia");
    dia = sn.nextInt();
    System.out.println("Ingrese un Mes");
    mes = sn.nextInt();
    System.out.println("Ingrese un Año");
    anio = sn.nextInt();
    cantidad = dia * mes;
    d = anio / 4;
    f= 0;
    if (d  % 2 == 0 ){
        f += 5; 
    }else{
        f += 4;
    }
    h = cantidad + f;
    System.out.println("El numero de dia es: "+h);
  } 
}   
