class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int size=nums1.length+nums2.length;
        int[] arr=new int[size];
        size=0;
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                arr[size]=nums1[i];
                i++;
                size++;
            }
            else
            {
               arr[size]=nums2[j];
                j++;
                size++; 
            }
        }
        if(i==nums1.length)
        {
            while(j<nums2.length)
            {
              arr[size]=nums2[j];
                j++;
                size++;  
            }
        }
        if(j==nums2.length)
        {
            while(i<nums1.length)
            {
                arr[size]=nums1[i];
                i++;
                size++;
            }
        }
        double median=0,first=0,second=0;
        if(size%2==0)
        {
            first=arr[size/2];
            second=arr[(size/2)-1];
            median=(first+second)/2;
        }
        else
            median=arr[size/2];
        return median;
    }
}
