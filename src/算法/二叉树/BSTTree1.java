package 算法.二叉树;

/**
 * Description:
 *二叉搜索树
 * @author Ashes
 * @date 2024/7/5 0:53
 */
public class BSTTree1 {

    static class BSTNode{
        int key;
        Object value;
        BSTNode left;
        BSTNode right;

        public BSTNode(int key) {
            this.key = key;
        }

        public BSTNode(int key, Object value, BSTNode left, BSTNode right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public BSTNode(int key, Object value) {
            this.key = key;
            this.value = value;
        }
    }
}
