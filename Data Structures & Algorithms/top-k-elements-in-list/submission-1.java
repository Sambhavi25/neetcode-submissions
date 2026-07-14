class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer,Integer> map = new HashMap<>();
    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0] -b[0]);

    for(int i =0;i<nums.length;i++)
    {
        if(map.containsKey(nums[i]))
        {
            map.put(nums[i] , map.get(nums[i]) +1);
        }
        else{
            map.put(nums[i] ,1);
        }
    }

    for(Map.Entry<Integer,Integer> entry : map.entrySet())
    {
      pq.offer(new int[]{entry.getValue(),entry.getKey()});

       if(pq.size() > k)
       {
        pq.poll();
       }
    }

    int [] res = new int[k];
    for(int i =0;i<k;i++)
    {
        res[i] = pq.poll()[1];
    }
    return res;
    }
}
