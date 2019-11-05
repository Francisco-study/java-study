package creation.singleton;

import org.jetbrains.annotations.Contract;

/**
 * 无锁的线程安全模式，饱汉式，如果需要提前实例化，最好先调用一下
 */
public class LockFreeSingleton {

    private static LockFreeSingleton instance = new LockFreeSingleton();

    @Contract(pure = true)
    private LockFreeSingleton(){}

    public static synchronized LockFreeSingleton getInstance() {
        return instance;
    }
}
