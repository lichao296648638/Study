package design.express;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/2/1 5:07
 */
public class main {
    public static void main(String[] args) {
        Context context = new Context();
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        context.add(a, 1);
        context.add(b, 2);
        context.add(c, 3);
        context.add(d, 4);
        AbstractExpression abstractExpression = new Plus(new Minus(c, d), new Plus(a, b));
        System.out.println(abstractExpression.toString() + abstractExpression.execute(context));
    }
}
