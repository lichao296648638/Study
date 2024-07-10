package 算法.二叉树;

import org.junit.jupiter.api.Test;
import 算法.杨辉三角形.T;

import java.util.LinkedList;

/**
 * Description:
 *
 * @author Ashes
 * @date 2024/6/21 21:56
 */
public class TreeTraversal {

    TreeNode root = new TreeNode(
            new TreeNode(
                    new TreeNode(4),
                    2,
                    null),
            1,
            new TreeNode(
                    new TreeNode(5),
                    3,
                    new TreeNode(6))
    );


    void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.toString() + ",");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.toString() + ",");
        inOrder(node.right);
    }

    void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.toString() + ",");

    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(TreeNode left, int val, TreeNode right) {
            this.left = left;
            this.val = val;
            this.right = right;
        }

        TreeNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }


    public static void main(String[] args) {
        TreeTraversal treeTraversal = new TreeTraversal();
        treeTraversal.preOrder(treeTraversal.root);
        System.out.println();
        treeTraversal.inOrder(treeTraversal.root);
        System.out.println();
        treeTraversal.postOrder(treeTraversal.root);
        System.out.println();
        System.out.println("---------------路径--------------");

        //后续遍历
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode cur = treeTraversal.root;
        TreeNode pop = null;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                System.out.println("前" + cur.val);
                stack.push(cur);
                cur = cur.left;
            } else {
                TreeNode peek = stack.peek();
                //没有右子树
                if (peek.right == null){
                    System.out.println("中" + peek.val);
                    pop = stack.pop();
                    System.out.println("后" + pop.val);
                }
                //右子树处理完成
                else if (peek.right == pop) {
                    pop = stack.pop();
                    System.out.println("后" + pop.val);
                }
                //处理右子树
                else {
                    System.out.println("中" + peek.val);
                    cur = peek.right;
                }
            }
        }
    }
}
