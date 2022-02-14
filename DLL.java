package javalab;

import java.util.Scanner;

public class DoubleLinkedList {
class Node{
int data;
Node previous;
Node nxt;

Node(int data) {
this.data=data;
}
}
Node head,tail=null;
public void addNode(int data) {
Node newNode=new Node(data);
if(head==null) {
head=tail=newNode;
head.previous=null;
tail.nxt=null;
}
else {
tail.nxt=newNode;
newNode.previous=tail;
tail=newNode;
tail.nxt=null;


}
}
public void display() {
Node current=head;
if(head==null) {
System.out.println("List is empty");
}
System.out.println("Nodes of double linked list: ");
while(current!=null) {
System.out.println(current.data+" ");
current=current.nxt;

}
}

public static void main(String[] args) {
// TODO Auto-generated method stub
DoubleLinkedList dl=new DoubleLinkedList();

Scanner sc=new Scanner(System.in);
int n;
do {
System.out.println("Enter the choice: ");
n=sc.nextInt();
switch(n) {
case 1:{
System.out.println("Enter the element to be inserted: ");
int m=sc.nextInt();
dl.addNode(m);
break;
}
case 2:dl.display();
break;
case 3:
default:
break;

}

}
while(n!=3);
sc.close();

}

}



