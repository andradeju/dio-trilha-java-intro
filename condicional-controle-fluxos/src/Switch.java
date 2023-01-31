public class Switch {
    public static void main(String[] args) {
        switchSemana();
        switchFerias();
    }
    private static void switchSemana() {
        String dia = "friday";
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }

    }
    private static void switchFerias(){
        String mes = "abril";
        switch (mes) {
            case "dezembro":
            case "janeiro":
            case "abril":
                System.out.println("Férias!");
                break;
            default:
                System.out.println("Mês indefinido");
                break;
        }
    }
}
