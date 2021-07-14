package org.example.singleton;

/**
 * DCL双检索，解决懒汉模式线程不安全的问题
 *
 * @author MortonShaw
 * @date 2021/7/9 9:42
 */
public class Mgr06 {

    /**
     * volatile禁止指令重排，new操作不是原子性的
     *
     * 假设存在成员变量int a = 8，new操作指令如下
     * new -> 分配内存，赋默认值为0，此时该类的instance已经不为空
     * dup ->
     * invokespecial -> 赋初始值为8
     * astore_1 -> 内存赋给变量a
     * return ->
     *
     * 如果存在指令重排，astore_1跑到invokespecial上面
     * 这一瞬间其他线程进行了访问，就会有问题，即读到了半初始化状态的值
     */
    private static volatile Mgr06 INSTANCE;

    private Mgr06() {

    }

    public static Mgr06 getInstance() {
        // 先判断是否为空
        if (INSTANCE == null) {
            synchronized (Mgr06.class) {
                // 加锁瞬间有可能被其他线程初始化，所以还需检查，synchronized操作不是原子性的
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // new操作不是原子性的
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

}
