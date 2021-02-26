/*
6) Faça um programa em Java que calcule a idade de uma pessoa baseada no seu ano de nascimento. Você não
precisa ler os valores do teclado, pode apenas declarar e utilizar as variáveis.

*/
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Exercico6 {
    public static void main(String[] args){
        Calendar cal = GregorianCalendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int nascimento = 1990;

        System.out.println("Em "+ year + " A pessoa que nasceu em "+ nascimento + " vai ter " + (year - nascimento) + " Anos!");

    }
}
