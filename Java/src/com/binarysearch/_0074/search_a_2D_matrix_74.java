package java.src.com.binarysearch._0074;

class SearchA2DMatrix {
  public boolean searchMatrix(int[][] matrix, int target) {
    int row = matrix.length;
    int column = matrix[0].length;

    if (row == 0) {
      return false;
    }

    int n = 0;

    for (int i = 0; i < row; i++) {
      if (matrix[i][column - 1] >= target && matrix[i][0] <= target) {
        n = i;
        break;
      }
    }

    int l = 0;
    int r = column - 1;
    int m = l + (r - l) / 2;

    while (l <= r) {
      if (matrix[n][m] == target) {
        return true;
      } else if (matrix[n][m] > target) {
        r = m - 1;
      } else if (matrix[n][m] < target) {
        l = m + 1;
      }
      m = l + (r - l) / 2;
    }

    return false;
  }

  public static void main(String[] args) {
    int[][] matrix = { { -9, -7, -7, -5, -3 }, { -1, 0, 1, 3, 3 }, { 5, 7, 9, 11, 12 }, { 13, 14, 15, 16, 18 },
        { 19, 21, 22, 22, 22 } };
    int target = -4;

    SearchA2DMatrix solution = new SearchA2DMatrix();
    boolean answer = solution.searchMatrix(matrix, target);
    System.out.println(answer);
  }
}