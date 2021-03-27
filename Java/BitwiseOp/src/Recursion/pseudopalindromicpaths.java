///*
//Two types of palindrome even- abba and odd - aba
// */
//public class pseudopalindromicpaths {
//    private boolean validate(int[] current){
//        for(int i =1, odd = 0; i<=9; ++i){
//            if(current[i] % 2 == 1){
//                if( odd++ > 0){
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }
//
//    private int search(TreeNode root, int[] current){
//        if (root == null)
//            return 0;
//    }
//    ++current[root.val];
//    int count;
//    if(root.left == null && root.right == null && validate(current)){
//        count = 1;
//    }
//    else
//    {
//        count = search(root.left, current) + search(root.right, current);
//    }
//    -- current[root.val];
//    return count;
//
//public int pseudoPalindromicPaths(TreeNode root){
//    return search(room, new int[10]);
//}
//
//public class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//  }
