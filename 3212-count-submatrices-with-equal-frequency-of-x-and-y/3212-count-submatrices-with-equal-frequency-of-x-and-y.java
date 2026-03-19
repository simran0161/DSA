class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] xcount = new int[n];
        int[] ycount = new int[n];

        int res = 0;

        for (int i = 0; i < m; i++) {
            int rowX = 0, rowY = 0;

            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 'X')
                    rowX++;
                else if (grid[i][j] == 'Y')
                    rowY++;

                xcount[j] += rowX;
                ycount[j] += rowY;

                if (xcount[j] == ycount[j] && xcount[j] > 0)
                    res++;
            }
        }

        return res;
    }
}