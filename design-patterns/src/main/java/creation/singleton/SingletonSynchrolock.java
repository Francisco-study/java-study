package creation.singleton;

import org.jetbrains.annotations.Contract;

/**
 * 同步锁单例模式，如果需要提前实例化，最好先调用一下
 */
public class SingletonSynchrolock {

    private static SingletonSynchrolock instance;

    @Contract(pure = true)
    private SingletonSynchrolock(){}

    public static synchronized SingletonSynchrolock getInstance() {
        if (instance == null){
            instance = new SingletonSynchrolock();
        }
        return instance;
    }
}
