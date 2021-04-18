/**
 * 使用链表实现顺序表：手写LinkedList
 *  1 创建结点Node：
 *      a. 元素E
 *      b. next下一个结点
 *  2 创建LinkedList链表（链表上的一个个元素称为结点,结点是组成链表的基本单位）
 *      a. 头结点head
 *      b. size链表上元素的个数
 */
public class LinkedList<E> {

    //使用内部类创建结点类
    private class Node{
        //1 元素E
        public E e;
        //2 下一结点
        public Node next;

        public Node() {
        }

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }


    //头结点
    private Node head;
    //size:链表上放了多少个元素
    private int size;

    //getSize
    public int getSize(){
        return  size;
    }
    //isEmpty
    public boolean isEmpty(){
        return  size==0;
    }




}
