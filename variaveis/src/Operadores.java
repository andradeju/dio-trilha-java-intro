public class Operadores {
    public static void main(String[] args) {
        String nomeUm = "Juca";
        String nomeDois = new String("Juca");
        System.out.println(nomeUm == nomeDois);

        int numero = 5;
        numero = - numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        int number = 6;
        System.out.println(number --);
        System.out.println(number);

        boolean variavel = true;
        //System.out.println(!variavel);

        variavel = !variavel;
        System.out.println(variavel);

        int a = 7;
        int b = 7;
        String resultado = a==b?"verdadeiro" : "falso";

        //if(a==b)
            //resultado = "verdadeiro";
        //else
            //resultado = "falso";
        System.out.println(resultado);

        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 == num2;
        System.out.println("Numero1 é  igual a Numero2? " + simNao);

        if(num1 < num2){
            System.out.println("VERDADEIRO");
        }

        simNao = num1 != num2;
        System.out.println("Numero1 é diferente a Numero2? " + simNao);

        simNao = num1 > num2;
        System.out.println("NUmero1 é maior que Numero2? " + simNao);

        boolean condicao1 = true;
        boolean condicao2 = false;
        if (condicao1 || condicao2) {
            System.out.println("Um das condições é verdadeira");
        }
        System.out.println("fim");
    }
}
