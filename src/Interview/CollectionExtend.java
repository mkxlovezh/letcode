package Interview;

import java.util.*;
interface inter{
    public void show();
}
public class CollectionExtend {
    private int x=0;
    private void all(int l){
        class inner{
            public void show(){
                System.out.println(CollectionExtend.this.x);
            }
        }
    }
    public static class inner1{
        public void show(){

        }
    }
    public class Node<K,V> implements Map.Entry{

        @Override
        public Object getKey() {
            System.out.println(CollectionExtend.this.x);
            return null;
        }

        @Override
        public Object getValue() {
            return null;
        }

        @Override
        public Object setValue(Object value) {
            return null;
        }
    }
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> arrayList=new ArrayList<>();
        LinkedList<Integer> linkedList=new LinkedList<>();
        HashMap<String,Integer> hashMap=new HashMap<>();
        Hashtable hashtable=new Hashtable();
        Set<Map.Entry<String,Integer>> set=hashMap.entrySet();
        String str="你好";
        byte[] bytes=str.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes));

    }
}
