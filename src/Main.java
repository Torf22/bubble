public class Main {
    public static void main(String[] args) {
        int n = 100;
        int max = 0;
        int min = 0;
        int avg;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * n);
//            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
}


//    Реализуйте алгоритм сортировки пузырьком для сортировки массива