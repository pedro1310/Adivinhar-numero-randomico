import java.util.Scanner;
import java.util.Random;

public class Exercicios {
    public static void main(String[] args) {

        //SCANNER
        Scanner in = new Scanner(System.in);

        //CRIA UM OBJETO RANDOMICO EX.: Random@12jxxp09.
        Random r = new Random();

        //N = NÚMERO A SER DIGITADO
        int n;

        //RECEBE UM VALOR INTEIRO RANDOMICO (0 A 1000).
        int ran = r.nextInt(1000);

        //EXIBE O NÚMERO RANDOMICO "ESCOLHIDO".
        System.out.println("Número: " + ran);

        //INSERE UMA PRIMEIRA TENTATIVA NO "DO",
        //ENQUANTO O NÚMERO DIGITADO FOR DIFERENTE (!=) DO RANDOMICO.
        do{
            System.out.print("Insira um número de 0 a 100: ");
            n = in.nextInt();

            if(n < ran){
                System.out.println("O número é maior!");
            }else if(n > ran){
                System.out.println("O número é menor!");
            }
        }while(n != ran);

        //EXIBE A CONCLUSÃO!
        System.out.println("Parabéns, você encontrou o número!");

    }
}