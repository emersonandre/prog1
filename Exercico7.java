/*
7) Um número primo é aquele que é divisível apenas por 1 e por ele mesmo. Nesse caso, ser divisível é ter o resto
da divisão inteira resultando em zero, ou seja, dividir um número sem gerar vírgula. Por exemplo, o número 5 pode
ser dividido apenas por 1 e por ele mesmo: 5 / 1 = 5, resto 0; e 5 / 5 = 1, resto 0. Faça um programa em Java que
imprima na tela os 15 primeiros números primos existentes.
*/
public class Exercico7 {
    public static void main(String[] args) {
        out: for (int i = 1; i <= 15; i++) {
            for (int k = 2; k < i; k++) {
                if (i % k == 0) continue out;
            }
            System.out.println("O numero: " + i + " é Primo");
        }
    }
}
    
