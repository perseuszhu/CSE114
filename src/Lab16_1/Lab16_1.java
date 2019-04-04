package Lab16_1;

public class Lab16_1 {

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int maxR = 0;
        int maxC = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = ((int) (10 * Math.random())) % 2;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            int R1 = 0;
            int C1 = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    R1++;
                }
                if (matrix[j][i] == 1) {
                    C1++;
                }
            }
            if (R1 > maxR) {
                maxR = R1;
                row = i;
            }
            if (C1 > maxC) {
                maxC = C1;
                col = i;
            }
        }
        System.out.println("The largest row index: " + row);
        System.out.println("The largest column index: " + col);
    }
}
