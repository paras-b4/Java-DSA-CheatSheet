/*
 
class Node{
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
        newnode.data=data;
        newnode.next=null;
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
            System.out.println("Empty LinkedList");
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void insertAtEnd(int data)
    {
        Node newnode=new Node(data);
        if (head==null) 
        {
            System.out.println("Empty LinkedList");
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
    public void insertAtIndex(int data,int index)
    {
        Node newnode=new Node(data);
        if (head==null) 
        {
            System.out.println("Empty LinkedList");
        }
        else if(index==0)
        {
            insertAtBeg(data);
        }
        else if (index>size()) {
            System.out.println("Enter a valid index conot insert "+data +" at "+index);
        }
        else{
            Node temp=head;
            int i=0;
            while (i<index-1) {
                temp=temp.next;
                i++;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }
    public void DeleteFromBeg()
    {
        if (head==null) 
        {
            System.out.println("Empty linkedList");
        }
        else{
            head=head.next;
        }
    }
    public void DeleteFromEnd()
    {
        if (head==null) 
        {
            System.out.println("Empty linkedList");
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
    public void DeleteAtIndex(int index)
    {
        if (head==null) 
        {
            System.out.println("Empty LinkedList");
        }
        else if (index==0) 
        {
            DeleteFromBeg();
        }
        else if (index>size()) 
        {
            System.out.println("Enter a valid index connot delete element at index "+index);
            
        }
        else{
            Node temp=head;
            Node prev=null;
            int i=0;
            while (i<index) 
            {
                prev=temp;
                temp=temp.next;     
                i++;          
            }
            prev.next=temp.next;
            temp.next=null;
        }
    }
    public int size()
    {
        Node temp=head;
        int count=0;
        while (temp.next!=null) 
        {
            count+=1;
            temp=temp.next;
        }
        return count;

    }
    public void show()
    {
        if (head==null) 
        {
            System.out.println("Empty LinkedList");
        }
        else
        {
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
class Runner {
    public static void main(String[] args) {
        A a=new A();
        a.create(10);
        a.create(20);
        a.create(30);
        a.create(40);
        a.create(50);
        a.create(60);
        a.insertAtBeg(100);
        // a.insertAtBeg(120);
        a.insertAtEnd(90);
        // a.insertAtEnd(95);
        
        a.insertAtIndex(110, 1);
      
        a.DeleteFromBeg();
        a.DeleteFromEnd();
        a.DeleteAtIndex(4);
        System.out.println(a.size());
        a.show();
    }
}

// Doublly LinkedList 

class Node{
    int data;
    Node prev=null;
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
            //Node temp=head;
            // while (temp.next!=null) 
            // {
            //     temp=temp.next;
            // }
            // temp.next=newnode;
            // newnode.prev=temp;
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }
    public void insertAtBeg(int data)
    {
        Node newnode=new Node(data);
        {
            if(head==null)
            {
              head=newnode;
              tail=newnode;
            }
            else{
                newnode.next=head;
                head.prev=newnode;
                head=newnode;
                
            }

        }
    }
    public void insertAtEnd(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
          head=newnode;
          tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }

    }
    public void insertAtIndex(int data,int index)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
          head=newnode;
          tail=newnode;
        }
        else if(index==0)
        {
            insertAtBeg(data);
        }
        else if (index==size())
        {
            insertAtEnd(data);
            
        }
        else if(index>size())
        {
            System.out.println("Enter a valid index canot insert "+data+" at "+index);
        }
        else{
            Node temp=head;
            Node prevNode=null;
            int i=0;
            while (i<index) 
            {
                prevNode=temp;
                temp=temp.next;
                i++;
            }
            newnode.prev=prevNode;
            prevNode.next=newnode;
            newnode.next=temp;
            temp.prev=newnode;
        }
        
    }
    public void DeleteFromBeg()
    {
        if (head==null) 
        {
            System.out.println("Empty Dll");
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }
    public void DeleteFromEnd()
    {
        if (head==null) 
        {
            System.out.println("Empty Dll");
        }
        else{
            Node temp=head;
            Node prevNode=null;
            while (temp.next!=null) 
            {
                prevNode=temp;
                temp=temp.next;
            }
            prevNode.next=null;
            tail=prevNode;
        }

    }
    public void DeleteAtIndex(int index)
    {
        if (head==null) 
        {
            System.out.println("Empty Dll");
        }
        else if (index==0) 
        {
            DeleteAtIndex(index);
        }
       
        else if (index>size()) 
        {
            System.out.println("Enter a valid index at "+index);
        }
        else
        {
            Node temp=head;
            Node prNode=null;
            int i=0;
            while (i<index-1) 
            {
                prNode=temp;
                temp=temp.next;
                i++;
            }
            temp.next.prev=prNode;
            prNode.next=temp.next;

        }
        
    }
    public int size()
    {
        if (head==null) 
        {
            System.out.println("Empty Dll");
        }
        else{
            Node temp=head;
            int count=0;
            while (temp.next!=null) 
            {
                count+=1;
                temp=temp.next;
            }
            return count;
        }
        return -1;

    }
    public void show()
    {
        if (head==null) 
        {
            System.out.println("Empty DLL");
        }
        
        else{
            Node temp=head;
            System.out.println("Forward traversal");
            while (temp.next!=null) 
            {
                System.out.print(temp.data+" ");
                temp=temp.next;   
            }
            System.out.println(temp.data);
            System.out.println("Backword traversal");
            Node temp1=tail;
            while (temp1.prev!=null) 
            {
                System.out.print(temp1.data+" ");
                temp1=temp1.prev;   
            }
            System.out.print(temp1.data);
        }
    }
   
}
class Runner{
    public static void main(String[] args) {
        A a=new A();
        a.create(10);
        a.create(20);
        a.create(30);
        a.create(40);
        a.create(50);
        a.insertAtBeg(100);
        a.insertAtEnd(90);
        a.insertAtIndex(120, 6);
        // a.DeleteFromBeg();
        // a.DeleteFromEnd();
         a.DeleteAtIndex(7);
        System.out.println(a.size());
        a.show();
    }
}

// circular LL

class Node{
    int data;
    Node next;
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
            tail=newnode;
            tail.next=head;
        }
   }
   public void insertAtBeg(int data)
   {
        Node newnode=new Node(data);
        if (head==null) 
        {
            head=newnode;
            tail=newnode;
            
        }
        else{
            newnode.next=head;
            head=newnode;
            tail.next=newnode;
        }
   }
   public void insertAtEnd(int data)
   {
        Node newnode=new Node(data);
        if (head==null) 
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            tail.next=newnode;
            tail=newnode;
            tail.next=head;

        }
    
   }
   public void insertAtIndex(int data,int index)
   {
        Node newnode=new Node(data);
        if (head==null) 
        {
            head=newnode;
            tail=newnode;
        }
        else if(index==0)
        {
            insertAtBeg(data);
        }
        
        else if (index>size()) {
            System.out.println("Enter a valid index cannot insert "+data+" at "+index);
        }
        else
        {
            Node temp=head;
            Node prNode=null;
            int i=0;
            while (i<index) 
            {
                prNode=temp;
                temp=temp.next;
                i++;
            }
            newnode.next=prNode.next;
            prNode.next=newnode;

        }
     
   }
   public void DeleteFromBeg()
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
   public void DeleteFromEnd()
   {
        if (head==null) 
        {
        System.out.println("Empty CLL");
        }
        else{
            Node temp=head;
            Node prNode=null;
            
            while (temp.next!=head) 
            {
                prNode=temp;
                temp=temp.next;
            
            }
            prNode.next=null;
            tail=prNode;
            tail.next=head;
        }

   }
   public void DeleteAtIndex(int index)
   {
        if (head==null) 
        {
            System.out.println("Empty CLL");   
        }
        else if (index==0)
        {
            DeleteFromBeg();
            
        }
        else if (index==size()) 
        {
            DeleteFromEnd();
            
        }
        else
        {
            Node temp=head;
            int i=0;
            Node prNode=null;
            while (i<index) 
            {
                prNode=temp;
                temp=temp.next;
                i++;
            }
            prNode.next=temp.next;

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
            int count=0;
            while (temp.next!=head) 
            {
                count+=1;
                temp=temp.next;
            }
            return count;
        }
        return -1;
   }
   public void show()
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
            System.out.println(temp.data);

            // do {
            //     System.out.print(temp.data+" ");
            //     temp=temp.next;
            // } while (temp!=head);

        }
   }

}
class Runner{
    public static void main(String[] args) {
        A a=new A();
        a.create(10);
        a.create(20);
        a.create(30);
        a.create(40);
        a.create(50);
        a.create(60);
        a.insertAtBeg(100);
        a.insertAtEnd(90);
        a.insertAtIndex(120, 7);
        a.DeleteFromBeg();
        a.DeleteFromEnd();
        a.DeleteAtIndex(4);
        System.out.println(a.size());
        a.show();

    }

}


// Tree

import java.util.Scanner;

class Node {
    int data;
    Node Left=null;
    Node Right=null;

    public Node(int data)
    {
        this.data=data;
    }
}
class A{

    public Node create()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int n=sc.nextInt();
        if (n==-1) 
        {
            return null;
        }
        Node root=new Node(n);
        System.out.println("Enter the left node of "+n);
        root.Left=create();
        System.out.println("Enter the right node of "+n);
        root.Right=create();
        return root;
    }
    public void inorder(Node root)
    {
        if (root==null) 
        {
            return ;
        }
        inorder(root.Left);
        System.out.print((root.data+" "));
        inorder(root.Right);

    }
    public void preorder(Node root)
    {
        if (root==null) 
        {
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.Left);
        preorder(root.Right);

    }
    public void postorder(Node root)
    {
        if (root==null) 
        {
            return ;
        }
        postorder(root.Left);
        postorder(root.Right);
        System.out.print(root.data+" ");

    }
}
class Runner{
    public static void main(String[] args) {
        A a=new A();
        Node n=a.create();
        a.inorder(n);
        a.preorder(n);
        a.postorder(n);
    }

}


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
class Graph{

    List<Integer> adj[];
    
    @SuppressWarnings("unchecked")
    public Graph(int v)
    {
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
    }
    public void insert(int s,int d)
    {
        adj[s].add(d);
        adj[d].add(s);
    }
    
    public void bfs(int source)
    {
        int parent_node[]=new int[adj.length];
        boolean[] visited_node=new boolean[adj.length];
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        parent_node[source]=-1;
        visited_node[source]=true;
        while (!q.isEmpty()) 
        {
            int p=q.poll();
            System.out.print(p+" ");
           for(int i:adj[p])
           {
            if (visited_node[i]!=true) 
            {
                visited_node[i]=true;
                q.add(i);
                parent_node[i]=p;
            }
           }
            
        }
        

    }
   
}

class A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of vertices");
        int v=sc.nextInt();
        System.out.println("Enter the no of edges");
        int e=sc.nextInt();
        Graph g=new Graph(v);
        System.out.println("Enter the edges ");
        for(int i=0;i<e;i++)
        {
            int s=sc.nextInt();
            int d=sc.nextInt();
            g.insert(s, d);

        }
        System.out.println("Enter the source node for bfs traversal");
        int source=sc.nextInt();
        g.bfs(source);
    }
}



// import java.util.LinkedList;
// import java.util.Scanner;
// import java.util.Queue;
// class Graph
// {
//     LinkedList<Integer>[] adj;
//    @SuppressWarnings("unchecked")
//     public Graph(int v)
//     {
//         adj=new LinkedList[v];
//         for(int i=0;i<v;i++)
//         {
//             adj[v]=new LinkedList<Integer>();
//         }
//     }
//     public void insert(int s,int d)
//     {
//         adj[s].add(d);
//         adj[d].add(s);
//     }
//     public void bfs(int source)
//     {
//         int parent_node[]=new int[adj.length];
//         boolean visited_node[]=new boolean[adj.length];
//         Queue<Integer> q=new LinkedList<Integer>();
//         q.add(source);
//         parent_node[source]=-1;
//         visited_node[source]=true;
//         while (!q.isEmpty()) 
//         {
//             int p=q.poll();
//             System.out.print(p+" ");
//             for(int i:adj[p])
//             {
//                 if (visited_node[i]!=true) 
//                 {
//                     visited_node[i]=true;
//                     parent_node[i]=p;
//                     q.add(i);
                    
//                 }
//             }
            
//         }
//     }
// }

// class A{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no of vertices ");
//         int v=sc.nextInt();
//         System.out.println("Enter the no of edges");
//         int e=sc.nextInt();
//         Graph g=new Graph(v);
//         System.out.println("Enter the edges");
//         for (int i=0;i<e;i++)
//         {
//             int s=sc.nextInt();
//             int d=sc.nextInt();
//             g.insert(s, d);
//         }
//         System.out.println("Enter the source node for bfs traversal ");
//         int source=sc.nextInt();
//         g.bfs(source);
//     }
// }

import java.util.LinkedHashMap;
import java.util.Map;

class A{
    public int water(int arr[])
    {
        int left=0;
        int right=arr.length-1;
        int maxarea=0;
        while (left<right) 
        {
            int area=Math.min(arr[left] , arr[right]) *(right-left);
            maxarea=Math.max(maxarea, area);
            if (arr[left]<arr[right])
            {
                left++;
            }
            else
            {
                right--;
            }
            
        }
        return maxarea;
    }
    public static void main(String[] args) {
        A a=new A();
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println(a.water(arr));
    }
}

@SuppressWarnings("rawtypes")
class LRU<V, K> extends LinkedHashMap<K,V>{
    int capacity;
    public LRU(int capacity)
    {
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }
    @Override
    public boolean removeEldestEntry(Map.Entry<K,V> eldest )
    {
        return size()>capacity;

    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        LRU lru=new LRU(3);
        lru.put(1, 100);
        lru.put(2, 200);
        lru.put(3, 300);
        System.out.println(lru);
        System.out.println(lru.get(2));//200
        lru.put(4, 400);
        lru.put(5, 500);
        System.out.println(lru);
    }
}

// stack

class A{
    int top=0;
    int size;
    int stack[]=new int[5];

    public void push(int data)
    {
        if (size == stack.length) 
        {
             System.out.println("Stack Overflow");
        }
      else
      {
        stack[top]=data;
        top++;
        size++;
        }

    }
    public int pop()
    {
      if (size == 0) {
        System.out.println("Stack Underflow");
        return -1; // or throw exception
        }
       else{
        top--;
        int data=stack[top];
        stack[top]=0;
        
        size--;
        return data;
        }

    }
    public int peek()
    {
        if (top==0) 
        {
            return 0;
            
        }
        else{
            return stack[--top];
        }
    }

    public void show()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(stack[i]+" ");
        }
    }
    public static void main(String[] args) {
        A a=new A();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        a.push(50);
      
       System.out.println("deleted elements are "+a.pop()); 
       System.out.println("deleted elements are "+a.pop()); 
       System.out.println("peek element is "+a.peek());
        a.show();
    }
}

// queue 

class A{
    int Queue[]=new int[5];
    int front=0;
    int rear=0;
    int size=0;

    public void enqueue(int data)
    {
        if (size==Queue.length) {
            System.out.println("Queue is full cannot add "+data);
        }
       else{
        Queue[rear]=data;
        rear=rear+1;
        size=size+1;
       }

    }
    public int dequeue()
    {
        if (size==0) {
            System.out.println("Empty Queue");
            return -1;
        }
       else{
        int d=Queue[front];
        // Queue[front]=0;
        front=front+1;
        size=size-1;
        return d ;
       }

    }
    public int size()
    {
        return size;
    }
    public void show()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(Queue[i+front]+" ");
        }
    }
    public static void main(String[] args) {
        A a=new A();
        a.enqueue(10);
        a.enqueue(20);
        a.enqueue(30);
        a.enqueue(40);
        a.enqueue(50);
        a.enqueue(60);
        System.out.println("deleted element is "+a.dequeue());
        System.out.println("deleted element is "+a.dequeue());
       
        System.out.println("size of Queue is "+a.size());
        a.show();
    }

}



// circular queue .

// class A{
//     int Queue[]=new int[5];
//     int front=0;
//     int rear=0;
//     int size=0;

//     public void enqueue(int data)
//     {
       
      
//         Queue[rear]=data;
//         rear=(rear+1)%5;
//         size=(size+1);
       

//     }
//     public int dequeue()
//     {
       
//         int d=Queue[front];
//         // Queue[front]=0;
//         front=(front+1)%5;
//         size=(size-1);
//         return d ;
       
//     }
//     public int size()
//     {
//         return size;
//     }
//     public void show()
//     {
//         for(int i=0;i<size;i++)
//         {
//             System.out.print(Queue[(i+front)%5]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         A a=new A();
//         a.enqueue(10);
//         a.enqueue(20);
//         a.enqueue(30);
//         a.enqueue(40);
//         a.enqueue(50);
//         a.enqueue(60);
//         a.enqueue(70);
        
//         System.out.println("deleted element is "+a.dequeue());
//         System.out.println("deleted element is "+a.dequeue());

//         System.out.println("size of Queue is "+a.size());
//         a.show();

//     }

// }

import java.util.LinkedHashMap;
import java.util.Map;

class LRU<K,V> extends LinkedHashMap<K,V>{
    int capacity;
    public LRU(int capacity)
    {
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }
    @Override
    public boolean removeEldestEntry(Map.Entry<K,V> eldest)
    {
        return size()>capacity;
    }
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) 
    {   
        @SuppressWarnings("rawtypes")
        LRU lru=new LRU(2);
        lru.put(1, 100);
        lru.put(2,200);
        lru.get(1);
        lru.put(3,300);
        lru.put(4,400);
        lru.get(3);
        lru.put(5,500);
        System.out.println(lru);
        
    }
}

// max water

class A{
    public int water(int arr[])
    {
        int left=0;
        int right=arr.length-1;
        int maxarea=0;
        while (left<right) 
        {
            int area=Math.min(arr[left],arr[right])* (right-left);
            maxarea=Math.max(maxarea, area);
            if (arr[left]<arr[right]) 
            {
                left++;
                
            }
            else{
                right--;
            }
           
        }
        return maxarea;
       
    }
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        A a=new A();
        System.out.println(a.water(arr));
    }
}


// max_sub_string 

class A{
    public int maxsubstring(int arr[])
    {
        int cur_max=arr[0];
        int max_so_far=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            cur_max=Math.max(arr[i],arr[i]+ cur_max);
            max_so_far=Math.max(max_so_far, cur_max);

        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int arr[]={-2,-5,6,-2,-3,1,5,-6};
        A a=new A();
       System.out.println( a.maxsubstring(arr));;
    }
}


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class A{

   
        public List<List<Integer>> threesum(int arr[])
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
                    int sum=arr[left]+arr[right]+arr[i];
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
      

    

    public static void main(String[] args) 
    {
        int arr[]={-1,0,1,2,-1,-4};
        A a=new A();
        List<List<Integer>> list=a.threesum(arr);
      for(List<Integer> i:list)
      {
        for(Integer i1:i)
        {
            System.out.print(i1+" ");
        }
        System.out.println();
      }
        
    }
}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class A{

   
    public List<List<Integer>> threesum(int arr[])
    {
        if (arr==null||arr.length<3) 
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
        A a=new A();
        List<List<Integer>> i =  a.threesum(arr);
        for(List<Integer> i1:i)
        {
            for(Integer j:i1)
            {
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}

class A{
    public void quicksort(int arr[],int low,int high)
    {
        if (low<high) 
        {
            int pi=partition(arr,low,high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);

        }

    }
    public int partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;
        int j=low;
        while (j!=high) 
        {
            if (arr[j]<pivot) 
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
    public static void main(String[] args) {
        int arr[]={9,7,12,161,4,20,27,22,1,0,5};
        int low=0;
        int high=arr.length-1;
        A a=new A();
        a.quicksort(arr,low,high);

        
    }
}
class B{
    public void mergesort(int arr[],int low,int high )
    {
        if (low<high) 
        {
            int mid=(low+high)/2;
            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);
            merg(arr,low,mid,high);
        }
    }
    public void merg(int arr[],int low,int mid,int high)
    {
        int n1=(mid-low+1);
        int n2=(high-mid);

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
        int i=0,j=0,k=low;
        while (i<n1&&j<n2) 
        {
            if (larr[i]<rarr[j]) 
            {
                arr[k]=larr[i];
                i++;
                k++;
            }
            else{
                arr[k]=rarr[j];
                j++;
                k++;
            }

            
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
        int arr[]={9,7,12,161,4,20,27,22,1,0,5};
        int low=0;
        int high=arr.length-1;
        B b=new B();
        b.mergesort(arr,low,high);
    }
}


class A{
    public int maxsubstring(int arr[])
    {
        int cur_max=arr[0];
        int max_so_far=arr[0];
        for(int i=1;i<arr.length-1;i++)
        {
            cur_max=Math.max(arr[i], arr[i]+cur_max);
            max_so_far=Math.max(max_so_far, cur_max);
        }
       
        
    }
    public static void main(String[] args) {
        int arr[]={-2,-5,6,-2,-3,1,5,-6};
        A a=new A();
       System.out.println( a.maxsubstring(arr));;
    }
}

// quick sort 
class A{

    public void quicksort(int arr[],int low,int high)
    {
        if (low<high) 
        {
            int pi=partition(arr,low,high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
            
        }
    }
    public int partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int j=low;
        int i=low-1;
        while (j!=high) 
        {
            if (arr[j]<pivot) 
            {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                
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
    public static void main(String[] args) {
        int arr[]={10,12,11,9,4,7,17,15,20,21};
        int low=0;
        int high=arr.length-1;
        A a=new A();
        a.quicksort(arr,low,high);
    }
}

// merge sort 
class A{

    public void mergesort(int arr[],int low,int high)
    {
        if (low<high) 
        {
            int mid=(low+high)/2;
            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);
            merge(arr,low,mid,high);
            
        }

    }
    public void merge(int arr[],int low,int mid,int high)
    {
        int n1=(mid-low)+1;
        int n2=(high-mid);
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
        int i=0,j=0,k=low;
        while (i<n1&&j<n2) 
        {
            if (larr[i]<rarr[j]) 
            {
                arr[k]=larr[i];
                i++;
                k++;
            }
            else{
                arr[k]=rarr[j];
                j++;
                k++;
            }
        }
        while (i<n1) 
        {
            arr[k++]=larr[i++];

            
        }
        while (j<n2) 
        {
            arr[k++]=rarr[j++];
            
        }
        for(int i1:arr)
        {
            System.out.print(i1+" ");
        }
        System.out.println();


    }
    public static void main(String[] args) {
        int arr[]={10,12,11,9,4,7,17,15,20,21};
        int low=0;
        int high=arr.length-1;
        A a=new A();
        a.mergesort(arr,low,high);

    }

}


import java.util.LinkedHashMap;
import java.util.Map;

class A<K,V> extends LinkedHashMap<K,V>
{
    int capacity;
    public A(int capacity)
    {
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }
    public boolean removeEldestEntry(Map.Entry<K,V> eldest)
    {
        return size()>capacity;

    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        A a=new A(2);
        a.put(1, 100);
        a.put(2, 200);
        a.put(3, 300);
        a.get(2);
        a.put(4,400);
        a.get(2);
        a.put(5,450);
        System.out.println(a);
    }
    
}
*/

import java.util.LinkedHashMap;
import java.util.Map;
class LRU<K,V> extends LinkedHashMap<Integer,Integer>
{
    int capacity;
    public LRU(int capacity)
    {
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }
    public boolean removeEldestEntry(Map.Entry<Integer,Integer> Entry )
    {
        return size()>capacity;
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        LRU l=new LRU(3);
        l.put(1, 100);
        l.put(2, 200);
        l.put(3, 300);
        l.get(1);
        System.out.println(l);
        
        l.put(4, 400);
        l.put(5, 500);
        System.out.println(l);
    }

}
