public interface Tree<E> {
    public boolean insert(E e);
    public int getSize();
    public void inorder();
    public void preorder();
    public void postorder();
}
