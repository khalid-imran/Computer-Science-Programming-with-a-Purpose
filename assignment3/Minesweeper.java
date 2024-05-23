public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        char[][] grid = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '0';
            }
        }

        // Step 2: Place mines randomly
        int placedMines = 0;
        while (placedMines < k) {
            int row = (int) (Math.random() * m);
            int col = (int) (Math.random() * n);
            if (grid[row][col] != '*') {
                grid[row][col] = '*';
                placedMines++;
            }
        }

        // Step 3: Count neighboring mines
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '*') {
                    continue;
                }
                int count = 0;
                // Loop through all 8 neighbors
                for (int x = -1; x <= 1; x++) {
                    for (int y = -1; y <= 1; y++) {
                        if (x == 0 && y == 0) {
                            continue;
                        }
                        int ni = i + x;
                        int nj = j + y;
                        if (ni >= 0 && ni < m && nj >= 0 && nj < n && grid[ni][nj] == '*') {
                            count++;
                        }
                    }
                }
                grid[i][j] = (char) (count + '0');
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
