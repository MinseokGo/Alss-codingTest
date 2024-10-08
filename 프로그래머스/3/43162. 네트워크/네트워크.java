import java.util.*;

class Solution {
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                // dfs(computers, visited, i);
                bfs(computers, visited, i);
            }
        }
        
        return answer;
    }
    
    private void dfs(int[][] computers, boolean[] visited, int index) {
        visited[index] = true;
        
        for (int i = 0; i < computers.length; i++) {
            if (i != index && !visited[i] && computers[index][i] == 1) {
                dfs(computers, visited, i);
            }
        }
    }
    
    private void bfs(int[][] computers, boolean[] visited, int index) {
        visited[index] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(index);
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            int[] computer = computers[current];
            for (int i = 0; i < computer.length; i++) {
                if (i != current && !visited[i] && computer[i] == 1) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}