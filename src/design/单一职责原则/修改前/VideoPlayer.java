package design.单一职责原则.修改前;

/**
 * 单一职责是说，你应该保证引起该类变化的原因只有一个，
 * 你可以通过一个类只服务于一种功能做到，
 * 在java中一般通过拆分功能或者使用抽象类、接口的方式来达成这个目的。
 * 使用单一职责原则有利于维护和阅读，而此类中把所有播放方式和用户的类型判断耦合在一起，违反了单一职责原则！
 * 如果按照此类方式，当用户种类和播放方式增多时，此类会愈发臃肿难以维护！
 */
public class VideoPlayer {
    public static void main(String[] args) {
        play("游客");
    }

    static void play(String user) {
        if (user.equals("VIP")) {
            System.out.println("高清");
        } else if (user == "普通") {
            System.out.println("低清");
        } else if (user == "游客") {
            System.out.println("看不清");
        }
    }
}
