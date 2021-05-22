import java.util.InputMismatchException;
import java.util.Scanner;
public class Menu {
    public void Menus(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
         while (!salir) {
             System.out.println("\n Bienvenido al Menu Principal \n");
             System.out.println("1) HolaMundo");
             System.out.println("2) FuncionMath");
             System.out.println("3) Garage");
             System.out.println("4) Pistas");
             System.out.println("5) Estadisticas y Reportes");
             System.out.println("6) Salir");
             try {
                 System.out.println("Escribe una de las opciones");
                 opcion = sn.nextInt();
                 switch (opcion) {
                     case 1:
                            Hola();
                         break;
                     case 2:
                         System.out.println("Bienvenido a las Funciones Math");
                            Mat();
                         break;
                     case 3:
                         System.out.println("Bienvenido a Garage");
                         
                         break;
                     case 4:
                         System.out.println("Pistas");
                         break;
                     case 5:
                         System.out.println("Estadisticas y Reportes");
                         break;
                     case 6:
                         salir = true;
                         break;
                     default:
                         System.out.println("Esa opcion no existe");
                 }
             } catch (InputMismatchException e) {
                 System.out.println("Debes insertar un número");
                 sn.next();
                 sn.close();
             }
         }
    }
    public void Hola(){
        HolaMundo h = new HolaMundo();
        h.Hola();
    }
    public void Mat(){
        FuncionMath m = new FuncionMath();
        m.FuMath();
    }
}
