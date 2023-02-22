public class constructLinkedList {
    Node head;
        public class Node {
            int element;
            Node next;

            public Node(int element) {
                this.element = element;
                this.next = null;
            }
        }
        public constructLinkedList insert(constructLinkedList list, int element) {

            Node newNode = new Node(element);
            newNode.next = null;

            if (list.head == null){
                list.head = newNode;
            }
            else{
                Node last = list.head;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = newNode;
            }
            return list;
        }

        public static void printList(constructLinkedList list)
        {
            Node currentNode = list.head;
            while (currentNode != null)
            {
                System.out.print(currentNode.element + " —> ");
                currentNode = currentNode.next;
            }
            System.out.println("null");
        }
    }


