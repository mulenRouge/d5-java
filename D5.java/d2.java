import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class d2 {
    public static void main(String[] args) {
        HashMap<String, Integer> freqMap = new HashMap<String, Integer>();
        HashMap<String, String> dataMap = new HashMap<>();
        int bubblesBufferForValues;
        String bubblesBufferForKeys;
        dataMap.put("Иванов", "Иван");
        dataMap.put("Петрова", "Светлана");
        dataMap.put("Белова", "Кристина");
        dataMap.put("Мусина", "Анна");
        dataMap.put("Крутова", "Анна");
        dataMap.put("Юрин", "Иван");
        dataMap.put("Лыков", "Петр");
        dataMap.put("Чернов", "Павел");
        dataMap.put("Чернышов", "Петр");
        dataMap.put("Федорова", "Мария");
        dataMap.put("Светлова", "Марина");
        dataMap.put("Савина", "Мария");
        dataMap.put("Рыкова", "Мария");
        dataMap.put("Лугова", "Марина");
        dataMap.put("Владимирова", "Анна");
        dataMap.put("Мечников", "Иван");
        dataMap.put("Петин", "Петр");
        dataMap.put("Ежов", "Иван");
        for (String name : dataMap.values()) {
            if (!freqMap.containsKey(name)) {
                if (Collections.frequency(dataMap.values(), name) > 1) {
                    freqMap.put(name, Collections.frequency(dataMap.values(), name));
                }
            }
        }
        System.out.println(freqMap);
        ArrayList<Integer> sortedListValues = new ArrayList<Integer>(freqMap.values());
        ArrayList<String> sortedListKeys = new ArrayList<String>(freqMap.keySet());
        for (int i = 0; i < sortedListValues.size(); i++) {
            for (int j = 1; j < sortedListValues.size(); j++) {
                if (sortedListValues.get(j) > sortedListValues.get(j-1)) {
                    bubblesBufferForValues = sortedListValues.get(j-1);
                    sortedListValues.set((j-1),sortedListValues.get(j));
                    sortedListValues.set((j),bubblesBufferForValues);
                    bubblesBufferForKeys = sortedListKeys.get(j-1);
                    sortedListKeys.set((j-1),sortedListKeys.get(j));
                    sortedListKeys.set((j),bubblesBufferForKeys);
                }
            }
        }
        System.out.println("Популярность имен по убыванию имеет вид:");
        for (int i = 0; i < sortedListValues.size(); i++) {
            System.out.println("Имя "+ sortedListKeys.get(i) + " имеет популярность = "+ sortedListValues.get(i));
        }
    }
}