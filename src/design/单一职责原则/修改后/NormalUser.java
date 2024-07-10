package design.单一职责原则.修改后;

public class NormalUser implements Player{

    @Override
    public void play() {
        System.out.println("低清");
    }
}
