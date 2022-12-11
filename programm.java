import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class programm {
    public static void main(String[] args) {
        int n = 1000;
        //ex1(n);
        //System.out.println(ex2(n));
        //ex3(n);
        ex4();
} 
    public static void ex1(int n){
        int m = (n*(n+1))/2;
        System.out.println(m);
        
        
        /*
         *  System.out.println("как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        String res = "";
        if(hour >=5 && hour < 12){
            res += "Доброе утро! ";
        }else if (hour >= 12 && hour < 24){
            res += "Доброе все! ";
        }
        System.out.println(res + name);
         */
       
    }

    public static int ex2(int n){
        if (n == 1 | n == 0){
            return 1; 
        }
        else{
            return n * ex2(n-1);
        }
    }

    public static void ex3(int n){
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0){count += 1;}
            }
            if (count <=2){
                System.out.println(i);
            }    
        }
    }

    public static void ex4(){
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();

        System.out.println("Введите второе число: ");
        Scanner scaner1 = new Scanner(System.in);
        String second = scaner1.nextLine();

        System.out.println("укажите операцию, которую надо выполнить с этими числами (+, -, *, /)");
        Scanner scanner2 = new Scanner(System.in);
        String oper = scanner2.nextLine();

        int i = Integer.parseInt (first.trim ());
        int j = Integer.parseInt (second.trim ());
        char oper1 = oper.charAt(0);
        if(oper1 == '+'){System.out.println(i+j);}
        else if(oper1 ==  '-'){System.out.println(i-j);}
        else if(oper1 == '*'){System.out.println(i*j);}
        else if(oper1 == '/'){System.out.println(i/j);}
    }

}