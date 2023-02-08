
/*Написать метод, который переведёт данное целое число в римский формат */
import java.util.*;

public class d4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для преобразования: ");
        String input = sc.nextLine();
        Map<String, Integer> conversion = new HashMap<>();
        conversion.put("I", 1);
        conversion.put("V", 5);
        conversion.put("X", 10);
        conversion.put("L", 50);
        conversion.put("C", 100);
        conversion.put("D", 500);
        conversion.put("M", 1000);
        String array[] = input.split("");
        int result = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (conversion.get(array[i]) < conversion.get(array[i + 1])) {
                result = result - conversion.get(array[i]);
            } else {
                result = result + conversion.get(array[i]);
            }
        }
        result = result + conversion.get(array[array.length - 1]);
        System.out.println(result);

    }
}