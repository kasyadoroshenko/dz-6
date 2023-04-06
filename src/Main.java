public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;
        int d = 25;

        int sum1 = a + b;
        int sum2 = c + d;

        System.out.println(sum1);
        System.out.println(sum2);

        System.out.println(sum1>sum2 ? "True": "False");

        sum1 += 1;
        sum2 -= 2;

        System.out.println(sum1);
        System.out.println(sum2);

        System.out.println(sum1>sum2 ? "True": "False");

        System.out.println(sum1%2 < 1  || sum2%2 < 1 ? "True": "False");

        System.out.println(sum1 % 2);
        System.out.println(sum2 % 2);

    }
}
