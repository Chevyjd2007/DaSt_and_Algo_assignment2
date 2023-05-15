package com.Chevy;


/**
 * Implements the node of a singly linked list of strings.
 *
 * @author Josias
 */
public class Node
{

    private String info;
    private Node next;

    /**
     * Parameterized constructor.
     */
    public Node(String info, Node next) //Prog13_01
    {
        this.info = info;
        this.next = null;
    }

    /**
     * Accessor method for info field.
     */
    public String getInfo() //getter
    {
        return info;
    }

    /**
     * Accessor method for next field.
     */
    public Node getNext() //getter
    {
        return next;
    }

    /**
     * Mutator method for info field.
     */
    public void setInfo(String info) //setter
    {
        this.info = info;
    }

    /**
     * Mutator method for next field.
     */
    public void setNext(Node next) //setter
    {
        this.next = next;
    }
}
