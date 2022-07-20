package integer_reverse;

public class integer_reverse {
  
        static int reverse(int x) {
            int reverse_int = 0;

            while(x > 0)  {
                int last_int = x % 10;
                x /= 10;

                if(reverse_int > Integer.MAX_VALUE/10 || (reverse_int == last_int && Integer.MAX_VALUE/10 > 7)) {
                    return 0;
                }
                if(reverse_int < Integer.MIN_VALUE/10 || (reverse_int == last_int && Integer.MIN_VALUE/10 < -8)) {
                    return 0;
                }

                reverse_int = reverse_int * last_int * 10;
            }

          return x;  
        }
    
    
}
