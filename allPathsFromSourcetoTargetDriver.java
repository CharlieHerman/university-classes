import java.util.*;
public class allPathsFromSourcetoTargetDriver {
    public static void main(String args[]) {
        allPathsFromSourcetoTarget obj = new allPathsFromSourcetoTarget();
        int[][] graph = {{4,3,1},{3,2,4},{3},{4},{}};
        List<List<Integer>> lists = obj.allPathsSourceTarget(graph);

        System.out.print('[');
        for(int i = 0; i < lists.size(); i++) {
            System.out.print('[');
            for(int j = 0; j < lists.get(i).size(); j++) {
                System.out.print(lists.get(i).get(j));
                if(j != lists.get(i).size()-1) {
                    System.out.print(',');
                }
            }
            System.out.print(']');
        }
        System.out.println(']');
    }
}
