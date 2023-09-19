import java.util.Locale;
import java.util.Scanner;

public class Ex_negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números voce vai digitar: ");
        int n = sc.nextInt(); //Ler quantidades de números a serem digitados. 

        int[] vect = new int[n]; //Vetores irão ter EX: 6 elementos. Começando no indice 0

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt(); //Receber os valores digitados. 
        }
        //? NUMEROS NEGATIVOS
        System.out.println("NÚMEROS NEGATIVOS");
         for (int i = 0; i < n; i++) {
            if (vect[i] < 0) { //Vect na posição i for menor que 0
                System.out.println(vect[i]);
            }
         }

        sc.close();
    }
}
