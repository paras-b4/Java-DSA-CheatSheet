
/*
 

class Quick{

    public void quicksort(int arr[],int low ,int high)
    {
        if (low<high) 
        {
            int pi=partition(arr,low,high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high); 
        }
    }
    
    private int partition(int[] arr, int low, int high) 
    {
        int pivot=high;
        int i=low-1;
        int j=low;
        while (j!=high) 
        {
            if (arr[j]<arr[pivot]) 
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
            j++;
            
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        for(int i1:arr)
        {
            System.out.print(i1+" ");
        }
        System.out.println();
        return i+1;

    }

    public static void main(String[] args) 
    {
        int arr[]={12,13,11,9,5,7,32,43,23,33,0,1};
        int low=0;
        int high=arr.length-1;
        Quick q=new Quick();
        q.quicksort(arr,low,high);
    }
}
     

class Merg{

    public void merge(int arr[],int low,int high)
    {
        if (low<high) 
        {
            int mid=(low+high)/2;
            merge(arr, low, mid);
            merge(arr, mid+1, high);
            mergesort(arr,low,mid,high);
        }
    }
    public void mergesort(int arr[],int low,int mid,int high)
    {
        int n1=(mid-low)+1;
        int n2=high-mid;
        
        int larr[]=new int[n1];
        int rarr[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
            larr[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++)
        {
            rarr[j]=arr[mid+j+1];
        }
        int i = 0,j=0;
        int k=low;

        while (i<n1 && j<n2) 
        {
            if (larr[i]<rarr[j]) 
            {
                arr[k]=larr[i];
                i++;
            }
            else
            {
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }
        while (i<n1) 
        {
            arr[k]=larr[i];
            i++;
            k++;
            
        }
        while (j<n2) 
        {
            arr[k]=rarr[j];
            j++;
            k++;
            
        }
        for(int i1:arr)
        {
            System.out.print(i1+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
    int arr[]={12,13,11,9,5,7,32,43,23,33,0,1};
    int low=0;
    int high=arr.length-1;
    Merg m=new Merg();
    m.merge(arr,low,high);
    }
}


import javax.sound.sampled.Line;

class Insertion{
    public void Insertionsort(int arr[],int low,int high)
    {
       
        
        for(int j=1;j<=high;j++)
        {
            int key=arr[j];
            int i=j-1;

            while ( !(i<=-1)&&arr[i]>key) 
            {
                arr[i+1]=arr[i];
                i--;

            }
            arr[i+1]=key;
            for(int i1:arr)
            {
                System.out.print(i1+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int arr[]={12,13,11,9,5,7,32,43,23,33,0,1};
        int low=0;
        int high=arr.length-1;
        Insertion i=new Insertion();
        i.Insertionsort(arr,low,high);
    }
}

class Selection{

    public void SelectionSort(int arr[],int low,int high)
    {
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[min]>arr[j]) 
                {
                    min=j;
                }

            }
             int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            for(int i1:arr)
            {
                System.out.print(i1+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[]={12,13,11,9,5,7,32,43,23,33,0,1} ;
        int low=0 ;
        int high=arr.length-1 ;
        Selection s=new Selection() ;
        s.SelectionSort(arr,low,high);
    }
}

class Binary{
    public int BinarySearch(int arr[],int low,int high,int target)
    {
        while (low<=high) 
        {
            int mid=(low+high)/2;
            if (arr[mid]==target) 
            {
                return mid;
            }
            else if (target>arr[mid]) 
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={12,13,21,29,35,37,42,43,43,53,60,71} ;
        int low=0;
        int high=arr.length-1;
        int target=12;
        Binary b=new Binary();
        int r=b.BinarySearch(arr,low,high,target);
        System.out.println("Element found at index "+r);

    }
}

class Linear{
    public int LinearSearch(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]==target) 
            {
                return i;
                
            }

        }
        return -1;
    }
     public static void main(String[] args) 
     {
        int arr[]={12,13,11,9,5,7,32,43,23,33,0,1};
        int target=121;
        Linear l=new Linear();
        int r=l.LinearSearch(arr,target);
        System.out.println("Element found at index "+ r);
     }
}

class Bubble{

    public void BubbleSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if (arr[j]>arr[j+1]) 
                {
                    
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
            for(int i1:arr)
            {
                System.out.print(i1+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={12,13,11,9,5,7,32,43,23,33,0,1};
        Bubble b=new Bubble();
        b.BubbleSort(arr);
    }
}


// LRU (least recently used )

import java.util.LinkedHashMap;
import java.util.Map;

class A<K,V> extends LinkedHashMap<Integer,Integer>
{
    int capacity;
    public A(int capacity)
    {
        super(capacity,0.75f,true);
        this.capacity=capacity;

    }
    public boolean removeEldestEntry(Map.Entry<Integer,Integer> entry)
    {
        return size()>capacity;
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        A a=new A(3);
        a.put(1, 100);
        a.put(2, 200);
        a.put(3, 300);
        a.get(1);
        System.out.println(a);
        a.put(4, 400);
        a.put(5, 500);
        a.get(1);
        a.put(6, 600);
        System.out.println(a);

    }

}


//Arrays

// ! d array

import java.util.Scanner;

class A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int s=sc.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++)
        {
            System.out.println("Enter the "+i+" element ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are :");
        for(int j:arr)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
    
// 2d array

import java.util.Scanner;

class A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int r=sc.nextInt();
        System.out.println("Enter the no of columns");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {

            for(int j=0;j<c;j++)
            {
                System.out.println("Enter the "+i+","+j+" Element");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i1[]:arr)
        {
            for(int j1:i1)
            {
                System.out.print(j1+" ");
            }
            System.out.println();

        }
    }

}

// insertion in 1d array

import java.util.Scanner;

class A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int s=sc.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++)
        {
            System.out.println("Enter the "+i+" element ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are :");
        for(int j:arr)
        {
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Enter the element you want to insert ");
        int e=sc.nextInt();
        System.out.println("Enter the index at which you want to insert the element ");
        int i1=sc.nextInt();
        int arr1[]=new int[s+1];
        for(int i=0;i<s+1;i++)
        {
           if (i1>s) 
           {
            System.out.println("Enter a valid index");
            break;
           }
           else{
             if (i<i1) 
            {
                arr1[i]=arr[i];
            }
            else if(i==i1)
            {
                arr1[i]=e;
            }
            else{
                arr1[i]=arr[i-1];
            }
           }
        }
         for(int i2:arr1)
        {
            
            System.out.print(i2+" ");

        }
        System.out.println();
    }
}
// deletion in 1 d array 

import java.util.Scanner;

class A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int s=sc.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++)
        {
            System.out.println("Enter the "+i+" element ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are :");
        for(int j:arr)
        {
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.println();
        
        System.out.println("Enter the index at which you want to delete the element ");
        int i1=sc.nextInt();
        int arr1[]=new int[s-1];
        for(int i=0;i<s-1;i++)
        {
           if (i1>s) {
            System.out.println("Enter a valid index ");
            break;
           }
           else{
             if (i<i1) 
            {
                arr1[i]=arr[i];
            }
            else if(i==i1)
            {
                arr1[i]=arr[i+1];
            }
            else{
                arr1[i]=arr[i+1];
            }
           }
        
       
    }
      for(int i2:arr1)
        {
            
            System.out.print(i2+" ");

        }
        System.out.println();
    }
}

// Linked List 
class Node {

    int data;
    Node next=null;

    public Node(int data)
    {
        this.data=data;
    }

}
class A{
    Node head=null;

    public void create(int data)
    {
        Node newnode=new Node(data);
        if (head==null) 
        {
            head=newnode;
        }
        else{
            Node temp=head;
            while (temp.next!=null) 
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }

    }
    public void insertAtBeg(int data)
    {
        Node newnode=new Node(data);
        if (head==null) 
        {
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }

    }
    public void insertATEnd(int data)
    {
        Node newnode=new Node(data);
         if (head==null) 
        {
            head=newnode;
        }
        else{
             Node temp=head;
            while (temp.next!=null) 
            {
                temp=temp.next;
            }
            temp.next=newnode;

        }

    }
    public void insertAtIndex(int data ,int index )
    {
        Node newnode=new Node(data);
        if (head==null) 
        {
            head=newnode;
        }
        else if(index>size())
        {
            System.out.println("Enter a vaild index ");
        }
        else{
           if (index==0) 
           {
            insertAtBeg(data);
           }
           else if(index==size())
           {
            insertATEnd(data);
           }
           else{
            Node temp=head;
            int s=0;
            while (s<index-1) 
            {
                temp=temp.next;
                s++;
            }
            newnode.next=temp.next;
            temp.next=newnode;
           }
        }

    }
    public void deletefromBeg()
    {
        
        if (head==null) 
        {
            System.out.println("Empty Linked List");
        }
        else{
            head=head.next;
        }

    }
    public void deletefromEnd()
    {
         if (head==null) 
        {
            System.out.println("Empty Linked List");
        }
        else{
            Node temp=head;
            Node prev=null;
            while (temp.next!=null) 
            {
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
        }

    }
    public void deletionfromIndex(int index)
    {
        if (head==null) 
        {
            System.out.println("Empty Linked List");
        }
        else{
             if (head==null) 
        {
            System.out.println("Empty Linked List");
        }
        else if(index>size())
        {
            System.out.println("Enter a vaild index ");
        }
        else{
           if (index==0) 
           {
              deletefromBeg();
           }
           else if(index==size())
           {
            deletefromEnd();
           }
           
           else{
            Node temp=head;
            Node prev=null;
            int s=0;
            while (s<index) 
            {
                prev=temp;
                temp=temp.next;
                s++;
            }
            prev.next=temp.next;

           }
        }

        }

    }
    public int size()
    {
        if (head==null) 
        {
            System.out.println("Empty LinkedList");
        }
        else{
            Node temp=head;
            int i=0;
            while (temp.next!=null) 
            {
                temp=temp.next;
                i++;
            }
            return i;
        }
        return -1;
    }
    public void Display()
    {
        if (head==null) 
        {
            System.out.println("Enpty LinkedList");
            
        }
        else{
             Node temp=head;
            
            while (temp.next!=null) 
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.print(temp.data);
            
        }
    }
}
class runner{
    public static void main(String[] args) {
        A a=new A();
        a.create(10);
        a.create(20);
        a.create(30);
        a.create(40);
        a.create(50);
        a.insertAtBeg(100);
        a.insertAtBeg(0);
        a.insertATEnd(110);
         System.out.println("Size of LinkedList is "+a.size());
         a.Display();
        a.insertAtIndex(120, a.size());
        System.out.println();
        System.out.println("Size of LinkedList is "+a.size());
        a.Display();
        System.out.println();
        a.deletefromBeg();
        a.deletefromEnd();
        a.Display();
        System.out.println();
        a.deletionfromIndex(5);
        a.Display();

    }
}

// DLL 
class Node {
    int data;
    Node prve=null;
    Node next=null;
    public Node (int data)
    {
        this.data=data;
    }

}
class A{
    Node head=null;
    Node tail=null;
    public void create(int data)
    {
        Node newnode=new Node(data);
        if (head==null) 
        {
            head=newnode;
            tail=newnode;
            
        }
        else{
            tail.next=newnode;
            newnode.prve=tail;
            tail=newnode;

        }
    }
    public void insertAtBeg(int data)
    {
        Node newnode=new Node(data);
        if (head==null) 
        {
            System.out.println("Empty doubly Linked List");   
        }
        else{
            newnode.next=head;
            head.prve=newnode;
            head=newnode;
        }
    }
    public void insertATEnd(int data)
    {
        Node newnode=new Node(data);
         if (head==null) 
        {
            System.out.println("Empty doubly Linked List");   
        }
        else{
            tail.next=newnode;
            newnode.prve=tail;
            tail=newnode;
        }
    }
    public void insertAtIndex(int data,int index)
    {
        Node newnode =new Node(data);
        if (head==null) 
        {
            System.out.println("Empty doubly Linked List");
        }
        else{
            Node temp=head;
            int s=0;
            Node prev=null;
            while (s<index) 
            {
                prev=temp;
                temp=temp.next;
                s++;
            }
            newnode.next=prev.next;
            temp.prve=newnode;
            prev.next=newnode;
            newnode.prve=prev;
        }
    }
    public void deletefromBeg()
    {
        if (head==null) 
        {
            System.out.println("Empty doubly Linked List");
        }
        else{
            head=head.next;
            head.prve=null;
        }
    }
    public void deletefromEnd()
    {
        if (head==null) 
        {
            System.out.println("Empty doubly Linked List");
        }
        else{
            Node temp=head;
            Node prev=null;
            while (temp.next!=null) 
            {
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            tail=prev;
        }

    }
    public void deletionfromIndex(int index)
    {
        if (head==null) 
        {
            System.out.println("Empty doubly Linked List");
        }
         else if(index>size()){
            System.out.println("Enter a valid index ");
           }
        else
        {
            if (index==0) 
           {
              deletefromBeg();
           }
           else if(index==size())
           {
            deletefromEnd();
           }
          
           else{
             Node temp=head;
            int s=0;
            Node prev=null;
            while (s<index) 
            {
                prev=temp;
                temp=temp.next;
                s++;
            }
            prev.next=temp.next;
            temp.next.prve=temp.prve;
           }
           
        }

    }
    public int size()
    {
        if (head==null) 
        {
            System.out.println("Empty Doubly Linked List");
        }
        else
        {
            Node temp=head;
            int s=0;
            while (temp.next!=null) 
            {
                temp=temp.next;
                s++;
            }
            return s;

        }
        return -1;
    }
    public void Display()
    {
        if (head==null) 
        {
            System.out.println("Empty Doubly Linked List ");
            
        }
        else{
            Node temp=head;
            System.out.println("Forward traversal ");
            while (temp.next!=null) 
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.print(temp.data);
            System.out.println();
            System.out.println("Backword traversal ");
            Node temp1=tail;
            while (temp1.prve!=null) 
            {
                System.out.print(temp1.data+" ");
                temp1=temp1.prve;
            }
            System.out.print(temp1.data);

        }
    }
}
class runner{
    public static void main(String[] args) {
        A a=new A();
        a.create(10);
        a.create(20);
        a.create(30);
        a.create(40);
        a.create(50);
        a.insertAtBeg(100);
        a.insertATEnd(120);
    
        System.out.println("Size of DLL is "+a.size());
        a.Display();
        a.insertAtIndex(110, 4);
       
        System.out.println();
        System.out.println("Size of DLL is "+a.size());
        a.Display();
        a.deletefromBeg();
        a.deletefromEnd();
        System.out.println();
        System.out.println("Size of DLL is "+a.size());
        a.Display();
        a.deletionfromIndex(3);
        System.out.println();
        System.out.println("Size of DLL is "+a.size());
        a.Display();
           
    }
}

// CLL
class Node {
    int data;
    Node next=null;
    public Node(int data)
    {
        this.data=data;
    }

}
class A{
    Node head=null;
    Node tail=null;
    public void create(int data)
    {
        Node newnode=new Node(data);
        if (head==null) 
        {
            head=newnode; 
            tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.next=head;
            tail=newnode;
        }
    }
    public void insertAtBeg(int data)
    {
        Node newnode = new Node(data);
        if (head==null) 
        {
            // head=newnode;
            // tail=newnode;
            System.out.println("Empty Cll ");
        }
        else{
            newnode.next=head;
            head=newnode;
            tail.next=head;
        }

    }
    public void insertATEnd(int data)
    {
         Node newnode = new Node(data);
        if (head==null) 
        {
            // head=newnode;
            // tail=newnode;
             System.out.println("Empty Cll ");
        }
        else{
            tail.next=newnode;
            newnode.next=head;
            tail=newnode;
        }

    }
    public void insertAtIndex(int data ,int index)
    {
        Node newnode = new Node(data);
        if (head==null) 
        {
            System.out.println("Empty CLL");
        }
        else{
            Node temp=head;
            int s=0;
            while (s<index-1) 
            {
                temp=temp.next;
                s++;

            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
        
    }
    public void deletefromBeg()
    {
        if (head==null) 
        {
            System.out.println("Empty CLL");
        }
        else{
            head=head.next;
            tail.next=head;

        }
        
    }
    public void deletefromEnd()
    {
        if (head==null) 
        {
            System.out.println("Empty CLL");
        }
        else{
            Node temp=head;
            Node prev=null;
            while (temp.next!=head) 
            {
                prev=temp;
                temp=temp.next;
            }
            prev.next=head;
            tail=prev;
        }

    }
    public void deletionfromIndex(int index)
    {
        if (head==null) 
        {
            System.out.println("Empty CLL");
        }
        else if(index>size())
        {
            System.out.println("Enter a valid index ");
        }
        else{
             if (index==0) 
           {
              deletefromBeg();
           }
           else if(index==size())
           {
            deletefromEnd();
           }
           else{

          
            Node temp=head;
            Node prev=null;
            int s=0;
            while (s<index) 
            {
                prev=temp;
                temp=temp.next;
                s++;
            }
            prev.next=temp.next;
        }
        }

    }
    public int size()
    {
        if (head==null) 
        {
            System.out.println("Empty CLL");
        }
        else
        {
            Node temp=head;
            int s=0;
            while (temp.next!=head) 
            {
                temp=temp.next;
                s++;
            }
            return s;
        }
        return -1;

    }
    public void Display()
    {
        if (head==null) 
        {
            System.out.println("Empty CLL");
            
        }
        else{
            Node temp=head;
            while (temp.next!=head) 
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.print(temp.data);
        }
    }

}
class runner{
    public static void main(String[] args) {
        A a=new A();
        a.create(10);
        a.create(20);
        a.create(30);
        a.create(40);
        a.create(50);
        a.insertAtBeg(100);
        a.insertATEnd(120);
        System.out.println("Size of CLL is "+ a.size());
        a.Display();
        a.insertAtIndex(110, 4);
        System.out.println();
        System.out.println("Size of CLL is "+ a.size());
        a.Display();
        a.deletefromBeg();
        a.deletefromEnd();
         System.out.println();
        System.out.println("Size of CLL is "+ a.size());
        a.Display();
        a.deletionfromIndex(0);
         System.out.println();
        System.out.println("Size of CLL is "+ a.size());
        a.Display();
    }
}


// stack 

class A{
    int arr[]=new int[5];
    int size=0;
    int top=0;

    public void push(int data)
    {
        if (top>=arr.length) 
        {
            System.out.println("Satck is full cannot insert "+data);
            
        }
        else{
            arr[top]=data;
            top++;
            size++;
        }
      
    }
    public int pop()
    {
        if (top<0) 
        {
            System.out.println("Empty stack cannot pop element");
            
        }
        else{
        top--;
        int r=arr[top];
        arr[top]=0;
        size--;
        return r;

        }
        return -1;
    }
    public int size()
    {
        return size-1;
    }
    public int peek()
    {
        top--;
        return arr[top];

    }
    public boolean isEmpty()
    {
        return size<0;
    }
    public void Display()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
class runner{
    public static void main(String[] args) {
        A a=new A();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        a.push(50);
        System.out.println("Deleted element are "+a.pop());
        System.out.println("Deleted element are "+a.pop());
        System.out.println("Size of stack is "+a.size());
        System.out.println("Is stack is empty "+a.isEmpty());
        System.out.println("Peek Element is "+a.peek());
        a.Display();
    }
}

// Queue 
class B{
    int arr[]=new int[5];
    int front=0;
    int rear=0;
    int size=0;
    public void enqueue(int data)
    {
        if (rear>=arr.length) {
            System.out.println("Queue is full cannot insert "+data);
        }
        else{
            arr[rear]=data;
        rear=rear+1;
        size=size+1;
        }
    }
    public int dequeue()
    {
        if (front>rear) 
        {
            System.out.println("Empty queue");
            
        }
        else{
        int d=arr[front];
        arr[front]=0;
        front++;
        size--;
        return d;
        }
        return -1;
    }
     public int size()
    {
        return size-1;
    }
    public void Display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[front+i]+" ");
        }
        System.out.println();
    }
}
class runner1{
    public static void main(String[] args) {
        B b=new B();
        b.enqueue(10);
         b.enqueue(20);
          b.enqueue(30);
           b.enqueue(40);
            b.enqueue(50);
            b.enqueue(60);
            b.Display();
            System.out.println("Deleted element is "+b.dequeue());
            System.out.println("Deleted element is "+b.dequeue());
            System.out.println("Size of Queue is "+b.size());
            b.Display();
            
    }
}

// circuler Queue
class B{
    int arr[]=new int[5];
    int front=0;
    int rear=0;
    int size=0;
    public void enqueue(int data)
    {
        
        
        {
             arr[rear]=data;
             rear=(rear+1)%5;
             size=(size+1);
        }
        
    }
    public int dequeue()
    {
        if (size==0) 
        {
            System.out.println("Empty queue");
        }
        else{
        int d=arr[front];
        arr[front]=0;
        front=(front+1)%5;
        size=(size-1);
        return d;
        }
        return -1;
    }
     public int size()
    {
        return size-1;
    }
    public void Display()
    {
        for(int i=0;i<size-1;i++)
        {
            System.out.print(arr[(front+i)%5]+" ");
        }
        System.out.println();
    }
}
class runner1{
    public static void main(String[] args) {
        B b=new B();
        b.enqueue(10);
         b.enqueue(20);
          b.enqueue(30);
           b.enqueue(40);
            b.enqueue(50);
            b.enqueue(60);
            b.enqueue(70);
            b.enqueue(80);
            b.enqueue(90);
            b.enqueue(100);
            b.enqueue(110);

            b.Display();
            System.out.println("Deleted element is "+b.dequeue());
            System.out.println("Deleted element is "+b.dequeue());
            System.out.println("Size of Queue is "+b.size());
            b.Display();
            
    }
}

// tree 
import java.util.Scanner;

class Node{
    int data;
    Node left=null;
    Node right=null;

    public Node(int data)
    {
        this.data=data;
    }
}
class A{
    public Node create()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data");
        int data=sc.nextInt();
        if (data==-1) 
        {
            return null;
        }
        Node root=new Node(data);
        System.out.println("Enter the left child of "+root.data);
        root.left=create();
        System.out.println("Enter the right child of "+root.data);
        root.right=create();
        return root;

    }
    public void Inorder(Node n)
    {
        if (n==null) 
        {
            return ;
            
        }
        Inorder(n.left);
        System.out.print(n.data+" ");
        Inorder(n.right);
    }
    public void Preorder(Node n)
    {
        if (n==null) 
        {
            return ;
            
        }
        System.out.print(n.data+" ");
        Preorder(n.left);
        Preorder(n.right);
    }
    public void Postorder(Node n)
    {
        if (n==null) 
        {
            return ;
            
        }
        Postorder(n.left);
        Postorder(n.right);
        System.out.print(n.data+" ");

    }

}
class runner{
    public static void main(String[] args) {
        A a=new A();
        Node n=a.create();
        a.Inorder(n);
        System.out.println();
        a.Preorder(n);
        System.out.println();
        a.Postorder(n);
    }
}

// Graph 
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Graph{
    List<Integer> adj[];
    @SuppressWarnings("unchecked")
    public Graph(int v)
    {
        adj=new List[v];
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList<Integer>();   
        }

    }
    public void insertedge(int s,int d)
    {
        adj[s].add(d);
        adj[d].add(s);
    }
    public void bfs(int source)
    {
        
        int parent_node[]=new int[adj.length];
        boolean visited_node[]=new boolean[adj.length];
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        parent_node[source]=-1;
        visited_node[source]=true;
        
        while (!q.isEmpty()) 
        {
            int p=q.poll();
            System.out.println("element is "+p);
            for(int i1:adj[p])
            {
                if (visited_node[i1]!=true) 
                {
                    visited_node[i1]=true;
                    parent_node[i1]=p;
                    q.add(i1);
                }
            }
            
            
        }
    }
}

class A
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of vertices and edges");
        int v=sc.nextInt();
        int e=sc.nextInt();
        Graph g=new Graph(v);
        System.out.println("Enter the edges");
        for(int i=0;i<e;i++)
        {
            int s=sc.nextInt();
            int d=sc.nextInt();
            g.insertedge(s,d);
        }
        System.out.println("Enter the source node for bfs traversal");
        int source=sc.nextInt();
        g.bfs(source);

    }
}
    

// Binary tree is a hierarchical data structure in which each node have at most 2 children .
 -> A tree haveing 0,1,2 children .

types of Binary tree 

1. Full Binary tree = each node either have 0 or 2 children .
2. Perfect binary tree = all the internal node must have 2 children accept the leaf node .
3. Complete binary tree = node must be completed at one level before moving to the next level and inserting of node is from left to right .
4. Binary Search tree  = A binary tree where left child < parent < right child.
5. Balanced search tree = Like AVL tree , Red-black tree .

// B Tree is a self balanced search tree in which a node can have more than 2 children .

# properties of b tree
 1. All the leaf node must be at same level 
 2. all the keys in the node must be in asscending order 
 3. A b  tree of order m have the following properties .
 -> each node have a max of m children aad min of m/2 children .
 -> all node accept the root must have alteast m/2 - 1 and maximum of m-1 keys 

-> backtracking use brut-force approach generate all possible solution 
1.bottom up approach 
2.Guarantees correct solution
 ex n-queen, subset generator , graph coloring , sudoku solver ,branch and bound 

# greedy Choose best at each step  used to generate optimal solution .
-> follows top-down approach .
-> it generate only one as optimal solution .
-> it may or may not generate optimal solution .

| Feature         | Backtracking                           | Greedy Technique                           |
| --------------- | -------------------------------------- | ------------------------------------------ |
| Strategy        | Try all options (recursive)            | Choose best at each step                   |
| Optimization    | Guarantees correct solution            | May not guarantee optimal solution         |
| Used For        | Decision problems, constraint problems | Optimization problems                      |
| Complexity      | Higher (exponential)                   | Lower (usually polynomial)                 |
| Example Problem | N-Queens, Sudoku                       | Kruskal’s, Dijkstra’s, Fractional Knapsack ,huffman encoding .
|

 
Dynamic programing algorithms used to generate optimal solution .
-> follow bottom -up approach 
-> it generate many decision sequence as optimal solution .
-> it always optimal solution .

1 . Knapsack problem (fractional and unbound )
2 . Matrix Chain Multiplication:
3 . Maximum Subarray Problem (Kadane's Algorithm):
4 . Longest common sequence .
5 . Floyd-Warshall Algorithm:
6 . Bellman-Ford Algorithm:
7 . sum of subset 

# divide and conquer divides the problem into sub problem 
->follow top-down approach 
->it is used to solve decision problem .
->sub problem are independent .
->solution of subproblem computed recursively more than once .

1.Strassen’s Matrix Multiplication
2.Merge sort
3.Quick sort 
4.Binary search 


1--> Kruskal Algorithm for Minimum cost spanning tree .

A <- o
for each vertices V (- V[G]
            do MAKESET (V)
sort the edge into non decreasing order by weight .
for each edge (u,v) (- E[G]
                do if FINDSET U != FINDSET V 
                then A <- A U {(U,V)} 
                union (u,V)


2--> Prims Algorithm for Minimum cost spannig tree .

for each vertices u (- V(G)
            do key(u) <- infinity
            pie (u) <- nill
key(r) <- 0
Q <- v[G]
while (Q!=0)
            do u <- extract min Q
            for each vertices V (- Adj(u)
            do if V (- Q and W[u,V] < key V
                    then  pie (v) <- U
                     key(V) <- w[u,v]


3--> Dijkastra Algorithm in which all the edge weight are non negative .
INITILIZE SINGLE SOURCE (G,s)
S <- 0
Q <- V[G]
while (Q ! = 0)
        do u <- extract min Q
        s <- s u (u)
        for each vertices v (- Adj[u]
        do Relax(u,v,w)

INITILIZE SINGLE SOURCE
for each vertices v (- v[G]
        do d[v] <- infinity
        pie [v]<- nill
d{s}<-0

do Relax(u,v,w)
if d[v]> d[u]+w(u,v)
   then d[v] <- d[u]+w(u,v)
      pie[v] <- u


4--> Warshalls Algorithm all pair sortest path

n <- rows[w]
D^0 <- w
for k <- 1 to n  // D^ (1 to n) for matrix
        do for i <- 1 to n  // for row
                do for j <- 1 to n  // for column
                do dij^k  <- min{ dij^k-1 , dik^k-1, dkj^k-1}

return D^n // return final matrix

5--> Bellman ford Algorithm for single source sortest path

INITILIZE SINGLE SOURCE (G,S)
for i <- 1 to | v[G] -1 |
    do for each edge (u,v) (- E[G]
     do Relax(u,v,w)
for each edge (u,v) (- E[G] 
       do if d[v]> d[u]+w(u,v)
              return false
return true

INITILIZE SINGLE SOURCE
for each vertices v (- v[G]
        do d[v] <- infinity
        pie [v]<- nill
d{s}<-0

do Relax(u,v,w)
if d[v]> d[u]+w(u,v)
   then d[v] <- d[u]+w(u,v)
      pie[v] <- u




*/ 
// sum of maximum sub string . max subarray (kadane's algorithm ) Dynamic programing .

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class A{

    public int substring(int arr[])
    {
        int max_so_far=arr[0];
        int cur_max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            cur_max=Math.max(arr[i], arr[i]+cur_max);
            max_so_far=Math.max(cur_max, max_so_far);
        }
        return max_so_far;
    }
    public static void main(String[] args) {
        int arr[]={-2,-5,6,-2,-3,1,5,-6};
        A a=new A();
       int r= a.substring(arr);
       System.out.println(r);
    }
}

// container with max water .// greedy technique 
class B{

    public int water(int arr[])
    {
        int left=0;
        int right=arr.length-1;
        int maxarea=0;
        while (left<right) 
        {
            int area=Math.min(arr[left],arr[right])*(right-left);
            maxarea=Math.max(maxarea, area);
            if (arr[left]<arr[right])
            {
                left++;
                
            }else{
                right--;
            }
            
        }return maxarea;

    }
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        B b=new B();
        int r=b.water(arr);
        System.out.println(r);
    }
}
// twosum problem .
class C{
    @SuppressWarnings("unchecked")
    public List<Integer> twosum(int arr[],int target)
    {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int complement=target-arr[i];
            if (m.containsKey(complement)) 
            {
                return List.of(m.get(complement),i);
            }
            m.put(arr[i], i);
        }
        return new ArrayList<>() ;
    }
    public static void main(String[] args) {
        int arr[]={16,4,23,8,15,42,1,2};
        int target=19;
        C c=new C();
        List<Integer> i=c.twosum(arr,target);
        System.out.println(i);
    }
}
// three sum 
class D{
    public List<List<Integer>> sum(int arr[])
    {
        if (arr==null || arr.length<3) 
        {
            return new ArrayList<>();
        }
        Arrays.sort(arr);
        Set<List<Integer>> result=new HashSet<>();
        for(int i=0;i<arr.length-2;i++)
        {
            int left=i+1;
            int right=arr.length-1;
          while (left<right) 
          {
            int sum=arr[i]+arr[left]+arr[right];
          if (sum==0) 
          {
            result.add(Arrays.asList(arr[i],arr[left],arr[right]));
            left++;
            right--;
          }
          else if(sum<0)
          {
            left++;
          }
          else{
            right--;
          }
            
          }
        }
          return new ArrayList<>(result);
    }
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        D d=new D();
        List<List<Integer>> r=d.sum(arr);
        System.out.println(r);
    }
}