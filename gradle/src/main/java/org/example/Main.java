package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    Map<Node,Node> v=new HashMap<>();
    public Node copyRandomList(Node head) {

        if(head==null)
            return null;
        if(!v.containsKey(head)){

            Node now=new Node(head.val);
            v.put(head,now);
            now.next=copyRandomList(head.next);
            now.random=copyRandomList(head.random);


        }

        return v.get(head);



    }


}


// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
