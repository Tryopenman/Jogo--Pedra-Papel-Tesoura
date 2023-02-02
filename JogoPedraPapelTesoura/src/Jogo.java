import java.util.Scanner;

public class Jogo {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        menu();
    }

    public static void menu() {

        System.out.println("--------------------Seja BEM VINDO ao Jogo do Pedra Papel Tesoura--------------------");
        System.out.println();

        int opcao = 0;

        while (opcao != 4){

            System.out.println("Insira o seu nome: ");

            String nome = input.next();
            System.out.println();

            System.out.println("1. Pedra");
            System.out.println("2. Papel");
            System.out.println("3. Tesoura");
            System.out.println("4. Sair");
            System.out.print("Introduza o numero da sua escolha: ");

            opcao = input.nextInt();
            String escolha = validarOpcao(opcao);
            System.out.println("Escolheste: "+ escolha);
            String escolhaComputador = gerarNumero();
            System.out.println("O computador escolheu: " + escolhaComputador);

            verificarVencedor(escolha,escolhaComputador,nome);
        }
    }

    public static void verificarVencedor(String escolha, String escolhaComputador, String nome) {

        if (escolha.equals(escolhaComputador)) {

            System.out.println("Empate");
        } else if (escolha.equals("Pedra") && escolhaComputador.equals("Tesoura")) {

            System.out.println("Venceu! Parabéns " + nome);
        } else if (escolha.equals("Pedra") && escolhaComputador.equals("Papel")) {

            System.out.println("UPS!" + nome + ". Infelizmente não venceu o jogo!");
        } else if (escolha.equals("Tesoura") && escolhaComputador.equals("Pedra")) {

            System.out.println("UPS!" + nome + ". Infelizmente não venceu o jogo!");
        } else if (escolha.equals("Tesoura") && escolhaComputador.equals("Papel")) {

            System.out.println("Venceu! Parabéns " + nome);
        }else if (escolha.equals("Papel") && escolhaComputador.equals("Tesoura")) {

            System.out.println("UPS!" + nome + ". Infelizmente não venceu o jogo!");
        }else if (escolha.equals("Papel") && escolhaComputador.equals("Pedra")) {

            System.out.println("Venceu! Parabéns " + nome);
        }
    }

    public static String validarOpcao(int opcao) {

        String escolha = "";

        switch (opcao) {
            case 1 -> escolha = "Pedra";
            case 2 -> escolha = "Papel";
            case 3 -> escolha = "Tesoura";
            case 4 -> System.exit(0);
            default -> System.out.println("Numero Introduzido Inválido");
        }
        return escolha;
    }

    public static String gerarNumero() {

        int opcao = (int) (Math.random() * 3 + 1);

        String escolha = "";

        switch (opcao) {
            case 1 -> escolha = "Pedra";
            case 2 -> escolha = "Papel";
            case 3 -> escolha = "Tesoura";
            case 4 -> System.exit(0);
            default -> System.out.println("Numero Introduzido Inválido");
        }
        return escolha;
    }
}