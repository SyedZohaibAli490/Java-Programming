package assisgnemt2;

class ShapeLinkedList {
    private Node head;

    public ShapeLinkedList() {
        this.head = null;
    }

    public void addShape(Shape shape) {
        Node newNode = new Node(shape);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ShapeLinkedList:\n");
        Node current = head;
        while (current != null) {
            result.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return result.toString();
    }
}
