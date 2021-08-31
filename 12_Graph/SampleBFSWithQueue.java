import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class SampleBFSWithQueue {
    public static void main(String[] args) {
        int[][] graph = {   { 0, 1, 0, 0, 0, 0, 0}, 
                            { 1, 0, 1, 0, 0, 0, 1},
                            { 0, 1, 0, 1, 1, 1, 1},
                            { 0, 0, 1, 0, 0, 1, 0},
                            { 0, 0, 1, 0, 0, 1, 0},
                            { 0, 0, 1, 1, 1, 0, 0},
                            { 0, 1, 1, 0, 0, 0, 0}};

        //Khai báo
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> daDuyet = new HashSet<>();

        //Chọn đỉnh đầu là 0
        queue.add(0);
        daDuyet.add(0);

        while(!queue.isEmpty()){
            int u = queue.poll();
            System.out.print(u + "\t");

            //Add tất cả đỉnh kề v với u mà chưa được duyệt vào queue

            for (int v = 0; v < graph.length; v++) {
                if(graph[u][v] == 1 && daDuyet.contains(v) == false){
                    queue.add(v);
                    daDuyet.add(v);
                }
            }

        }
    }
    
}
