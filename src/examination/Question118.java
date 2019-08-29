package examination;

import java.util.ArrayList;
import java.util.List;

public class Question118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        if(numRows==0){
            return result;
        }
        if(numRows==1){
            List<Integer> list0=new ArrayList<>();
            list0.add(1);
            result.add(list0);
            return result;
        }


        List<List<Integer>> l=generate(numRows-1);
        List<Integer> last=l.get(l.size()-1);
        List<Integer> add=new ArrayList<>();
        add.add(1);
        for(int i=0;i<l.size()-1;i++){
            add.add(last.get(i)+last.get(i+1));
        }
        add.add(1);
        l.add(add);
        return l;
    }
}
