public class Demo_Recursion {
    public static void methodA(){
        System.out.println("A");
        methodA();
    }

    //Tính giai thừa bằng vòng lặp for
    public static int factorialWhithFor(int n){
        int factorial = 1;
        if(n == 0){
            return factorial;
        }else{
            for(int i = 1; i <= n; i++){
                factorial *= i;
            }
            return factorial;
        }

    }

    //Tính giai thừa sử dụng đệ quy
    public static int factorial(int n){
        if(n == 0){  // 0! = 1
            return 1;
        }

        //Công thức đệ quy
        return n*factorial(n-1);
    }

    //Tính luỹ tiến
    public static int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    public static int tailSum(int currentSum, int n){
        if(n <= 1){
            return currentSum + n;
        }
        return tailSum(currentSum + n, n - 1);
    }

    public static void main(String[] args) {
        //methodA();
        //System.out.println("5! = " + factorial(5));
        

        System.out.println(sum(5));
        
    }
    
}
