import java.util.Scanner;
public class FuncionMath {
    public void FuMath(){
        double a,b,c,d,x,y,z,m,n;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 Numeros");
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();
        m = s.nextInt();
        n = s.nextInt();
        System.out.println("a:"+((x/y)+1));
        System.out.println("b:"+((x+y)/(x-y)));
        System.out.println("c:"+(((x+(y/z))/(x-(y/z)))));
        System.out.println("d:"+(b/(c+d)));
        System.out.println("e:"+(a+b)*(c/d));
        System.out.println("f:"+(a+b)*(a+b)*(a+b)*(a+b));
        System.out.println("g:"+((x*y)/(1-(4*x))));
        System.out.println("h:"+((x*y)/(m*n)));
        System.out.println("i:"+((x+y)*(x+y)*(a-b)));
        s.close();
    }
}
