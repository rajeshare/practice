package top20;

import java.net.StandardSocketOptions;
import java.util.Random;

public class ReverseList {
    //TC O(n)  SC O(1)
      public static void reverse(Node head) {   // 1 ->2 ->3->4
          Node cur=head.next,prev=null;
          while (cur!=null){
              Node tmp=cur.next;
              cur.next=prev;
              prev=cur;
              cur=tmp;
          }
          head.next=prev;
    }


    public static Node kthNodeEndOfLLLOOP(int n){

          return null;
    }

    public  static  void  main(String[] arg){
          int number=5;
          Node node=createNode(number);
          display(node);
          reverse(node);
          display(node);


    }
    public static  Node createNode(int n){
        Node head=new Node();
        Random r=new Random();
        for (int i=0;i<n;i++){
            Node tmp=new Node(r.nextInt(n)+1);
            tmp.next=head.next;
            head.next=tmp;
        }
        return  head;
    }
    public  static  void  display(Node node){
          for(Node cur=node.next;cur!=null;cur=cur.next){
              System.out.print(cur.data+"->");
          }
        System.out.println();
    }

}


class Node {
    Integer data;
    Node next;
    Node() {
    }
    Node(Integer data) {
        this.data = data;
    }
}