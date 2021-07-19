package cn.xaut;

/**
 * 给定某二叉树的前序遍历和中序遍历，请重建出该二叉树并返回它的头结点。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
 */
public class JZ4 {
    public static void main(String[] args) {
        int[] pre={1,2,4,7,3,5,6,8};
        int[] in={4,7,2,1,5,3,8,6};
        System.out.println(reConstructBinaryTree(pre,in));
    }
    public  static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = new TreeNode(pre[0]);
        build(root, pre, 0, pre.length, in, 0, in.length);
        return root;
    }

    /**
     * 递归解决，不断将问题分为两部分。
     * @param root //根节点
     * @param pre//前序序列
     * @param pleft//前序开始下标
     * @param pright//前序结束下标
     * @param in//中序序列
     * @param ileft//中序开始下标
     * @param iright//中序结束下标
     */
    public  static void build(TreeNode root, int[] pre, int pleft, int pright,  int[] in, int ileft, int iright) {
        //从中序序列寻找根节点的位置
        int i;//i保存根节点位置
        for (i = ileft; i < iright; i++) {
            if (in[i] == root.val) {
                break;
            }
        }
        int t = i - ileft;
        if (t > 0) {
            root.left = new TreeNode(pre[pleft + 1]);
            build(root.left, pre, pleft + 1, pleft + 1 + t, in, ileft, i);
        }

        if (pright - pleft - 1 - t > 0) {
            root.right = new TreeNode(pre[pleft + 1 + t]);
            build(root.right, pre, pleft + 1 + t, pright, in, i + 1, iright);
        }
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    @Override
    public String toString() {
        return "根"+val+String.format(",左%s", left)+String.format(",右%s", right);
    }
}
