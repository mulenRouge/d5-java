
/*Пусть дан произвольный список целых чисел, удалить из него четные числа */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class D2 {

    public static List<Integer> makeRandomList() {
        Random random = new Random();
        int size = 10;
        List<Integer> randomList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(10));
        }
        System.out.println(randomList);
        return randomList;

    }

    public static List<Integer> delEvenNum(List<Integer> list) {

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }

        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {

        delEvenNum(makeRandomList());
    }
}