// User function Template for Java

class Solution {
    public int[][] searchWord(char[][] board, String word) {
       int n = board.length;
        int m = board[0].length;
        List<int[]> list = new ArrayList<>();

        int[][] directions = {
            {1, 0}, {0, 1}, {-1, 0}, {0, -1},
            {1, 1}, {-1, -1}, {-1, 1}, {1, -1}
        };

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int[] dir : directions) {
                    if (find(i, j, board, word, dir[0], dir[1])) {
                        list.add(new int[]{i, j});
                        break; 
                    }
                }
            }
        }

        int[][] resArr = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            resArr[i] = list.get(i);
        }
        return resArr;
    }

    public boolean find(int i, int j, char[][] board, String word, int dx, int dy) {
        int n = board.length;
        int m = board[0].length;

        for (int k = 0; k < word.length(); k++) {
            int ni = i + k * dx;
            int nj = j + k * dy;

            if (ni < 0 || nj < 0 || ni >= n || nj >= m || board[ni][nj] != word.charAt(k)) {
                return false;
            }
        }
        return true;
    }

}