package Interview;
interface Target{
    public void show();
}
class OriginProduct{
    public void say(){
        System.out.println("i am OriginProduct");
    }
}
class Adapter extends OriginalProduct implements Target{
    public void show(){
        System.out.println();
    }
}
public class AdapterPattern {

}
