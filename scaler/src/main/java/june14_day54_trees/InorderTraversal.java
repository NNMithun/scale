package june14_day54_trees;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversal {

  public static void main(String[] args) {
    TreeNode treeNode= new TreeNode(1);



  }
  public ArrayList<Integer> inorderTraversal(TreeNode A) {
    Stack<TreeNode> s= new Stack<>();
    ArrayList<Integer> arrayList= new ArrayList<>();
    while(!s.empty()||A!=null){
      if(A.left!=null){
        s.push(A);
        A=A.left;
      }
      else {
        TreeNode tmp=s.pop();
        arrayList.add(tmp.val);
          A=tmp.right;


      }
    }
    return arrayList;


  }

  static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;

     TreeNode(int x) {
      val = x;
      left=null;
      right=null;
     }


 }

}
