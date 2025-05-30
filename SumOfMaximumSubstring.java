public class SumOfMaximumSubstring 
{
    public int maxsubstring(int arr[])
    {
        int max_so_far=arr[0];
        int cur_max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            cur_max=Math.max(arr[i],arr[i]+cur_max);
            max_so_far=Math.max(cur_max, max_so_far);
        }
        return max_so_far;
    }
    public static void main(String[] args) 
    {
        int arr[]={-2,-5,6,-2,-3,1,5,-6};
        SumOfMaximumSubstring s=new SumOfMaximumSubstring();
        int r=s.maxsubstring(arr);
        System.out.println(r);
    }
}
