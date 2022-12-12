public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] integer = {1, 2, 3};
        double[] fraction = {1.57, 7.654, 9.986};
        int[] arbitrary = {1, 2, 4, 5, 6, 7};

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] integer = {1, 2, 3};
        double[] fraction = {1.57, 7.654, 9.986};
        int[] arbitrary = {1, 2, 4, 5, 6, 7};
        for (int i = 0; i < integer.length; i++) {
            if (i == integer.length - 1) {
                System.out.println(integer[i]);
                break;
            }
            System.out.print(integer[i] + ",");

        }
        for (int i = 0; i < fraction.length; i++) {
            if (i == fraction.length - 1) {
                System.out.println(fraction[i]);
                break;
            }
            System.out.print(fraction[i] + ",");
        }
        for (int i = 0; i < arbitrary.length; i++) {
            if (i == arbitrary.length - 1) {
                System.out.println(arbitrary[i]);
                break;
            }
            System.out.print(arbitrary[i] + ",");
        }
    }
}