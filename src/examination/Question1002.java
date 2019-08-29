package examination;

import java.util.*;

public class Question1002 {
    public List<String> commonChars(String[] A) {
        List<Map<String,Integer>> list=new ArrayList<>();
        Set<String> strings=new HashSet<>();
        for(String a:A){
            Map<String,Integer> map=new HashMap<>();
            char[] chars=a.toCharArray();
            for(char c:chars){
                strings.add(c+"");
                if(!map.containsKey(c+"")){
                    map.put(c+"",1);
                }else {
                    map.put(c+"",map.get(c+"")+1);
                }
            }
            list.add(map);
        }
        ArrayList<String> result=new ArrayList<>();
        for(String s:strings){
            int min=Integer.MAX_VALUE;
            for(Map<String,Integer> map:list){
                if(map.containsKey(s)){
                    int x=map.get(s);
                    if(min>x){
                        min=x;
                    }
                }else {
                    min=0;
                }
            }
            for(int i=0;i<min;i++){
                result.add(s);
            }
        }
        return result;
    }
}
