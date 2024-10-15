package terceiro_desafio;

public class Terceiro {
    public static void main(String[] args) {
        int indice = 12, soma = 0, k = 1;

        while (k < indice) {
            k++;
            soma += k;
        }

        System.out.println("O valor da variável \"soma\" é: " + soma);
    }
}