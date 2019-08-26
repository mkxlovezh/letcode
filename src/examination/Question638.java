package examination;

import java.util.ArrayList;
import java.util.List;

public class Question638 {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int min=Integer.MAX_VALUE;
        boolean flag=false;
        for(List<Integer> l:special){

            if(judget(l,needs)){
                ArrayList<Integer> list=new ArrayList<>();
                for(int i=0;i<needs.size();i++){
                    list.add(needs.get(i)-l.get(i));
                }
                int x=shoppingOffers(price,special,list)+l.get(l.size()-1);
                if(x<min){
                    min=x;
                }
                flag=true;
            }
        }
        int sum=0;
        for(int i=0;i<needs.size();i++){
            sum+=price.get(i)*needs.get(i);
        }
        if(flag==false){
            return sum;
        }else {

            return Math.min(sum,min);
        }


    }
    public boolean judget(List<Integer> l,List<Integer> needs){
        boolean flag=true;
        for(int i=0;i<needs.size();i++){
            if(l.get(i)>needs.get(i)){
                flag=false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Question638 question638=new Question638();
        List<Integer> price=new ArrayList<>();
        price.add(2);
        price.add(3);
        price.add(4);
        List<List<Integer>> special=new ArrayList<>();
        List<Integer> s1=new ArrayList<>();
        s1.add(1);
        s1.add(1);

        s1.add(0);
        s1.add(4);
        List<Integer> s2=new ArrayList<>();
        s2.add(2);
        s2.add(2);
        s2.add(1);
        s2.add(9);
        special.add(s1);
        special.add(s2);
        List<Integer> needs=new ArrayList<>();
        needs.add(1);
        needs.add(2);
        needs.add(1);
        System.out.println(question638.shoppingOffers(price,special,needs));

    }
}
