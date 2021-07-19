package cn.xaut;

import java.util.ArrayList;

/**
 * 输入一个链表的头节点，按链表从尾到头的顺序返回每个节点的值（用数组返回）。
 */
public class JZ3 {
    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(2);
        ListNode listNode3=new ListNode(3);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        ArrayList<Integer> arrayList=printListFromTailToHead(listNode1);
        System.out.println(arrayList);
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        while(listNode!=null){
            arrayList.add(0,listNode.val);
            listNode=listNode.next;
        }

        return arrayList;
    }
}
class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
}
