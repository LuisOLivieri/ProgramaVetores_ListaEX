import java.util.Locale;
import java.util.Scanner;

public class Ex_Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitas: ");
        int n = sc.nextInt(); //Leitura de quantas pessoas serão digitadas.

        //*CRIAR 3 VETORES PARA GUARDAR NOME, ALTURA E IDADE
        String[] nomes = new String[n]; //(N) devido as números de vetores que serão criados. 
        int[] idade = new int[n]; //(N) devido as números de vetores que serão criados
        double[] alturas = new double[n]; //(N) devido as números de vetores que serão criados

        //*LEITURAS DOS VETORES
        for (int i = 0; i < n; i++){
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.println("Nome: ");
            nomes[i] = sc.next(); //Nome da primeira pessoa na posição i = 0

            System.out.println("Idade: ");
            idade[i] = sc.nextInt(); //Idade da primeira pessoa na posição i = 0

            System.out.println("Altura: ");
            alturas[i] = sc.nextDouble(); //Altura da primeira pessoa na posição i = 0
        }
        //*SOMA DOS VALORES
        double soma = 0.0;
        for (int i = 0; i < n; i++){ //For para percorrer todas as posiçoes
            soma = soma + alturas[i]; //Soma as alturas acumulando na variável soma
        }
        double mediaAlturas = soma / n;
        System.out.println();
        System.out.printf("A média das alturas é de: %.2f%n", mediaAlturas);

        //*CONTADOR DE PESSOAS (-16)
        int cont = 0; //Conta quantas pessoas tem menos de 16 anos. 
        for (int i = 0; i < n; i++) { //For para percorrer todas as posiçoes
            if(idade[i] < 16) { //Percorrer os vetores 
                cont = cont + 1; //Se achar menores de 16, ele passa a vale 1... 
            }
        }

        //*PORCENTAGEM
        double percent = cont * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        //*IMPRIMIR PESSOAS COM MENOS DE (16)
        for (int i = 0; i < n; i++) {
            if(idade[i] < 16) { //Percorre os menores de 16
                System.out.println(nomes[i]); //Imprime o nome que está condição, na posicao i;  
            }
        }


        sc.close();
    }
}
