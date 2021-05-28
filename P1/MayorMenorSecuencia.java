package P1;
import java.util.Scanner;
public class MayorMenorSecuencia {
    Scanner sn = new Scanner(System.in);
    public void Secuencia(){
        int maximo;
        int minimo;
        int matriz [] = new int [9];
        for (int x=0; x < matriz.length; x++){
                System.out.println("Introduzca 9 digitos");
                matriz[x] = sn.nextInt();   
                maximo = matriz[0];
                minimo = matriz[0];
                for(int valor: matriz){
                    if(valor > maximo){
                        maximo = valor;
                    }
                    if(valor < minimo){
                        minimo = valor;
                    }
                }
                System.out.println("El Valor Maximo es: "+maximo);
                System.out.println("El Valor Minimo es: "+minimo);
            } 
        }
    }
    

