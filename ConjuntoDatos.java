import java.util.Scanner;
public class ConjuntoDatos {
    Scanner sn = new Scanner(System.in);
    public void Datos(){
        int a;
        System.out.println("Ingrese la lonitud de la serie");
        a = sn.nextInt();
        for(int contador = 1; contador<=a;contador++){
            System.out.println(contador);
            
        }
    } 
}