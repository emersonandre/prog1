/*
8) Seguindo o enunciado da questão 7), faça um programa em Java que imprima na tela os números primos
existentes entre os números 100 e 200.
*/
public class Exercico8 {
    public static void main(String[] args) {
        out: for (int i = 100; i <= 200; i++) {
            for (int k = 2; k < i; k++) {
                if (i % k == 0) continue out;
            }
            System.out.println("O numero: " + i + " é Primo");
        }
    }
}
