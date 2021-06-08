package P1;
import java.util.Scanner;
public class ConstantePi{
    Scanner sn = new Scanner(System.in);
    public void Calcular(){
        System.out.println("Ingrese cuantos terminos de precision desea");
        int n = sn.nextInt();

        System.out.println("pi =" + pi(n));
    }
    public static double pi(int n){
        int d = 1, sig = 1;
        double t, s=0; 
        for(int i=1; i <= n; i++){
            t=(double)1/d*sig;
            s += t;
            d+= 2;
            sig *= -1;
        }
     return s*4; 
    }
}

