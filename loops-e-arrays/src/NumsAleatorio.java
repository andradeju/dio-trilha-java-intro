import java.util.Scanner;

public class NumsAleatorio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2;

            System.out.println("Digite o primeiro número: ");
            num1 = scan.nextInt();

         while (num1 == 0) {
             System.out.println("Número inválido, digite novamente: ");
             num1 = scan.nextInt();
         }
             System.out.println("Digite o segundo número: ");
             num2 = scan.nextInt();
             while(num2 == 0) {
                 System.out.println("Número inválido, digite novamente: ");
                 num2 = scan.nextInt();
             }
             System.out.println("O resultado é: " +(num1 + num2));
         }


    }

