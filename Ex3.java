package Atividades.Prova1;
import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        int valor = entrada.nextInt();

        if (valor%2 == 0) {
            System.out.println("O valor" + valor + " é par");
        

        }else{
            System.out.println("O valor " + valor + " é impar");


            System.out.println("Explicação: Fiz o módulo de 2, se o resto era 0 é par, caso contrário é impar");

        
    }
    }
     
}

        
    
    
    

