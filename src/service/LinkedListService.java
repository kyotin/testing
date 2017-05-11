package service;

import model.LinkedList;

/**
 * Created by TinNguyen on 5/11/2017.
 */
public interface LinkedListService {

    public LinkedList getHead();
    public LinkedList getTail();

    public void newLinkedList(int number);

    public void appendToLinkedList(int number);

    public void deleteNodeHavingNumberGreater(int number);

    public void printLinkedList();

}
