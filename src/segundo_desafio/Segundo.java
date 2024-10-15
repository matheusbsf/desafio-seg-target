package segundo_desafio;

import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contagem = 0;

        System.out.println("Informe uma frase para verificar a existência do caractere \"a\":");
        String texto = scanner.nextLine();
        scanner.close();

        // Converte a string passada pelo usuário em lowercase e depois em um array de
        // caracteres para fazer a checagem
        for (char c : texto.toLowerCase().toCharArray()) {
            if (c == 'a') {
                contagem++;
            }
        }

        if (contagem > 0) {
            System.out.println("Nesta frase o caractere \"a\" aparece " + contagem + " vezes.");
        } else {
            System.out.println("O caractere \"a\" não está presente nesta frase.");
        }
    }
}