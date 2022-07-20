package pytharorean_theorem;

public class pt {
    public static int ptheorem_naive(int[] arr, int size) {
        for(int x = 0; x < size; x++) {
            for(int y = x + 1; y <size; y++) {
                for(int z = x + 2; z < size; z++) {
                    int a = arr[x] * arr[x];
                    int b = arr[y] * arr[y];
                    int c = arr[z] * arr[z];

                    if(a == b + c || c == a + c || c == b + a) {
                        return 1;
                    }
                }
            }
        }
        
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 6, 5};
        System.out.println(ptheorem_naive(arr, 5));
    }
}
