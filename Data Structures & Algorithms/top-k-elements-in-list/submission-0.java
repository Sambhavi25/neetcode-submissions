class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0] - b[0]);
        
        for(int i =0;i<nums.length;i++)
        {
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i],1);
            }
            else{
            
            hm.put(nums[i],hm.get(nums[i]) + 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
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

