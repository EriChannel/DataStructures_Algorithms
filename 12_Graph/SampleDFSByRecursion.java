import java.util.HashSet;
import java.util.Set;

public class SampleDFSByRecursion {
    public static void DFS(int u, int[][] graph, Set<Integer> daDuyet)
    {
        // xử lý đỉnh u (in u ra màn hình)
        System.out.print(u + " ");
        
        //add u chua được duyệt vào stack
        //thử với for (int v = 0; v <graph.length - 1; v++)
        for (int v = graph.length-1; v >= 0; v--) //Duyệt v
        {
            if(graph[u][v] == 1 && daDuyet.contains(v) == false)
            {
                daDuyet.add(v); //đánh dẫu là đã duyệt
                DFS(v, graph, daDuyet); //gọi đệ quy
            }
        }

    }

    public static void main(String[] args) {
        int[][] graph = {   { 0, 1, 0, 0, 0, 0, 0}, 
                            { 1, 0, 1, 0, 0, 0, 1},
                            { 0, 1, 0, 1, 1, 1, 1},
                            { 0, 0, 1, 0, 0, 1, 0},
                            { 0, 0, 1, 0, 0, 1, 0},
                            { 0, 0, 1, 1, 1, 0, 0},
                            { 0, 1, 1, 0, 0, 0, 0}};
        //
        Set<Integer> daDuyet = new HashSet<>();
        daDuyet.add(0); //add đỉnh 0
        DFS(0, graph, daDuyet); // duyệt từ đỉnh 0
    }
}
