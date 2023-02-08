/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. */
import java.util.HashMap;
import java.util.Map;

class d1{
    public static void main(String[] args) {
        Map<Integer, String> telephonebook = new HashMap<>();
        telephonebook.put(375250001, "иван ");
        telephonebook.put(375250002, "сергей");
        telephonebook.put(375250003, "борис");
        telephonebook.put(375250004, "гена");
        telephonebook.put(375250005, "женя");
        System.out.println(telephonebook);
  
    }
}