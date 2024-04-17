package GeometricAlgorithms;

public class Triangle {
    public static boolean isTriangleExists(int a, int b, int c) {
        return (a + b > c && a + c > b && b + c > a);
    }

    public static void main(String[] args) {

        System.out.println(isTriangleExists(8,8,16));
    }
}
