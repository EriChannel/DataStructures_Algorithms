public class Data {
    int key;
    int value;
    public Data(int key, int value) {
        this.key = key;
        this.value = value;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Data){
            return this.key == ((Data) obj).key; //So sánh key
        }
        return super.equals(obj);
    }
    
}
