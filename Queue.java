public class Queue{
  Stack stack1;
  Stack stack2;

  public Queue(){
    this.stack1 = null;
    this.stack2 = null;
  }

  public void enqueue(int data){
    if(stack1==null){
      stack1 = new Stack(); 
    }
    stack1.push(data);
  }

  public int dequeue(){
    if(stack2==null){
      stack2 = new Stack();
    }
    if(stack1.isEmpty){
      System.out.println("Queue is Empty");
    }
    Node current = stack1.top;
    while(current!=null){
      stack2.push(stack1.pop());
      current = current.next;
    }
    int data = stack2.pop();
    current = stack2.top;
    while(current!=null){
      stack1.push(stack2.pop());
      current = current.next;
    }
    return data;
  }

  public void display(){
    Node current = stack1.top;
    if(current!=null){
      while(current!=null){
        System.out.println(current.data+" ");
        current = current.next;
      }
    }
    System.out.println("Empty Queue");
  }
}
