package Interview;

public class NullExplorer {
    private static String z;
    public static void main(String[] args) {
        String x=null;
        String y="";
        System.out.println(x==z); //true;
        System.out.println(x=="");//false
        System.out.println(y.equals(x));//false
    }
}
