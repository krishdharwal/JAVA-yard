import java.util.ArrayList;
import java.util.LinkedList;

public class Hash_Map_with_collisionCure<K,V> {
    private ArrayList<LinkedList<Table>> list;
    private int size = 0;
    private float loadFactor = 0.5f;

    Hash_Map_with_collisionCure(){
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key,V value){
        int Hcode = Math.abs(key.hashCode() % list.size());

        // this is creating a linked list at every given index of ArrayList
        LinkedList<Table> box = list.get(Hcode);

        // if you want to update the value of an KEY
        // check in linked list for that particular index
        // checking for every object in linked list
        for (Table obj : box){
            if (obj.key.equals(key)){
                // update it
                obj.value = value;
                return;
            }
        }

        // checking for size & doubling it
        if ((float) size / list.size() > loadFactor ){
            reSizeHash();
        }

        // ADD new linked list in that index
        box.add(new Table(key, value));

        size++;
    }

    private void reSizeHash() {
        ArrayList<LinkedList<Table>> old = list;
        list = new ArrayList<>();

        size = 0;

        // incresed the size of the list
        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        // copy all the old values into new list
        for(LinkedList<Table> each_Idx : old){
            for (Table part : each_Idx)
                // adding by put method
                put(part.key, part.value);
        }
    }

    public V get_Value(K G_key){
        int Hcode = Math.abs(G_key.hashCode() % list.size());
        LinkedList<Table> box = list.get(Hcode);
        for(Table obj : box){
            if (obj.key.equals(G_key)){
                return obj.value;
            }
        }
        return null;
    }

    public void remove(K key){
        int Hcode = Math.abs(key.hashCode() % list.size());
        LinkedList<Table> box = list.get(Hcode);
        for (Table obj : box){
            if (obj.key.equals(key)){
                obj.key = null;
                break;
            }
        }
        size--;
    }


    public Boolean contains(K key){

        return get_Value(key) != null;

    }

    @Override
    public String toString() {
        StringBuffer map = new StringBuffer();
        map.append("[ ");
        for (LinkedList<Table> box: list){
         for (Table obj : box){
              map.append(obj.key + " " + obj.value + " , ");
         }
        }
        map.append(" ]");
        return map.toString();
    }

    private class Table{
        private K key;
        private V value;

        Table(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Hash_Map_with_collisionCure<String,String> map = new Hash_Map_with_collisionCure<>();

        map.put("krish","an java guy");
        map.put("sujal","an python guy");
        map.put("dharu","an C guy");
        map.put("Anki","an Army guy");

        // at one place
//        map.put(1212,"an java guy");
//        map.put(1212,"an python guy");
//        map.put(1212,"an C guy");
//        map.put(1212,"an Army guy");

        System.out.println(map);
    }
}
