/*
8) Seguindo o enunciado da questão 7), faça um programa em Java que imprima na tela os números primos
existentes entre os números 100 e 200.
*/
public class Exercico8 {
    public static void main(String[] args) {
        System.out.println("Os numeros primos de 100 a 200 são:");
        for (int i = 100; i <= 200; i++) {
            int count = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) ++ count;
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}
