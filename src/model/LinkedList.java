package model;

/**
 * Created by TinNguyen on 5/11/2017.
 */
public class LinkedList {
    private int number;
    private LinkedList pointer;

    public LinkedList(int number) {
        this.number = number;
        this.pointer = null;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LinkedList getPointer() {
        return pointer;
    }

    public void setPointer(LinkedList pointer) {
        this.pointer = pointer;
    }

}
