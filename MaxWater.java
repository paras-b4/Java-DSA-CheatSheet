public class MaxWater 
{
    public int water(int arr[])
    {
        int left=0;
        int right =arr.length-1;
        int maxarea=0;

        while (left<right) 
        {
            int area = Math.min(arr[left], arr[right]) *(right-left);
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
        MaxWater m=new MaxWater();
        int r=m.water(arr);
        System.out.println(r);
    }

}
