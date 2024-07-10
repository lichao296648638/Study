package design.单一职责原则.修改后;

public class main {
    public static void main(String[] args) {
        play(new NormalUser());
        play(new VIPUser());
        play(new VisitUser());
    }

    static void play(Player player) {
        player.play();
    }
}
