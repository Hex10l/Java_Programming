public class Randomness {
    public static void main(String[] args) {
        int expression = 19 % (2 + 3);
        //predicted answer is 4 (2+3) = 5, 19 / 5 = 3 with remainder of 4 therefor 19 % 5 = 4
        System.out.println(expression);
    }
}