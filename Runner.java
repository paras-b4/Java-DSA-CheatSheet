public class Runner {
    public static void main(String[] args) {
        LinkedList d=new LinkedList();
        d.Create(10);
        d.Create(20);
        d.Create(70);
        d.Create(30);
        d.Create(40);
        d.Create(50);
        d.Create(60);
        // d.insertAtBegining(100);
         d.insertAtEnd(90);
         d.insertAtIndex(120, 2);
        //  d.DeleteFromBeg();
        //  d.DeleteFromEnd();
        //  d.DeleteAtIndex(1);
         //d.getLength();
        d.Display();
    }
}
