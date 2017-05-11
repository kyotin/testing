package service.impl;

import model.LinkedList;
import service.LinkedListService;

/**
 * Created by TinNguyen on 5/11/2017.
 */
public class LinkedListServiceImpl implements LinkedListService {

    private LinkedList head = null;
    private LinkedList tail = null;

    @Override
    public LinkedList getHead() {
        return head;
    }

    @Override
    public LinkedList getTail() {
        return tail;
    }

    @Override
    public void newLinkedList(int number) {
        LinkedList node = new LinkedList(number);
        head = node;
        tail = node;
    }

    @Override
    public void appendToLinkedList(int number) {
        LinkedList node = new LinkedList(number);
        node.setPointer(tail);
        tail = node;
    }

    @Override
    public void deleteNodeHavingNumberGreater(int number) {
        LinkedList preNode = tail;
        LinkedList currNode = tail;

        while(currNode.getPointer() != null) {
            if(currNode.getNumber() > number && currNode == tail) {
                currNode = currNode.getPointer();
                tail = currNode;
                preNode = currNode;
                continue;
            }

            if(currNode.getNumber() > number) {
                currNode = currNode.getPointer();
                preNode.setPointer(currNode);
            }

            // default case
            preNode = currNode;
            currNode = currNode.getPointer();

            if(currNode.getNumber() > number && currNode.getPointer() == null) {
                preNode.setPointer(null);
                head = preNode;
            }
        }
    }

    @Override
    public void printLinkedList() {
        String retStr = "";
        LinkedList tmp = tail;

        if(tmp.getPointer() == null) {
            System.out.println(tmp.getNumber());
        } else {
            while(tmp.getPointer() != null) {
                if (!retStr.isEmpty()) {
                    retStr += "->";
                }
                retStr += tmp.getNumber();
                // process next
                tmp = tmp.getPointer();
                if (tmp.getPointer() == null) {
                    retStr += "->" + tmp.getNumber();
                }
            }

            System.out.println(retStr);
        }
    }

}
