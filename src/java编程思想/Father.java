package java编程思想;

public class Father<T> {
    T type;
    void f() throws ClassNotFoundException {
    }

    public  T make(T t) {
         type = t;
         return type;
    }

    public static void main(String[] args) {

        System.out.println(new Father<String>().<String>make("sss").getClass());
    }
}
