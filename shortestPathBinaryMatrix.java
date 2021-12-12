import java.util.*;
class shortestPathBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        HashSet<String> visited = new HashSet<String>();
        Queue<List<Integer>> queue = new LinkedList<List<Integer>>();
        List<Integer> coord = new ArrayList<Integer>();
        List<Integer> newCoord = new ArrayList<Integer>();
        int[][] directions = {{-1,-1},{-1,1},{1,-1},{1,1},{-1,0},{1,0},{0,-1},{0,1}};
        int[][] pathLength = new int[grid.length][grid[0].length];
        int[] currentDirection;
        int currentDist;
        int dist = -1;

        if(grid[0][0] == 0) {
            pathLength[0][0] = 1;
            coord.add(0);
            coord.add(0);
            queue.add(new ArrayList(coord));
            visited.add("" + coord.get(0) + ',' + coord.get(1));
        }
        
        while(!queue.isEmpty()) {
            coord.clear();
            coord = queue.remove();
            currentDist = pathLength[coord.get(0)][coord.get(1)];
            for(int i = 0; i < directions.length; i++) {
                currentDirection = directions[i];
                newCoord.clear();
                newCoord.add(coord.get(0) + currentDirection[0]);
                newCoord.add(coord.get(1) + currentDirection[1]);
                if(((newCoord.get(0) < grid.length && newCoord.get(0) >= 0)) &&
                        ((newCoord.get(1) < grid.length && newCoord.get(1) >= 0)) && grid[newCoord.get(0)][newCoord.get(1)] == 0) {
                    if(pathLength[newCoord.get(0)][newCoord.get(1)] == 0) {
                        pathLength[newCoord.get(0)][newCoord.get(1)] = pathLength[coord.get(0)][coord.get(1)] + 1;
                    }
                    if(!visited.contains("" + newCoord.get(0) + ',' + newCoord.get(1))) {
                        queue.add(new ArrayList(newCoord));
                        visited.add("" + newCoord.get(0) + ',' + newCoord.get(1));
                    }
                }
            }
        }
        
        if(pathLength[grid.length-1][grid[0].length-1] == 0) return -1;
        return pathLength[grid.length-1][grid[0].length-1];
    }
}
