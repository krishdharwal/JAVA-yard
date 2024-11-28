// problem -> this will override the element if some other object got same index value

import java.util.Arrays;

public class Custom_Hashmap{
    private Hash_Table[] arr;

    Custom_Hashmap(){
        arr = new Hash_Table[10];
    }

    // adding
    public void put(String key,String vlaue){
        int code = key.hashCode() % 10;
        arr[code] = new Hash_Table(key,vlaue);;
    }

    public void get(String key){
        int code = key.hashCode() % 10;
        if (arr[code]  != null && arr[code].key.equals(key)){
            System.out.println("your key's value is at -> " + code + " -> " + arr[code].key  );
        }
        else System.out.println("sorry not found");
    }

    public void remove(String key){
        int code = Math.abs(key.hashCode() % 10);
        if (arr[code] != null){
            System.out.println("deleted -> " + arr[code].key + "  " + arr[code].value);
            arr[code] = null;
        }
    }

    private class Hash_Table{
        private String key;
        private String value;
        public Hash_Table(String key,String value){
            this.key = key;
            this.value = value;
        }
    }

    public void display(){
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] != null ? arr[i].key : null + " - ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Custom_Hashmap{" +
                "arr=" + arr[0] +
                '}';
    }

    public static void main(String[] args) {
        Custom_Hashmap map = new Custom_Hashmap();

        map.put("krish","an java guy");
        map.get("krish");
//        map.remove("krish");



        System.out.println(map);
    }
}
