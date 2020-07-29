
// Has to have knowledge about structure linkages
// in order to achieve traversal.

import java.util.Stack;

public abstract class NodeTraverser {
    private Node startNode;
    public NodeTraverser(Node n) { startNode = n; }
    public abstract Node next();
}

class InOrderTraverser extends NodeTraverser {
    private Stack<Node> stack;
    public InOrderTraverser(Node n) { 
	super(n); 
	stack = new Stack<Node>();
	stackInOrder(n);
    }
    private void stackInOrder(Node n) {
	if (n.right != null) stackInOrder(n.right);
	stack.push(n);
	if (n.left != null) stackInOrder(n.left);
    }
    public Node next() {
	if (stack.empty()) return null;
	return stack.pop();
    }
}
