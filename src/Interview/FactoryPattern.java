package Interview;
interface Product{
    public void show();
}
class ProductA implements Product{
    public void show(){
        System.out.println("i am productA");
    }
}
class ProductB implements Product{
    public void show(){
        System.out.println("i am productB");
    }
}
interface AbstractFactory{
    public Product newInstance();
}
class ProduceAFactory implements AbstractFactory{
    public Product newInstance (){
        return new ProductA();
    }
}
class ProduceBFactory implements AbstractFactory{
    public Product newInstance (){
        return new ProductB();
    }
}
public class FactoryPattern {

}
