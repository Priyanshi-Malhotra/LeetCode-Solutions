class Solution {
    public int removeDuplicates(int[] nums) {
     HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            if(!(h.containsKey(nums[i])))
                h.put(nums[i],1);
            else
                h.put(nums[i],h.get(nums[i])+1);
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            int k=0,val=nums[j];
            if(h.containsKey(nums[j]))
            {
               while(k<2 && h.get(nums[j])>0)
               {
                   nums[i++]=val;
                   h.put(val,h.get(val)-1);
                   k++;
               }
                h.remove(val);
            }
        }
        return i;
    }
}
