import jdk.incubator.jpackage.internal.Arguments;

/*
5) Faça um programa em Java que imprima na tela a seguinte frase:

1 Java atrapalha muita gente
2 Java atrapalham atrapalham muita gente
3 Java atrapalham atrapalham atrapalham muita gente
4 Java atrapalham atrapalham atrapalham atrapalham muita gente
…
100 Java atrapalham atrapalham ... atrapalham atrapalham muita gente
*/
public class Exercico5 {
    public static void main(String[] args){
        String atrapalham = "atrapalham" ,m ;
        int x, y;

        System.out.println("1 ava atrapalha muita gente");
        for(x = 2; x <= 100; x++){
            y=2;
            while( y<=x ){
                atrapalham = atrapalham + " atrapalham ";
                y++;
            }
            System.out.println(x + " java " + atrapalham + " muita gente \n");
        }
    }
    
}
