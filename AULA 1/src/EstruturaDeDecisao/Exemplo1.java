package EstruturaDeDecisao;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //print ln -
        //print -

        System.out.println("Digite seu salario: "); //só exibe - console.log

        //variável do tipo double
        //método nextLine le a próxima linha
        //double salário = Double.parseDouble(leitor.nextLine());

        //não precisa converter com o método nextDouble
        double salario = leitor.nextDouble();

        if (salario < 1000){
            double novoSalario = salario * 1.1;

            System.out.println(novoSalario);
        }else {
            System.out.println("Salário sem reajuste");
        }
    }
}
