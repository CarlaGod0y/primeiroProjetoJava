import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0; //o zero é o valor inicial da variável
        double nota = 0; //o zero é o valor inicial da variável
        int totalDeNotas = 0;

        while (nota != -1) { //o != significa diferente
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota; //o += vai acrescentar a nota à avaliação.
                totalDeNotas++;

            }
        }
        System.out.println("Média de avaliações: " + mediaAvaliacao / totalDeNotas);

    }
}
