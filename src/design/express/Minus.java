package design.express;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/2/1 5:06
 */
public class Minus extends AbstractExpression{
    AbstractExpression left;
    AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    int execute(Context context) {
        return left.execute(context) - right.execute(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "-"+ right.toString()+ ")";
    }
}
