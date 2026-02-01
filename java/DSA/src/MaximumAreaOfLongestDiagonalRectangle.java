/*Input: dimensions = [[9,3],[8,6]]
Output: 48
Explanation:
        For index = 0, length = 9 and width = 3. Diagonal length = sqrt(9 * 9 + 3 * 3) = sqrt(90) ≈ 9.487.
        For index = 1, length = 8 and width = 6. Diagonal length = sqrt(8 * 8 + 6 * 6) = sqrt(100) = 10.
        So, the rectangle at index 1 has a greater diagonal length therefore we return area = 8 * 6 = 48. */

public class MaximumAreaOfLongestDiagonalRectangle {
    public static void main(String[] args) {
        int[][] matrix = {{9, 3}, {8, 6}};

        double maxDiagonal = 0;
        int maxArea = 0;

        for (int i = 0; i < matrix.length; ++i) {
            int length = matrix[i][0];
            int width = matrix[i][1];

            double diagonal = Math.sqrt(length * length + width * width);
            int area = length * width;

            if (diagonal > maxDiagonal || (diagonal == maxDiagonal && area > maxArea)) {
                maxDiagonal = diagonal;
                maxArea = area;
            }
        }

        System.out.println("Max diagonal = " + maxDiagonal);
        System.out.println("Max area = " + maxArea);
    }
}

