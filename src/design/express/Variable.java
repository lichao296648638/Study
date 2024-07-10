package design.express;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/2/1 4:57
 */
public class Variable extends AbstractExpression{
    String name;
    Context context;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    int execute(Context context) {
        return context.get(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
