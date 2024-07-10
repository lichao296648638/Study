package design.memento;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/27 3:47
 */
public class main {
    public static void main(String[] args) {
        System.out.println("打架前");
        GameRole gameRole = new GameRole();
        gameRole.init();
        gameRole.display();
        SaverManager saverManager = new SaverManager();
        saverManager.setSaver(gameRole.save());
        gameRole.fight();
        System.out.println("打架后");
        gameRole.display();
        System.out.println("恢复后");
        gameRole.reload(saverManager.getSaver());
        gameRole.display();
    }
}
