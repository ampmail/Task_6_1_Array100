import java.util.Arrays;

public class ArrayParamCalculation {

    final static int RANGE_MIN = 50;
    final static int RANGE_MAX = 100;
    final static int NUMBERS_COUNT = 100;

    public static void main(String[] args) {

        if (NUMBERS_COUNT < 1) {
            System.out.println("Количество элементов не может быть меньше одного.");
            System.exit(0);
        }
        if (RANGE_MAX < RANGE_MIN) {
            System.out.println("Максимальное значение элемента в массиве не может быть меньше минимального."+
                    "\nПроверьте задание параметров.");
            System.exit(0);
        }

        int[] array = new int[NUMBERS_COUNT];
        int minNumber = RANGE_MAX, indexOfMinNumber = 0;
        int maxNumber = RANGE_MIN, indexOfMaxNumber = 0;
        long sumOfNumbers = 0;
        double averageNumber = 0.0;

        for (int i = 0; i < NUMBERS_COUNT; i++) {
            array[i] = (int) (Math.random() * (RANGE_MAX - RANGE_MIN + 1) + RANGE_MIN);
            if (array[i] < minNumber) {
                minNumber = array[i];
                indexOfMinNumber = i;
            }
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                indexOfMaxNumber = i;
            }
            sumOfNumbers += array[i];
        }
        averageNumber = (double) sumOfNumbers / NUMBERS_COUNT;

        System.out.println(Arrays.toString(array));
        System.out.println("Минимальное значение в массиве равно: " + minNumber + ", с индексом: " + indexOfMinNumber);
        System.out.println("Максимальное значение в массиве равно: " + maxNumber + ", с индексом: " + indexOfMaxNumber);
        System.out.println("Сумма элементов массива равна: " + sumOfNumbers);
        System.out.println("Среднее значение всех элементов массива равно: " + averageNumber);
    }
}
