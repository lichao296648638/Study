package design.memento;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/1/27 3:39
 */
public class GameRole {
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    private int life;
    private int atk;
    private int def;

    public void init() {
        life = 100;
        atk = 100;
        def = 100;
    }

    public void fight() {
        life = 1;
        atk = 1;
        def = 1;
    }

    public Saver save() {
        return new SaverImpl(this);
    }

    public void display() {
        System.out.println("攻击" + atk);
        System.out.println("防御" + def);
        System.out.println("血量" + life);
    }

    public void reload(Saver saver) {
        SaverImpl saver1 = (SaverImpl) saver;
        life = saver1.getLife();
        atk = saver1.getAtk();
        def = saver1.getDef();
    }

    private class SaverImpl implements Saver{
        private int life;
        private int atk;
        private int def;

        public int getLife() {
            return life;
        }

        public void setLife(int life) {
            this.life = life;
        }

        public int getAtk() {
            return atk;
        }

        public void setAtk(int atk) {
            this.atk = atk;
        }

        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }

        public SaverImpl(GameRole gameRole) {
            life = gameRole.getLife();
            atk = gameRole.getAtk();
            def = gameRole.getDef();
        }
    }
}
