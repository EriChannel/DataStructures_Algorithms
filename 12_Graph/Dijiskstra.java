import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dijiskstra {
    public static void main(String[] args) {
        int start = 0;
        int finish = 4;
        int[][] a = {   { 0, 6, 0, 1, 0 }, 
                        { 6, 0, 5, 2, 2 }, 
                        { 0, 5, 0, 0, 5 }, 
                        { 1, 2, 0, 0, 1 }, 
                        { 0, 2, 5, 1, 0 } };

        dijkstra(a);

        // Scanner sc = new Scanner(System.in);
        // int v = sc.nextInt(); 
        // int e = sc.nextInt();
        // int a [][] = new int[v][v];
        // for (int i = 0; i < e; i++) {
        //     int v1 = sc.nextInt();
        //     int v2 = sc.nextInt();
        //     int weight = sc.nextInt();
        //     a[v1][v2] = weight;
        //     a[v2][v1] = weight;
        // }
        // dijkstra(a);

        
    }

    private static void dijkstra(int[][] a){
        int v = a.length;
        boolean visited[] = new boolean[v]; //Để kiểm tra xem đã duyêth hay chưa
        int distance[] = new int[v];
        distance[0] = 0;
        for (int i = 1; i < v; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < v-1; i++) {
            //tìm đỉnh có khoảng cách nhỏ nhất
            int minVertex = findMinVertex(distance, visited);
            visited[minVertex] = true;
            //explore neighbors
            for (int j = 0; j < v; j++) {
                if(a[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE){
                    int newDistance = distance[minVertex] + a[minVertex][j];
                    if(newDistance < distance[j]){
                        distance[j] = newDistance;
                    }
                }
            }
           
            
        }


        //print
        System.out.println(2 + " " +distance[2]);
        // for (int i = 0; i < v; i++) {
        //     System.out.println(i +" " + distance[i]);
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
