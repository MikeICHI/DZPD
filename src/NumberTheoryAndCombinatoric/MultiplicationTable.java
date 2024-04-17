package NumberTheoryAndCombinatoric;

public class MultiplicationTable {

    public static void MultiplicationTable(int number) {
        //int number = 6; // Заданное число для таблицы умножения

        System.out.println("Таблица умножения для " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
    public static void main(String[] args) {
        MultiplicationTable(8);
    }
}

