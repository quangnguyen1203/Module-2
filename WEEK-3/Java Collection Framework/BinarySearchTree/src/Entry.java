public class Entry {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("Quang");
        tree.insert("Long");
        tree.insert("Han");
        tree.insert("Chuong");
        tree.insert("Huy");
        tree.insert("Khanh");
        //duyệt qua tree
        System.out.println("Preorder sorted: ");
        tree.preorder();
        System.out.println("Inorder sorted: ");
        tree.inorder();
        System.out.println("Postorder sorted: ");
        tree.postorder();
        System.out.println("The number of nodes is "+tree.getSize());
    }
}