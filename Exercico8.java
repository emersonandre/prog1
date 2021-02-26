/*
8) Seguindo o enunciado da questão 7), faça um programa em Java que imprima na tela os números primos
existentes entre os números 100 e 200.
*/
public class Exercico8 {
    public static void main(String[] args){
        int x;
        System.out.println("os numeros primos de 100 a 200 são: ");
        for(x = 100; x <= 200; x++){
            double num = x % 2;
            if(num != 0){
               System.out.println(x);
            }
        }
    }
}
