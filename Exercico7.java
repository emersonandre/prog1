/*
7) Um número primo é aquele que é divisível apenas por 1 e por ele mesmo. Nesse caso, ser divisível é ter o resto
da divisão inteira resultando em zero, ou seja, dividir um número sem gerar vírgula. Por exemplo, o número 5 pode
ser dividido apenas por 1 e por ele mesmo: 5 / 1 = 5, resto 0; e 5 / 5 = 1, resto 0. Faça um programa em Java que
imprima na tela os 15 primeiros números primos existentes.
*/
public class Exercico7 {
    public static void main(String[] args){
        int x;
        System.out.println("os numeros primos de 1 a 15 são: ");
        for(x = 1; x <= 15; x++){
            double num = x % 2;
            if(num != 0){
               System.out.println(x);
            }
        }
    }
}
    
