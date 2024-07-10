package 算法.二叉树;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/7/3 0:34
 */
public class ExpressionTree {

    class TreeNode {
        String val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(String val) {
            this.val = val;
        }

        TreeNode(int String, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode expressionTree(String[] tokens) {
        LinkedList<TreeNode> stack = new LinkedList<>();

        for (String t : tokens) {
            switch (t) {
                case "+", "-", "*", "/" -> {
                    TreeNode parent = new TreeNode(t);
                    parent.right = stack.pop();
                    parent.left = stack.pop();
                    stack.push(parent);
                }
                default -> {
                    stack.push(new TreeNode(t));
                }
            }

        }
        return stack.peek();
    }

    public void post(TreeNode root, ArrayList<String> result) {
        if (root == null) {
            return;
        }
        post(root.left, result);
        post(root.right, result);
        result.add(root.val);
    }
    @Test
    public void test() {
        TreeNode root = expressionTree(new String[]{"2", "1", "-", "3", "*"});
        ArrayList<String> strings = new ArrayList<>();
        post(root, strings);
        System.out.println(strings.toString());
    }
}
