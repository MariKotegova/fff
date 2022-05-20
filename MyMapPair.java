public class MyMapPair <K, V>{
    protected K key;
    protected V value;

    public MyMapPair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public void setValue(V value){
        this.value = value;
    }

    public V getValue(){
        return value;
    }
}
