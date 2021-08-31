public class Dijskstra {
    public static void main(String[] args) {
        int[][] graph = {{0,6,0,1,0},
                         {6,0,5,2,2},
                         {0,5,0,0,5},
                         {1,2,0,0,1},
                         {0,2,5,1,0}};
        int start = 0;
        int finish = 2;

        dijskstra(graph, start, finish);
    }

    private static void dijskstra(int[][] graph, int start, int finish) {
        int v = graph.length;
        boolean visited[] = new boolean[v];
        int distance[] = new int[v];

        distance[start] = 0;
        for (int i = 1; i < v; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        for(int i = 0; i < v-1; i++){
            //tìm đỉnh kề có khoảng cách nhỏ nhất
            int minVertex = findMinVertex(distance, visited);
            visited[minVertex] = true;

            //tìm đỉnh kề với đỉnh vừa tìm
            for (int j = 0; j < v; j++) {
                if(graph[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE){
                    int newDistance = distance[minVertex] + graph[minVertex][j];
                    if(newDistance < distance[j]){
                        distance[j] = newDistance;
                    }

                }
            }
        }
        System.out.println(start + "->" +finish+ " = " + distance[finish]);
        // for (int i = 0; i < v; i++) {
        //     System.out.println(i + " " + distance[i]);
        // }
    }

    private static int findMinVertex(int[] distance, boolean[] visited) {
        int minVertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if(!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])){
                minVertex = i;
            }
            
        }
        return minVertex;
    }
    
}
