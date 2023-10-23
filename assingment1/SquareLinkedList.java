package assingment1;
class SquareLinkedList {
    private Node head;

    public SquareLinkedList() {
        this.head = null;
    }

    public void addSquare(Square square) {
        Node newNode = new Node(square);
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
        StringBuilder result = new StringBuilder("SquareLinkedList:\n");
        Node current = head;
        while (current != null) {
            result.append(current.data.toString()).append("\n");
            current = current.next;
        }
        return result.toString();
    }
}

