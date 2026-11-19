public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i==j){
            return 0;
        }

        if (m[i][j] == 1) {
            return 1;
        }
        int shortestPath = Integer.MAX_VALUE;
        for (int k = 0; k < m.length; k++) {
            if (m[i][k] == 1) {
                int pathLength = findShortestPath(m, k, j);
                if (pathLength != -1 && pathLength + 1 <= shortestPath) {
                    shortestPath = 1 + pathLength;
                }
            }
        }
        if (shortestPath != Integer.MAX_VALUE) {
            return shortestPath;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}