package examination;

import java.util.*;

public class Question380 {
    List<Integer> list;
    Map<Integer,Integer> hashMap;
    int size;
    /** Initialize your data structure here. */
    public Question380() {
        list=new LinkedList<>();
        hashMap=new HashMap<>();
        size=0;
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!hashMap.containsKey(val)){
            list.add(size,val);
            hashMap.put(val,size++);
            return true;
        }else {
            return false;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!hashMap.containsKey(val)){
            return false;
        }else if(list.size()==0){
            hashMap.remove(val);
        }else {
            int tail=list.get(size-1);
            hashMap.put(tail,hashMap.get(val));
            list.set(hashMap.get(val),tail);
            hashMap.remove(val);
            size--;

        }
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        Random random=new Random();
        return list.get(random.nextInt(size));
    }

    public static void main(String[] args) {
        Question380 question380=new Question380();
        question380.insert(3);
        question380.insert(-2);
        question380.remove(2);
        question380.insert(1);
        question380.insert(-3);
        question380.insert(-2);
        question380.remove(-2);
        question380.remove(3);
        question380.insert(-1);
        question380.remove(-3);

    }
}
