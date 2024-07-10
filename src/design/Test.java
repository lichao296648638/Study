package design;

public class Test implements Cloneable{
    String name;
    Address address;
    public String getName() {
        return name;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
//        long cur = System.currentTimeMillis();
//        for (int i = 0; i < 10000000; i++) {
//            int j = 2 << 5 - 31;
//            System.out.println(j);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - cur);



        long cur = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            int j = 2 * 32 - 31;
            System.out.println(j);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - cur);


    }
}
