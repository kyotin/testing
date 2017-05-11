import service.LinkedListService;
import service.impl.LinkedListServiceImpl;

public class Main {

    public static void main(String[] args) {
        LinkedListService linkedListService = new LinkedListServiceImpl();
        linkedListService.newLinkedList(5);
        linkedListService.appendToLinkedList(4);
        linkedListService.appendToLinkedList(6);
        linkedListService.printLinkedList();
        // Result: 6->4->5

        linkedListService.appendToLinkedList(7);
        linkedListService.appendToLinkedList(8);
        linkedListService.appendToLinkedList(4);
        linkedListService.appendToLinkedList(5);
        linkedListService.printLinkedList();
        // Result: 5->4->8->7->6->4->5

        linkedListService.appendToLinkedList(8);
        linkedListService.printLinkedList();
        // Result: 8->5->4->8->7->6->4->5

        linkedListService.deleteNodeHavingNumberGreater(7);
        linkedListService.printLinkedList();
        // Result: 5->4->7->6->4->5

        LinkedListService linkedListService1 = new LinkedListServiceImpl();
        linkedListService1.newLinkedList(10);
        linkedListService1.appendToLinkedList(5);
        linkedListService1.deleteNodeHavingNumberGreater(7);
        linkedListService1.printLinkedList();
        // Result: 5
    }
}
