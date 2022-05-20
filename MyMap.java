import java.util.ArrayList;
import java.util.List;

public class MyMap<K, V> {

    protected List<MyMapPair<K, V>> pair = new ArrayList<>();

    public void put(K key, V value){
        for(MyMapPair<K, V> kv: pair){
            if(kv.getKey().equals(key)){
                kv.setValue(value);
                return;
            }
        }
        MyMapPair<K, V> newKV = new MyMapPair<>(key, value);
        pair.add(newKV);

    }

    public V get( K key){
        for(MyMapPair<K, V> kv : pair){
            if(kv.getKey().equals(key)){
                return kv.getValue();
            }

        }
        return null;
        // возврвщать значения юзер инфо
    }

}