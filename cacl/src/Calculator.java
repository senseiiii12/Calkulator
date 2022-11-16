import java.util.Scanner;

public class Calculator {
    public void Calc(int a, String b, int c){
        if(b.equals("+")){
            System.out.println("Сумма =" + (a+c));
        }
        else if (b.equals("-")) {
            System.out.println("Разность =" + (a-c));
        }
        else if (b.equals("*")){
            System.out.println("Умножение =" + (a*c));
        }
        else if(b.equals("/")){
            System.out.println("Деление =" + (a/c));
        }
    }

}
