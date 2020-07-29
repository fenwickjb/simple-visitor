public class Client {
    public static void main(String[] args) {
	Node root = makeTree();
	System.out.println(root);

	NodeTraverser traverser = new InOrderTraverser(root);
	NodeVisitor counter = new CountInts();
	Node n = null;
	while ((n = traverser.next()) != null) {
	    n.accept(counter);
	}
	System.out.println(counter);

	traverser = new InOrderTraverser(root);
	counter = new CountDoubles();
	n = null;
	while ((n = traverser.next()) != null) {
	    n.accept(counter);
	}
	System.out.println(counter);
    }

    public static Node makeTree() {
	Node left = new IntNode(44);
	Node right = new DoubleNode(6.6);
	Node root = new IntNode(5, left, right);

	return root;
    }
}
