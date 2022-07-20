package spiralmatrix;

public class spiralmatrix {
    static int[][] matrix(int n) {

        int[][] arr = new int[n][n];

        int val = 1;
        // Using the layer logic
        for(int layer = 0; layer < (n+1)/2; layer++) {
            // (n+1)/2 identifies how many layers we need
            
            // This is the top-left to top-right
            for(int x = layer; x < n - layer; x++) {
                arr[layer][x] = val++;           
            }

            // This is the top-right to bottom-right
            for(int y = layer + 1; y < n - layer; y++ ) {
                arr[y][n-layer-1] = val++;          
            }

            // This is the bottom-right to bottom-left
            for(int x = layer + 1; x < n - layer; x++) {
                arr[n-layer-1][n-x-1] = val++;     
            }

            // This is the bottom-left to top-right
            for(int y = layer + 1; y < n - layer - 1; y++) {
                arr[n - y - 1][layer] = val++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] arr = matrix(n);
        for(int x = 0; x < n; x++) {
            for(int y = 0; y < n; y++) {
                System.out.print(arr[x][y] + "\t");
            }
            System.out.println("");
        }
    }
}
