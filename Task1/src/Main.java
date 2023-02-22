public class Main {

    public static void main(String[] args) {

        constructLinkedList myList = new constructLinkedList();
        myList.insert(myList, 1);
        myList.insert(myList, 2);
        myList.insert(myList, 3);
        myList.insert(myList, 8);
        myList.insert(myList, 5);

        constructLinkedList.printList(myList);

    }

}