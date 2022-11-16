import java.util.Scanner;

public class Calculator {
    public void Calc(int a, String b, int c){
        switch (b) {
            case "+" -> System.out.println("Сумма = " + (a + c));
            case "-" -> System.out.println("Разность = " + (a - c));
            case "*" -> System.out.println("Умножение = " + (a * c));
            case "/" -> System.out.println("Деление = " + (a / c));
        }
    }

}
