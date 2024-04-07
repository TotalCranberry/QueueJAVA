public class Stack{
  Node top;

  public Stack(){
    this.top = null;
  }
  
  public boolean isEmpty(){
    if(this.top==null){
      return true;
    }
    return false;
  }

  public void push(int data){
    Node newNode = new Node(data);
    if(!isEmpty()){
      newNode.next = this.top; 
    }
    this.top = newNode;
  }

  public int pop(){
    if(!isEmpty()){
      Node temp = this.top;
      this.top = this.top.next;
      int data = temp.data;
      temp = null;
      return data;
    }
    return 0;
  }

  public void display(){
    Node current = this.top;
    while(current!=null){
      System.out.print(current.data+" ");
      current = current.next;
    }
  }
}
