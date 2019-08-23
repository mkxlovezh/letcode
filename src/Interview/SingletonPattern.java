package Interview;

/**
 * 饿汉模式
 */
//public class SingletonPattern {
//    private static final SingletonPattern singletonPattern=new SingletonPattern();
//
//    public static SingletonPattern getSingletonPattern() {
//        return singletonPattern;
//    }
//}

/**
 * 懒汉模式
 */
//public class SingletonPattern{
//    private static  SingletonPattern singletonPattern=null;
//
//    public static synchronized SingletonPattern getSingletonPattern() {
//        if(singletonPattern==null){
//            return new SingletonPattern();
//        }else {
//            return singletonPattern;
//        }
//
//    }
//}

/**
 * 改进的懒汉模式
 */
public class SingletonPattern{
    private static SingletonPattern singletonPattern=null;

    public static SingletonPattern getSingletonPattern() {
        if(singletonPattern==null){
            synchronized (SingletonPattern.class){
                if(singletonPattern==null){
                    singletonPattern=new SingletonPattern();
                }
            }
        }
        return singletonPattern;
    }
}
