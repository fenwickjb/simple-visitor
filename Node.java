abstract class Node {
    protected Object data;
    protected Node left;
    protected Node right;
    public Node(Object d, Node l, Node r) {
	data = d;
	left = l;
	right = r;
    }
    public abstract String toString();
    public abstract void accept(NodeVisitor v);
}

class IntNode extends Node {
    public IntNode(int value, Node l, Node r) {
	super(value, l, r);
    }
    public IntNode(int value) {
	this(value, null, null);
    }
    public int getData() { return ((Integer)data).intValue(); }
    public String toString() {
	String result = "(";
	result += ((Integer)data).toString();
	result += ",";
	if (left == null) result += "null";
	else result += left.toString();
	result += ",";
	if (right == null) result += "null";
	else result += right.toString();
	result += ")";
	return result;
    }
    public void accept(NodeVisitor v) {
	v.visit(this);
    }
}

class DoubleNode extends Node {
    public DoubleNode(double value, Node l, Node r) {
	super(value, l, r);
    }
    public DoubleNode(double value) {
	this(value, null, null);
    }
    public double getData() { return ((Double)data).doubleValue(); }
    public String toString() {
	String result = "(";
	result += ((Double)data).toString();
	result += ",";
	if (left == null) result += "null";
	else result += left.toString();
	result += ",";
	if (right == null) result += "null";
	else result += right.toString();
	result += ")";
	return result;
    }
    public void accept(NodeVisitor v) {
	v.visit(this);
    }
}

