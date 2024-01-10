package arra;

public class SpiralOrderMatrix {

    public static int[] spiralOrder(int[][] A) {
        int m = A.length;
        if (m == 0) {
            return new int[]{};
        }
        int n = A[0].length;

        int[] result = new int[m * n];
        int indx = 0;

        // Spiral Order Matrix
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;
        int direction = 0;
        int i;

        while (top <= bottom && left <= right) {
            if (direction == 0) {
                for (i = left; i <= right; i++) {
                    result[indx++] = A[top][i];
                }
                top++;
            } else if (direction == 1) {
                for (i = top; i <= bottom; i++) {
                    result[indx++] = A[i][right];
                }
                right--;
            } else if (direction == 2) {
                for (i = right; i >= left; i--) {
                    result[indx++] = A[bottom][i];
                }
                bottom--;
            } else {
                for (i = bottom; i >= top; i--) {
                    result[indx++] = A[i][left];
                }
                left++;
            }

            direction = (direction + 1) % 4;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] result = spiralOrder(matrix);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
