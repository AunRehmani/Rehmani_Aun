//public class se231077_L9_BST {
//
//
//    static class Node {
//        int data;
//        Node right;
//        Node left;
//
//        public Node(int data) {
//            this.data = data;
//        }
//
//        static Node insert(Node root, int val) {
//            if (root == null) {
//                root = new Node(val);
//                return root;
//            }
//            if (root.data > val) {
//                root.left = insert(root.left, val);
//            } else {
//                root.right = insert(root.right, val);
//            }
//            return root;
//        }
//        public static boolean search(Node root,int key){
//            if(root==null){
//                return false;
//            }
//            if(root.data>key){
//                return search(root.left,key);
//            }
//            else if(root.data==key){
//                return true;
//            }
//            else {
//                return search(root.right,key);
//            }
//        }
//
//        static Node delete(Node root,int val){
//            if (root.data>val){
//                root.left=delete(root.left,val);        // no child=delete node null
//                                                        //one child=delete node repalce child
//                                                        // two child=move to right at left most and replace the root
//            }
//            else if(root.data<val){
//                root.right=delete(root.right,val);
//            }
//            else {
//                if (root.left==null && root.right==null){
//                    return null;
//                }
//                if(root.left==null){
//                    return root.right;
//                }
//                else if(root.right==null){
//                    return root.left;
//                }
//
//
//        }
//
//
//        public static void main(String[] args) {
//            int values[] = {5, 1, 3, 4, 2, 7};
//            Node root = null;
//
//            for (int i = 0; i < values.length; i++) {
//                root = insert(root, values[i]);
//
//            }
//
//             boolean result=search(root,1);
//            if(result==true){
//                System.out.println("item is founded");
//            }
//            else {
//                System.out.println("not found");
//            }
//        }
//    }
//}
