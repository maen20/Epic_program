import java.util.LinkedList;

public  class MyHashMap<K,V> {
    private static final int DEFAULT_CAPACITY = 100;
    private int size;
    public int size() {
        return size;
    }
    public MyHashMap() { this(DEFAULT_CAPACITY); }
    public MyHashMap(int capacity) {
        buckets = new LinkedList[capacity];
        size = 0;
    }
    private  LinkedList<Pair<K,V>>[] buckets;

    public void put(K key, V value){
        int index=key.hashCode()% buckets.length;
        if(buckets[index]==null){
            buckets[index]=new LinkedList<>();
        }
        LinkedList<Pair<K,V>> list = buckets[index];
        for(Pair<K,V>pair:list){
            if(pair.key.equals(key))
            {
                pair.value=value;
                return;
            }
        }
        list.add(new Pair<>(key,value));
        size++;
    }
    public V getValueByKey(K key){
        int index=key.hashCode()% buckets.length;
        LinkedList<Pair<K, V>> list = buckets[index];
        //if key exists
        if(list !=null){
            for (Pair<K,V> pair:list)
            {
                if(pair.key.equals((key)))
                    return pair.value;
            }
        }
        return null; //if key doesnt exist
    }
    public  static class Pair<K,V> {
        private K key;
        private  V value;
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }

}
