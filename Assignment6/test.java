public class test {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("maen", 1);
        map.put("ahmad", 2);


        Integer value1 = map.getValueByKey("maen");
        System.out.println(value1);
    }
}


