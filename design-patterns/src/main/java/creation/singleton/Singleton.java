package creation.singleton;

import org.jetbrains.annotations.Contract;

/**
 * 简单的单例模式，饿汉式，如果需要提前实例化，最好先调用一下
 */
public class Singleton {
    private static Singleton instance;

    @Contract(pure = true)
    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomeThing(){
        System.out.println("做一些有趣的事");
    }
}
