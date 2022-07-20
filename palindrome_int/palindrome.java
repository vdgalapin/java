package palindrome_int;


public class palindrome {
    
    static boolean reverse(int val) {
        boolean result = false;

        if(val < 0 ) {
            return false;
        } else if (val % 10 == 0) {
            return false;
        } else {
            int reverse = 0;
            int t_val = val;
            int last_int = 0;
            
            while(val%10 > 0 ) {
                
                last_int = val % 10;
                val /= 10;
                reverse = reverse * 10 + last_int;

            }

            if (t_val == reverse) {
                return true;
            } else {
                return false;
            }
        }

    }
    public static void main(String[] args) {

        System.out.println(reverse(121));
        System.out.println(reverse(123));
        System.out.println(reverse(120));
        System.out.println(reverse(-120));
    }
}
