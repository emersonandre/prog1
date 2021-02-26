/*
 Faça um programa em Java que imprima na tela a tabuada do número 5 no seguinte formato:
    1 x 5 = 5
    2 x 5 = 10
    3 x 5 = 15
    4 x 5 = 20
    5 x 5 = 25
    6 x 5 = 30
    7 x 5 = 35
    8 x 5 = 40
    9 x 5 = 45
    10 x 5 = 50
*/
public class Exercico3 {
    public static void main(String[] args){
        int tabuada = 5,x; // tabuada do 5
        for(x = 1; x <= 10; x++){
            System.out.print(x + " x " + tabuada + " = ");
            System.out.println(x * tabuada);
        }
    }
}
