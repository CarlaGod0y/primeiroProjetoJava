import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacaoJAVA {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while(tentativas < 5) {
            System.out.println("Digite um número de 0 a 100: ");
            int numeroEscolhido = leitor.nextInt();
            tentativas++;

            if(numeroEscolhido == numeroSecreto) {
                System.out.println("Parabéns, você acertou o Número Secreto!");
                break;
            } else if(numeroEscolhido < numeroSecreto) {
                System.out.println("O número Secreto é maior.");
            } else {
                System.out.println("O número secreto é menor.");
            }

        }
        if (tentativas == 5 && numeroDigitado != numeroSecreto) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroSecreto);
        }
    }
}
