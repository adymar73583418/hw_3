public class Main {
    public static void main(String[] args) {
        double[] numbers = {2.3, -6.8, 7.2, 8., 6.8, -9.6, 0.5, 1.3, 3.5, 7.8, 9.0, 5.0, 7.5, 8.4, 89.6,};
        double sum = 0;
        int amount = 0;
        boolean isNegative = false;
        for (double num : numbers) {
            if (num < 0) {
                isNegative = true;
            } else if (isNegative && num > 0) {
                sum = num;
                amount++;
                System.out.println(num);
            }
        }
        System.out.println("общее арифметичекое: " + sum / amount);
    }
}