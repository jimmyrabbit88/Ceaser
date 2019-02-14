public class Recursion {
    public static int factorial(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        else
            return num * factorial(num-1);
    }

    public static double myPow(double num, double pow){
        if(pow == 0){
            return 1;
        }
         else if(pow == 1){
            return num;
        }
        else{
            return num*myPow(num, pow-1);
        }
    }

    public static String reverse(String str){
        int index = str.length();
        if(index == 1){
            return str;
        }
        else{
            char ch = str.charAt(0);
            String newstr = str.substring(1, str.length());
            return reverse(newstr) + ch;
        }

    }

    public static Boolean ispalindrome(String str){
        if(str.length() <=1){
            return true;
        }
        else{
            if(str.charAt(0) == str.charAt(str.length()-1)){
                return (ispalindrome(str.substring(1, str.length()-1)));
            }
            else{
                return false;
            }
        }
    }
}






















