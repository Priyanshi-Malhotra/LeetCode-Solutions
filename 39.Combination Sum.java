class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lst=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<Integer>();
        sum(0,lst,list,candidates,target);
        return lst;
    }
    public void sum(int index,List<List<Integer>> lst,List<Integer> list,int[] candidates,int target)
    {
        if(target<0)
            return;
        else if(target==0)
        {
            List<Integer> listt=new ArrayList(list);
            lst.add(listt);
            return;
        }
        for(int i=index;i<candidates.length;i++)
        {
            list.add(candidates[i]);
            sum(i,lst,list,candidates,target-candidates[i]);
            list.remove(list.size()-1);
        }
    }
}
