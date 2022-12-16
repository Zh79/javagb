import java.util.*;

public class programm {
    public static void main(String[] args) {    
    inSlov();
    }
    public static void inSlov(){
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> values = new Hashtable<String, Integer>();
        String[] variables = expression(scanner, "Введите выражение: ").split("\\+");
        for (String variable : variables) 
            values.put(variable, values.getOrDefault(variable, 0) + 1);
        for (String key : values.keySet()) {
            result+= values.get(key)*Integer.parseInt(expression(scanner, "Ввпедите значение " + key + " "));
        }
        System.out.print(result);          
    }
    public static String expression(Scanner scanner, String text) {
        
        System.out.println();
        System.out.print(text);
        String res =  scanner.nextLine();
        
        return res;       
        
    }    
    
}