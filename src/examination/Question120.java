package examination;

import java.util.ArrayList;
import java.util.List;

public class Question120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> min=new ArrayList<>();
        ArrayList<Integer> original=new ArrayList<>();
        original.add(triangle.get(0).get(0));
        int size=triangle.size();
        min.add(original);
        for(int i=1;i<size;i++){
            ArrayList<Integer> arrayList=new ArrayList<>();
            arrayList.add(min.get(i-1).get(0)+triangle.get(i).get(0));
            for(int j=1;j<i;j++){
                arrayList.add(Math.min(min.get(i-1).get(j-1),min.get(i-1).get(j))+triangle.get(i).get(j));
            }
            arrayList.add(min.get(i-1).get(i-1)+triangle.get(i).get(i));
            min.add(arrayList);
        }
        int minTotal=Integer.MAX_VALUE;
        for(Integer i:min.get(size-1)){
            if(i<minTotal){
                minTotal=i;
            }
        }
        return minTotal;
    }

    public static void main(String[] args) {
        Question120 question120=new Question120();
        List<List<Integer>> input=new ArrayList<>();
        List<Integer> Layer1=new ArrayList<>();
        Layer1.add(2);
        input.add(Layer1);
        List<Integer> Layer2=new ArrayList<>();
        Layer2.add(3);
        Layer2.add(4);
        input.add(Layer2);
        List<Integer> Layer3=new ArrayList<>();
        Layer3.add(6);
        Layer3.add(5);
        Layer3.add(7);
        input.add(Layer3);
        List<Integer> Layer4=new ArrayList<>();
        Layer4.add(4);
        Layer4.add(1);
        Layer4.add(8);
        Layer4.add(3);
        input.add(Layer4);

        question120.minimumTotal(input);
    }
}
