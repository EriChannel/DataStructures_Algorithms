public interface IStackNQueue {
    //Mình áp dụng với mảng hoặc linked list có kiểu là số nguyên nên sẽ sử dụng với int
    public boolean push(int value); //Kiểm tra xem đã thêm thành không hay không
    public int pop();  
    public boolean isFull(); //Trước khi thêm phần tử thì mình cần kiểm tra xem stack hoặc queue có ful hay k
    public boolean isEmpty(); //Trước khi lấy ra phần tử thì cần kiển tra S hoặc Q có rỗng hay k
    public void print();
}
