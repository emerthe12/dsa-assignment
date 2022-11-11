/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList    li  =  new MyLinkedList();
        MyLinkedList l2  =  new MyLinkedList();
        MyLinkedList l3  =  new MyLinkedList();
        MyLinkedList l4  =  new MyLinkedList();
        
        li.insertAtFront(152);
        li.insertAtBack(283);
        li.insertAtFront(998);
        l2.insertAtFront(11);
        l2.insertAtBack(22);
        l2.insertAtBack(99);
        
        System.out.println(l2.toString());
        System.out.println(li.isSorted(l2));
        l2.insertAtFront(8);
        System.out.println(li.isSorted(l2));
        
        
        l3.insertAtBack(5);
        l3.insertAtBack(10);
        l3.insertAtBack(30);
        l4.insertAtBack(20);
        l4.insertAtBack(60);
        l4.insertAtBack(70);

        System.out.println(l2.toString());
        System.out.println(l3.merge(l4));      
    }
}