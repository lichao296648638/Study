package design.开闭原则.修改前;

/**
 * 开闭原则指的是我们应该对类的修改关闭，对开放扩展。意思是说，当有新的业务需求进入时
 * 我们应该做到不修改已有类的代码，而去开发新的类满足业务需求。
 * 这里的问题在于，如果突然想画三角形，或者有新的图形增加，
 * 那么就需要将本类代码改变，这无形中增加了已有类库的不稳定性和工作量。
 * 我们应当：
 * 1.通过接口/抽象类和多态结合的方式去实现类的核心功能
 * 2.使用继承来复用代码（但注意组合和继承特性，不可单纯盲目继承）
 * 3.
 */
public class ShapeDrawer {
    public static void main(String[] args) {
        drawShape(new Circle());
    }

    static void drawShape(Object shape) {
        if (shape instanceof Circle) {
            new Circle().draw();
        } else if (shape instanceof Triangle) {
            new Triangle().draw();
        }
    }
}
