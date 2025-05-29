public class OperatorPrecedenceEx {
    public static void main(String[] args) {
        int result1 = 20 + 5 * 2;
        int result2 = (15 + 5) * 2;
        int result3 = 10 / 5 + 3 * 2;

        System.out.println("Result1 (20 + 5 * 2): " + result1);
        System.out.println("Result2 ((15 + 5) * 2): " + result2);
        System.out.println("Result3 (10 / 5 + 3 * 2): " + result3);
    }
}
