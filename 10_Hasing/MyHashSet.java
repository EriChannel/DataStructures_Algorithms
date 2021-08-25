import java.util.ArrayList;

public class MyHashSet {
    private final int SIZE = 1000;
    private ArrayList<Integer> myBuckets[]; //Một mảng các ArrayList, tương tự mảng 2 chiều

    MyHashSet(){
        myBuckets = new ArrayList[SIZE]; //Mảng bucket chứa 1000 phần tử
        for (int i = 0; i < myBuckets.length; i++) {
            //Mỗi phần tử trong một mảng là một ArrayList
            myBuckets[i] = new ArrayList<>(); //Khởi tạo ArrayList cho từng phần tử mảng
        }
    }

    // return hashValue: là index của một bucket nào đấy
    private int hashFunction(int key){
        int hashValue = key % SIZE;
        return hashValue;
    }

    public void add(int key){
        //b1: băm (hash key sang hash value)
        int hashValueIndex = hashFunction(key); //Thêm đuôi index vì nó là index của bucket
        //Tham chiếu hashValueIndex đến cái bucket
        var bucket = myBuckets[hashValueIndex]; //var: đỡ phải ghi cả chữ ArrayList
        //Kiểm tra xem đã tồn tại key hay chưa
        int keyIndex = bucket.indexOf(key); //
        if(keyIndex < 0){ //Nếu không có index
            bucket.add(key);
        }
    }

    public void remove(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if(keyIndex >= 0){
            bucket.remove(keyIndex);
        }
    }

    public boolean contains(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        return keyIndex >= 0;
    }

    public static void main(String[] args) {
        MyHashSet mySet = new MyHashSet();
        mySet.add(1);
        mySet.add(5001); 
        mySet.add(2);
        System.out.println("mySet.contains(1): " + mySet.contains(1));
        mySet.remove(1);
        System.out.println("mySet.contains(1): " + mySet.contains(5001));
    }
}
