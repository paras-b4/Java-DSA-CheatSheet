/*
// Linear search 

import java.util.Scanner;

class Demo{
    int arr[]={2,5,4,9,1,10,15,12};
    
    public int LinearSearch(int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
        }
    public static void main(String[] args) {
        
        Demo d=new Demo();
        System.out.println("Enter the element you want to search : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=d.LinearSearch(num);
        System.out.println("Element found at index : "+result);
        sc.close();  
    }    
}

// Binary search 
import java.util.Scanner;

class Demo{
    int arr[]={12,15,19,14,11,9,8,5,6};
    int a=0;
    int b=arr.length;
    public int BinarySearch(int num){
        while(a<b){
            int mid=(a+b)/2;
            if(arr[mid]==num){
                return mid ;
            }
            else if(arr[mid]>num){
                a=mid+1;
            } 
            else
             b=mid-1;
        }
        return-1;
    }
    public static void main(String[] args) {
        Demo d=new Demo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element you want to search : ");
        int a=sc.nextInt();
        int result=d.BinarySearch(a);
        System.out.println("Element found at index : "+result);
        sc.close();
    }
}

// Bubble Sort
class Demo{
    int arr[]={16,15,14,18,16,9,8,4,0};

    public void BubbleSort(){

        System.out.println("Array before sortiing : ");
        for(int n:arr){
            System.out.print(n+" ");
        }

        System.out.println();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    // System.out.print(arr[j]);
                }
                
            }
          
        }

        System.out.println("Array after sortiing : ");
        for(int n:arr){
            System.out.print(n+" ");
        }

    }
    public static void main(String[] args) {
        Demo d=new Demo();
        d.BubbleSort();
    }
}

// Insertion sort 
class Demo{
    int arr[]={12,14,11,10,16,9,3,4,7};
    int i=2;
    int j=i-1;
    public void InsertionSort(){

        System.out.println("Array before Insertion sorting : ");
        for(int n:arr){
            System.out.print(n+" ");
        }

        for(int i=1;i<arr.length;i++){
            int key=arr[i]; 
             j=i-1;
            while(j>=0&&key<arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
                
            }
            arr[j+1]=key;
            

        }

        System.out.println("Array after Insertion sorting : ");
        for(int n:arr){
            System.out.print(n+" ");
        }

    }
    public static void main(String[] args) {
        Demo d=new Demo();
        d.InsertionSort();
    }
}

// Selection sort
class Demo{
    int arr[]={12,8,14,10,9,5,6,7,11};
    int min=0;
    public void SelectionSort(){

        System.out.println("Array before selection sorting : ");
        for(int n:arr)
        {
            System.out.print(n+" ");
        }

        for(int i=0;i<arr.length;i++){
            min=i;
            
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min =j;
                }
            }
           
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }

        System.out.println("Array after selection sorting : ");
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        Demo d=new Demo();
        d.SelectionSort();
    }

}

// Quick Sort 
class Demo{

    public static void QuickSort(int[] arr,int low,int high){
            if(low<high){
                int pi=partition(arr,low,high);
                QuickSort(arr, low, pi-1);
                QuickSort(arr, pi+1, high);
        }
    }

    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                
            }
            
        }
        
            int temp=arr[i+1];
            arr[i+1]=arr[high];
            arr[high]=temp;

            return i+1;


    }
    public static void main(String[] args) {
        int arr[]={12,25,14,16,9,9,0,18,17};

        System.out.println("Array after Quick sort sorting : ");
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
        
        QuickSort(arr,0,arr.length-1);

        System.out.println("Array after Quick sort sorting : ");
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
    }
}

//QuickSort
class Demo{


    public void QuickSort(int arr[],int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            QuickSort(arr, low, pi-1);
            QuickSort(arr, pi+1, high);
        }
    }
    public int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[high];
        arr[high]=arr[i+1];
        arr[i+1]=temp;
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={12,25,2,4,16,15,30,0,7};
        Demo d=new Demo();
        System.out.println("Array Before Quick sort sorting : ");
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
        d.QuickSort(arr,0,arr.length-1);
        System.out.println("Array after Quick sort sorting : ");
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
    }

}
*/
// Merg sort
class Demo{

    public void MergSort(int arr[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            MergSort(arr,low,mid);
            MergSort(arr,mid+1, high);
            Merg(arr,low,mid,high);
        }
    }

    public void Merg(int arr[],int low,int mid,int high){
        int n1=(mid-low) +1; // [ (3-0) +1 = 4 ] Elements //we have an array {25[0] , 14[1] , 13[2] , mid = 30[3] , 20[4] , 22[5] , 11[6] } we have 7 elements 0 to 6 so mid = 3
        int n2=high-mid; // [ 6-3 = 3 ]
        int larr[]=new int[n1];
        int rarr[]=new int[n2]; 
        for(int i=0;i<n1;i++){
            larr[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++){
            rarr[j]=arr[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=low;
        while(i<n1 && j<n2){
            if(larr[i]<rarr[j])
            {
                 arr[k]=larr[i];
                 i++;

            }else{
                arr[k]=rarr[j];
            j++;

            }
            k++;
            
        }
        

        while(i<n1){

            arr[k]=larr[i];
            i++;
            k++;

        }
        while(j<n2){

            arr[k]=rarr[j];
            j++;
            k++;

        }
    }
    public static void main(String[] args) {
        int arr[]={25,14,13,30,20,22,11};
        Demo d=new Demo();
        System.out.println("Array before Merg sort  : ");
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
        d.MergSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("Array after Merg sort : ");
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
    }
}
/*
 
 */

