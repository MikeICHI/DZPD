package NumberTheoryAndCombinatoric;

//import java.util.Arrays;

public class All {

    public static int findNearestSquare(int number) {
        int squareRoot = (int) Math.sqrt(number);
        int lowerSquare = squareRoot * squareRoot;
        int upperSquare = (squareRoot + 1) * (squareRoot + 1);

        if (Math.abs(number - lowerSquare) < Math.abs(number - upperSquare)) {
            return lowerSquare;
        } else {
            return upperSquare;
        }

    }

    public static int countPositiveOddNumbers(int n) {
        int count = 0;
        System.out.println(n + " Числа : ");
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ",");
                count++;
            }
        }
        return count;
    }

    public static int findNthEvenNumber(int n) {
        return 2 * n - 2;
    }

    public static Integer findNonConsecutive(int... array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1] + 1) {
                return array[i];
            }
        }
        return null;
    }

    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        double remainingBlue = blueStart - bluePulled;
        double remainingRed = redStart - redPulled;
        double totalRemaining = remainingBlue + remainingRed;

        return remainingBlue / totalRemaining;
    }

    public static Integer sumExcludingMinMax(int... arr) {
        if (arr == null || arr.length <= 2) {
            return null;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }

        return sum;
    }




    public static int multiplyByFiveAndPowerOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int sign = 1;
        if (num < 0) {
            sign = -1;
            num = -num;
        }
        int pow = 1;
        int originalNum = num;
        while (num > 0) {
            pow *= 5;
            num /= 10;
        }
        return sign * originalNum * pow;
    }

    public static int findOpposite(int num) {
        return -num;
    }

    public static int getNumbersDivisibleByDivisor(int[] numbers, int divisor) {
        int count = 0;
        for (int number : numbers) {
            if (number % divisor == 0) {
                count++;
            }
        }

//        int[] result = new int[count];
//        int index = 0;
//        for (int number : numbers) {
//            if (number % divisor == 0) {
//                result[index++] = number;
//            }
//        }

        return count;
    }


    public static int countTrailingZerosInFactorial(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }


    public static void MultiplicationTable(int number) {
        //int number = 6; // Заданное число для таблицы умножения

        System.out.println("Таблица умножения для " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    public static void PascalTriangle(int height) {
        int[][] triangle = new int[height][height];

        for (int i = 0; i < height; i++) {
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double bernoulliNumber(int n) {
        if (n % 2 == 1) {
            return 0.0;
        }
        double[] b = new double[n + 1];
        b[0] = 1.0;
        for (int m = 1; m <= n; m++) {
            b[m] = 0.0;
            for (int j = 0; j < m; j++) {
                b[m] -= binomialCoefficient(m, j) * b[j] / (m - j + 1);
            }
        }
        return b[n];
    }

    public static long binomialCoefficient(int n, int k) {
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i;
        }
        return result;
    }




    public static void main(String[] args) {
        int number = 20;
//        System.out.println("Ближайшее квадратное число для " + number + ": " + findNearestSquare(number));
        //       System.out.println(" да: " + countPositiveOddNumbers(number));
        // System.out.println(" да: " + findNthEvenNumber(50));
        //System.out.println(findNonConsecutive(1,2,3,4,7,8,9));
        //System.out.println(guessBlue(4,7,2,2));

        //System.out.println(sumExcludingMinMax(10,5,3,2));
        //System.out.println(sumExcludingMinMax());
        //System.out.println(multiplyByFiveAndPowerOfDigits(23));
        //System.out.println(findOpposite(-100));
        //System.out.println(getNumbersDivisibleByDivisor(new int[]{9,1,3,5,21},2));
        //MultiplicationTable(8);
        //PascalTriangle(8);

        System.out.println(bernoulliNumber(20));

        //System.out.println(countTrailingZerosInFactorial(12));
    }
}

