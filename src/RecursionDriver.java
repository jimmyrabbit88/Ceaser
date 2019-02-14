public class RecursionDriver {
    public static void main(String[] args) {
        //int ans = Recursion.factorial(5);
        //System.out.println("120 expected :: " + ans);

        //double ans = Recursion.myPow(2,4);
        //System.out.println("16 expected :: " + ans);

        //ans = Recursion.myPow(3,3);
        //System.out.println("27 expected :: " + ans);

        //String answer = Recursion.reverse("Hello");
        //System.out.println("olleH Expected :: " + answer);

        System.out.println("true expected :: " + Recursion.ispalindrome("raceecar"));
        System.out.println("true expected :: " + Recursion.ispalindrome("racecar"));
        System.out.println("fales expected :: " + Recursion.ispalindrome("raefcar"));
    }
}
