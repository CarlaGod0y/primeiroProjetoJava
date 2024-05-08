import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0; //o zero é o valor inicial da variável
        double nota = 0; //o zero é o valor inicial da variável

        for (int i = 0; i < 3; i++) { //o i++ significa que a variável vai acumular os inserts
            System.out.println("Diga sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota; //o += vai acrescentar a nota à avaliação.
        } 

        System.out.println("Média de avaliações: " + mediaAvaliacao / 3);
    }

}
