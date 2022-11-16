public class Main {
    public static void main(String[] args) {


        int[] arr = generateRandomArray();}


        public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
                System.out.print(arr[i] + ", ");
            }

            System.out.println();
            System.out.println("Задание 10.1");

            int[] consts = new int[30];
            int sum = 0;

            for (int j = 0; j < consts.length; j++) {
                consts[j] = random.nextInt(100_000) + 100_000;
                sum += consts[j];
                System.out.println("«Сумма трат за месяц составила " + sum + " рублей»");
            }
            System.out.println();
            System.out.println("Задание 10.2.");
            int maxArr = 100_000;
            int minArr = 200_000;
            for (int j = 0; j < arr.length; j++) {
                arr[j] = random.nextInt(100_000) + 100_000;
                System.out.print(arr[j] + ", ");
                if (maxArr < arr[j]) {
                    maxArr = arr[j];
                } else if (minArr > arr[j]) {
                    minArr = arr[j];
                }

            }
            System.out.println();
            System.out.print("«Минимальная сумма трат за день составила " + minArr + " рублей. Максимальная сумма трат за день составила " + maxArr + " рублей»");
            System.out.println();
            System.out.println("Задание 10.3");
            int[] consts1 = new int[30];
            int sum1 = 0;

            for (int j = 0; j < consts1.length; j++) {
                consts1[j] = random.nextInt(100_000) + 100_000;
                sum1 += consts1[j];
                int mean = sum1 / 30;
                System.out.println("Средняя сумма трат за день составила " + mean + " рублей");
            }

            System.out.println();
            System.out.println("Задание 10.4");

            char[] reserseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reserseFullName.length - 1; i >= 0; i--)
                System.out.print(reserseFullName[i]);


            return arr;


        }
    }





