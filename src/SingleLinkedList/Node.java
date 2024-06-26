package SingleLinkedList;

public class Node {
    private int content;
    private Node next;

    public Node(int content) {
        this.content = content;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean hasNext() {
        return (next != null);
    }

    @Override
    public String toString() {
        return content + "->" + next;
    }
}
