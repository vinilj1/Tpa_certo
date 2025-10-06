import java.util.Scanner;

public class IdadePesoAltura {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade;
        double altura, peso;

        int qtdMaior50 = 0;
        int qtdIdade10a20 = 0;
        int qtdPesoMenor40 = 0;
        double somaAlturas = 0;

        int maisNovo = Integer.MAX_VALUE;
        int maisVelho = Integer.MIN_VALUE;

        for (int i = 1; i <= 25; i++) {
            System.out.println("\nPessoa " + i + ":");

            System.out.print("Idade: ");
            idade = in.nextInt();

            System.out.print("Altura (em metros): ");
            altura = in.nextDouble();

            System.out.print("Peso (em kg): ");
            peso = in.nextDouble();

            // quantidade de pessoas com idade > 50
            if (idade > 50) {
                qtdMaior50++;
            }

            // média das alturas dos que tem idade entre 10 e 20
            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                qtdIdade10a20++;
            }

            // porcentagem de pessoas com peso < 40
            if (peso < 40) {
                qtdPesoMenor40++;
            }

            // idade mais nova e mais velha
            if (idade < maisNovo) {
                maisNovo = idade;
            }
            if (idade > maisVelho) {
                maisVelho = idade;
            }
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Quantidade de pessoas com idade > 50: " + qtdMaior50);

        if (qtdIdade10a20 > 0) {
            double mediaAltura = somaAlturas / qtdIdade10a20;
            System.out.printf("Média das alturas (10 a 20 anos): %.2f m%n", mediaAltura);
        } else {
            System.out.println("Não há pessoas com idade entre 10 e 20 anos.");
        }

        double porcentagem = (qtdPesoMenor40 * 100.0) / 25;
        System.out.printf("Porcentagem de pessoas com peso < 40 kg: %.2f%%%n", porcentagem);

        System.out.println("Idade da pessoa mais nova: " + maisNovo);
        System.out.println("Idade da pessoa mais velha: " + maisVelho);

        in.close();
    }
}

