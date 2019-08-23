package Interview;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理模式
 */
//interface AbstractProxy{
//    public void show();
//}
//class OriginProduct implements AbstractProxy{
//    public void show(){
//        System.out.println("i am OriginProduct");
//    }
//}
//class ProxyProduct implements AbstractProxy{
//    private OriginProduct originProduct;
//    public void show(){
//        if(originProduct==null){
//            originProduct=new OriginProduct();
//        }
//        originProduct.show();
//        System.out.println("i am ProxyProduct");
//    }
//
//}

/**
 * JDK动态代理
 */
//interface ProxyInterface{
//    public void show();
//}
//class OriginalProduct implements ProxyInterface{
//    public void show(){
//        System.out.println("i am OriginalProduct");
//    }
//}
//class JDKProxy implements InvocationHandler{
//    ProxyInterface originalProduct;
//    public JDKProxy(ProxyInterface proxyInterface){
//        this.originalProduct=proxyInterface;
//    }
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        if(method.getName()=="show"){
//            method.invoke(originalProduct,args);
//            System.out.println("after add");
//        }
//        return proxy;
//    }
//}

/**
 * cglib动态代理
 */
class OriginalProduct{
    public void show(){
        System.out.println("i am originalProduct");
    }
}
class CglibProxy implements MethodInterceptor{

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if(method.getName()=="show"){
            Object obj=methodProxy.invokeSuper(o,objects);
            System.out.println("after");
            return obj;
        }else {
            return methodProxy.invokeSuper(o,objects);
        }

    }
}
public class ProxyPattern {
    public static void main(String[] args) {
//        ProxyInterface proxy=(ProxyInterface) Proxy.newProxyInstance(OriginalProduct.class.getClassLoader(),OriginalProduct.class.getInterfaces(),new JDKProxy(new OriginalProduct()));
//        proxy.show();
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(OriginalProduct.class);
        enhancer.setCallback(new CglibProxy());
        OriginalProduct originalProduct=(OriginalProduct) enhancer.create();
        originalProduct.show();
    }
}
