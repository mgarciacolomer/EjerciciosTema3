public class Main {
    public static void main(String[] args) {
        int sumando1 = 1;
        int sumando2 = 2;
        int sumando3 = 3;
        int res;

        res = suma(sumando1, sumando2, sumando3);

        System.out.println(res);
    }
    public static int suma (int a, int b, int c){
        return a + b + c;
    }
}