class Solution {
    public int[] frequencySort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        
        int[] result = new int[nums.length];
        Map<Integer, Integer> numCountMap = new HashMap<>();
        int maxCount = 0;
        
        for (int num : nums) {
            int count = numCountMap.getOrDefault(num, 0);
            count++;
            maxCount = Math.max(maxCount, count);
            numCountMap.put(num, count);
        }
        
        List<Integer>[] bucket = new List[maxCount + 1];
        
        for (Map.Entry<Integer, Integer> entry : numCountMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            
            List<Integer> tempList;
            
            if (bucket[count] == null) {
                tempList = new ArrayList<>();
            } else {
                tempList = bucket[count];
            }
            
            tempList.add(num);
            bucket[count] = tempList;
        }
        
        int p = 0;
        for (int i = 1; i <= bucket.length - 1; i++) {
            List<Integer> list = bucket[i];
            if (list != null) {
                Collections.sort(list, Collections.reverseOrder());
                for (Integer num : list) {
                    int count = i;
                    while(count > 0) {
                        result[p] = num;
                        p++;
                        count--;
                    }
                }
            }
        }
        
        return result;
    }
}