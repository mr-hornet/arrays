import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
    }


    private static void task1() {
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] numbers2 = new double[]{1.57, 7.654, 9.986};

        String[] words = {"Hi", "Hello", "Zdorova"};
        System.out.println("Проинициализированы 3 массива");
    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] numbers2 = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i]);
            if (i < numbers2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        String[] words = {"Hi", "Hello", "Zdorova"};
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
            if (i < words.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] numbers2 = new double[]{1.57, 7.654, 9.986};
        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.print(numbers2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        String[] words = {"Hi", "Hello", "Zdorova"};
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void task4() {
        System.out.println("Задача 4");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}