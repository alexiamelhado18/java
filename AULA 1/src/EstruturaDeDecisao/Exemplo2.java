package EstruturaDeDecisao;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é positivo ou negativo: ");

        int numero = leitor.nextInt();


        if (numero > 0) {
            System.out.println("Positivo!");
        }
        else if(numero < 0){
            System.out.println("Negativo!");
        }
        else {
            System.out.println("Neutro!");
        }
    }
}
