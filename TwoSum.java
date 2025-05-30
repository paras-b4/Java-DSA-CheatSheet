import java.util.*;


public class TwoSum {
    List<Integer> twosum(int arr[],int target){

        Map<Integer,Integer> map=new HashMap<>();
        
            for(int i=0;i<arr.length;i++)
            {
                int complement=target - arr[i];
                if (map.containsKey(complement)) 
                {
                    return List.of(map.get(complement),i);
                }
                map.put(arr[i],i);
                
            }
        
        return Collections.emptyList() ;

    }

    public static void main(String[] args) {
        int arr[]={16,4,23,8,15,42,1,2};
        TwoSum t=new TwoSum();
        List<Integer> l=t.twosum(arr, 19);
        for(int i:l)
        {
            System.out.print(i+",");
        }
    }
}

