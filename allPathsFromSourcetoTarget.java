import java.util.*;
class allPathsFromSourcetoTarget {
    public List<List<Integer>> lists = new ArrayList<List<Integer>>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(0);
        DFS(stack, new ArrayList<Integer>(), graph);
        return lists;
    }
    public void DFS(Stack<Integer> stack, List<Integer> path, int[][] graph) {
        int node;
        while(!stack.isEmpty()) {
            node = stack.pop();
            path.add(node);
            if(node == graph.length-1) {
                lists.add(new ArrayList(path));
            }
            for(int i = 0; i < graph[node].length; i++) {
                stack.add(graph[node][i]);
                DFS(stack, new ArrayList(path), graph);
            }
        }
    }
}
