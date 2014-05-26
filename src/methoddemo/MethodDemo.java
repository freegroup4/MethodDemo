package methoddemo;
public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("length = " + aMethod(7,3));
    }

    public static double aMethod(int m, int n) {
        return Math.sqrt(m*m+n*n);
    }
}
