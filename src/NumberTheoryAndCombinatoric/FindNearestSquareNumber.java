package NumberTheoryAndCombinatoric;

public class FindNearestSquareNumber {
    public static void main(String[] args) {
        int number = 20;

        System.out.println("Ближайшее квадратное число для " + number + ": " + findNearestSquare(number));
    }

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
}

