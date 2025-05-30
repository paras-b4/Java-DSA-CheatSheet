import java.util.*;

public class ThreeSum {
    
    List<List<Integer>> threesum(int arr[])
    {
        if (arr.length<3 || arr.length==0) 
        {
            return new ArrayList<>();
        }
        Arrays.sort(arr);
        Set<List<Integer>> result=new HashSet<>();
        {
            for(int i=0;i<arr.length-2;i++)
            {
                int left=i+1;
                int right =arr.length-1;
                while (left<right) 
                {
                    int sum=arr[i]+arr[left]+arr[right];
                    if (sum==0) 
                    {
                        result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                        left++;
                        right--;
                    }
                    else if (sum<0) 
                    {
                        left++;
                        
                    }
                    else{
                        right--;
                    }
                }
            }       

        }
        return new ArrayList<>(result);


    }
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        ThreeSum t=new ThreeSum();
        List<List<Integer>> list=t.threesum(arr);
        for(List<Integer> i: list)
        {
            for(Integer i1:i)
            {
                System.out.print(i1+" ");
            }
            System.out.println();

        }
    }
}
