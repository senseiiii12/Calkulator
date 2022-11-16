import java.util.Scanner;

public class Calculator {
    public void Calc(int a, String b, int c){
        if(b == "+"){
            System.out.println("Сумма = " + (a+c));
        }
        else if (b == "-") {
            System.out.println("Разность" + (a-c));
        }
        
    }

}
