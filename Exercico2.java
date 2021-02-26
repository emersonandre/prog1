
/*
 Faça um programa em Java que imprima na tela a soma de dois números inteiros e a soma de dois números de
ponto flutuante (double). Você não precisa ler os valores do teclado, pode apenas declarar e utilizar as variáveis.
*/
public class Exercico2 {
    public static void main(String[] args){
        int a = 2;
        int b = 6;
        double n1 = 10.5;
        double n2 = 11.2;

        int somai = a + b;
        double somaf = n1 + n2;

        System.out.println("A soma dos numeros inteiros 2 e 6 é:" + somai );
        System.out.println("A soma dos numeros Flutuantes 10.5 e 11.2 é:" + somaf );
    }
}
