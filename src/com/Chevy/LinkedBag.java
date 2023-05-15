package com.Chevy;


/**
 * The class LinkedBag implements a multiset of strings with a linked list.
 * The linked list uses a header (dummy) node and a pointer to the last node.
 *
 * @author Josias
 */
public class LinkedBag
{

    private Node first; //points to the first node of the linked list (dummy node)
    private Node last;  //points to the last node of the linked list
    private int length; //number of elements (it's equal to the number of nodes - 1)

    /**
     * Default constructor. Sets this object as an empty bag. The method takes
     * O(1) time.
     *
     */
    public LinkedBag()
    {
        first = new Node("DUMMY", null);
        last = first;
        length = 0;
    }

    /**
     * Adds new element to the back end of the bag. The method takes O(1) time.
     *
     * @param s new element to be added to the LinkedBag.
     */
    public void add(String s) //Prog13_01 add method
    {
        length++;
        Node n = new Node(s, first.getNext());

        n.setInfo(s);
        n.setNext(first.getNext());
        last.setNext(n);
        last = n;

    }

    /**
     * Determines the number of occurrences in the bag of a given element. The
     * method takes O(n) time.
     *
     * @param s given element
     * @return number of times the given element occurs in the LinkedBag.
     */
    public int count(String s) //to be implemented
    {
        int count = 0; //setting up the counter at initially 0
        Node current = first.getNext(); //the temp node we will use

        for (int i=0; i < length; i++) {

            if (current.getInfo().equals(s)) { //if the current info during the loop equals to s the counter will go up
                count++;

            }
            current = current.getNext();
        }
        return count;
    }

    /**
     * Returns number of elements in the bag. The method takes O(1) time.
     *
     * @return number of elements
     */
    public int getNumberOfItems() //numbers of items is the length of the bag
    {
        return length;
    }
    /**
     * Determines if this bag is empty. The method takes O(1) time.
     *
     * @return true if LinkedBag contains no elements, false otherwise.
     */
    public boolean isEmpty() //If the length is 0 then the bag is empty
    {
        return (length == 0);
    }

    /**
     * Removes one occurrence of a given element. The method should remove from
     * the linked list the first occurrence of the element, if it were present
     * in the linked list more than once. It takes O(n) time.
     *
     * @param s element to be removed.
     */
    public void remove(String s) //Source: Prog13_01 remove method
    {
        Node old = first.getNext(), p = first;

        boolean found = false;
        for (int i=0; i < length; i++) {
            if (old.getInfo().equals(s)) {
                found = true;
            }
            else {
                p = old;
                old = p.getNext();
            }
        }

        if (found) {
            p.setNext(old.getNext());
            length --;
            old = old.getNext();
        }
    }

    /**
     * Builds a String description of this bag.
     *
     * @return String containing the bag elements.
     */
    public String toString()
    {
        String str = "";

        Node current = first.getNext();
        for (int i = 0; i < length - 1; i++)
        {
            str += current.getInfo() + ", ";
            current = current.getNext();
        }

        if (length != 0)
            return "Bag: {" + str + last.getInfo() + "}";
        else
            return "Bag: {}";
    }
}
