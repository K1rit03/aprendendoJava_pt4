import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner limite = new Scanner(System.in);

        // Definindo o limite inicial do cartão
        System.out.println("Digite o limite do cartão");
        double compraLimite = limite.nextDouble();
        double saldoRestante = compraLimite; // Inicializando saldo restante

        int opcao = 1;

        while (opcao != 0) {
            System.out.println("Digite a descrição da compra");
            limite.nextLine(); // Consumir a quebra de linha
            String compraNome = limite.nextLine();
            System.out.println("Digite o valor da compra");
            double compraValor = limite.nextDouble();

            // Verifica se a compra pode ser realizada
            if (compraValor > saldoRestante) {
                System.out.println("Saldo insuficiente para a compra de: " + compraNome);
                System.out.println("Saldo do cartão: " + saldoRestante);
            } else {
                // Atualiza o saldo restante
                saldoRestante -= compraValor;
                System.out.println("Compra realizada!");
                System.out.println("Saldo do cartão após a compra: " + saldoRestante);
                if (saldoRestante == 0){
                    System.out.println("Seu saldo chegou no 0.00 encerrando compra");
                    break;
                }
            }

            // Pergunta ao usuário se deseja continuar ou sair
            System.out.println("Digite 0 para sair ou 1 para continuar");
            opcao = limite.nextInt();

            switch (opcao) {
                case 1:
                    break; // O loop continua
                case 0:
                    System.out.println("Encerrando o programa");
                    break;
                default:
                    System.out.println("Opção inválida! Digite 0 para sair ou 1 para continuar o programa");
            }
        }

        limite.close(); // Fechar o scanner para evitar vazamentos de memória
    }
}
