import java.util.*;

public class BFS {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> hash = new HashMap<>();
        hash.put(0, Arrays.asList(1, 2));
        hash.put(1, Arrays.asList(0, 2));
        hash.put(2, Arrays.asList(0, 1, 3));
        hash.put(3, Arrays.asList(2));
        bfs(0, hash);
    }

    public static void bfs(int start, Map<Integer, List<Integer>> graph) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.remove();
            System.out.print(vertex + " ");

            for (int neighbor : graph.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}