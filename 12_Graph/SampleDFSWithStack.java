import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SampleDFSWithStack {
    public static void main(String[] args) {
        int[][] graph = {   { 0, 1, 0, 0, 0, 0, 0}, 
                            { 1, 0, 1, 0, 0, 0, 1},
                            { 0, 1, 0, 1, 1, 1, 1},
                            { 0, 0, 1, 0, 0, 1, 0},
                            { 0, 0, 1, 0, 0, 1, 0},
                            { 0, 0, 1, 1, 1, 0, 0},
                            { 0, 1, 1, 0, 0, 0, 0}};

        //Khai báo
        Stack<Integer> stack = new Stack<>();
        Set<Integer> daDuyet = new HashSet<>();

        //Chọn đỉnh đầu là 0
        stack.add(0);
        daDuyet.add(0);

        while(!stack.isEmpty()){
            int u = stack.pop();
            System.out.print(u + "\t");

            //Add tất cả đỉnh kề v với u mà chưa được duyệt vào stack

            for (int v = 0; v < graph.length; v++) {
                if(graph[u][v] == 1 && daDuyet.contains(v) == false){
                    stack.add(v);
                    daDuyet.add(v);
                }
            }

        }
    }
}
