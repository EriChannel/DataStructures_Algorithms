import java.util.ArrayList;

public class MyHashMap {
    private class Data { //Tạo class riêng vì trong list chứa cả object chứ không chỉ key
        int key;
        int value;
        Data(int key, int value){
            this.key = key;
            this.value = value;
        }
        //Hai object key và vâlue phân biệt với nhau bởi key. 
        //Vậy  nên hai object được coi là bằng nhau khi key bằng nhau
        // Trong Java, từ khóa instanceof là một toán tử nhị phân. 
        // Nó được sử dụng để kiểm tra xem một đối tượng có phải là một instance của một class cụ thể hay không. ... 
        // Kết quả sẽ true nếu một đối tượng là một instance của một class và sẽ là false nếu nó không phải.
        @Override
        public boolean equals(Object other) { //Tìm key trong array
            if(other instanceof Data)
                return this.key == ((Data)other).key; // so sánh key
            return false;
        }
    }

    private final int SIZE = 1000;
    private ArrayList<Data> myBuckets[];

    public MyHashMap(){
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key){
        return key % SIZE;
    }

    public void put(int key, int value){
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data newData = new Data(key, value);
        int keyIndex = bucket.indexOf(newData);
        if(keyIndex >= 0){
            bucket.get(keyIndex).value = value;
        }else{
            bucket.add(newData);
        }

        int x = 0; //Chỉ dùng để debug
    }

    public void remove(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data myDeleteData = new Data(key, 0);
        bucket.remove(myDeleteData);
    }

    public int get(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data findData = new Data(key, 0);
        int keyIndex = bucket.indexOf(findData);
        if(keyIndex >= 0){
            return bucket.get(keyIndex).value;
        }
        return -1;
    }

    public static void main(String[] args) {
        MyHashMap myMap = new MyHashMap();
        myMap.put(1, 1);
        myMap.put(1, 2);
        myMap.put(10, 2);
        System.out.println("myMap.get(1): " + myMap.get(1));
        System.out.println("myMap.get(2): " + myMap.get(2));
        myMap.remove(1);
        System.out.println("myMap.get(1) " + myMap.get(1));
        System.out.println("myMap.get(10) " + myMap.get(10));
    }

}
