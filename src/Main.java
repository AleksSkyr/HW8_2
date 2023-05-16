public class Main {
    public static void main(String[] args) {

        tasc1();
        tasc2();
        tasc3();
        tasc4();

    }
    public static void tasc1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int spending = 0;
        for (int i = 0; i < arr.length; i++) {
         spending = spending + arr[i];
         }
        System.out.println("Сумма трат за месяц составила " + spending + " рублей");
    }
    public static void tasc2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int spending = 0;
            int spendingMax = -1;
            int spendingMin = 200000;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > spendingMax) {
                    spendingMax = arr[i];
                }
                if (arr[i] < spendingMin) {
                    spendingMin = arr[i];
                }
            }
        System.out.println("Минимальная сумма трат за день составила " + spendingMin + " рублей. Максимальная сумма трат за день составила " + spendingMax + " рублей");
            
        }
        public static void tasc3() {
            System.out.println("Задача 3");
            int[] arr = generateRandomArray();
            int spending = 0;
            for (int i = 0; i < arr.length; i++) {
                spending = spending + arr[i] / 30;
            }
            System.out.println("Средняя сумма трат за месяц составила " + spending + " рублей");
        }

        public static void tasc4() {
            System.out.println("Задача 4");
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int f = reverseFullName.length - 1; f >= 0; f--) {
                System.out.print(reverseFullName[f]);
            }
        }



    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}