import java.util.Scanner;
import java.util.LinkedList;

public class Calc_del {
    /**
     * В калькулятор добавьте возможность отменить последнюю операцию.
     */
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char operation;
        int del;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        num1 = input.nextDouble();
        System.out.print("Введите 2 число: ");
        num2 = input.nextDouble();
        System.out.print("Введите операцию (+ - * / ^): ");
        operation = input.next().charAt(0);

        LinkedList<Object> operations = new LinkedList<>();
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.printf("Неправильный ввод знака");
                return;
        }
        operations.add(num1);
        operations.add(operation);
        operations.add(num2);
        operations.add(result);
        System.out.println(operations);
        System.out.printf("%f %c %f = " + result + "\n", num1, operation, num2);

        System.out.print("Для отмены последней операции введите 0: ");
        del = input.nextInt();

        if (del == 0) {
            operations.removeLast();
            operations.removeLast();
            operations.removeLast();
            operations.removeLast();

        }
        System.out.println(operations);
    }
}