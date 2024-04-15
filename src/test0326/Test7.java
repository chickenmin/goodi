package test0326;

public class Test7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("(");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(j==i ? "":"+");
                sum += j;

            }
            System.out.print(")"  + (i==10? "":"+"));
        }
        System.out.println("=" + sum);
    }
}
