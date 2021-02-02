class Solution {
    public int maxArea(int[] arr) {
        int left=0,right=arr.length-1,max=0,temp=0;
        while(left<right)
        {
            temp=Math.min(arr[left],arr[right])*(right-left);
            if(temp>max)
                max=temp;
            if(arr[left]<arr[right])
                left++;
            else
                right--;
        }
        return max;
    }
}
