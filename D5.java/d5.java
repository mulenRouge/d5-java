import java.util.TreeMap;

/*
 * Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь 
 * друг прелестный Пора красавица проснись.Написать метод, который отсортирует 
 * эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
 */
public class d5 {
    public static void main(String[] args) {
        SortMap();
    }

    public static void SortMap() {
        String s = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.";
        TreeMap<Integer, String> list1 = new TreeMap<>();
        String[] sMas = s.split(" ");
        System.out.println(sMas.length);
        for (int i = 0; i < sMas.length; i++) {
            list1.put(sMas[i].length(), sMas[i]);
        }
        for (var el : list1.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }

    }
}