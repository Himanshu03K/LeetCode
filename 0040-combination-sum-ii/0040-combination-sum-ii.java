class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        Arrays.sort(arr);
        Combination(list, arr, target, new ArrayList<Integer>(), 0);
        return list;
    }


/* Combination_Sum_II */


	public static void Combination(List<List<Integer>> list,int[] arr, int target, List<Integer> ans, int idx) {
		if (target == 0) {
			list.add(new ArrayList<>(ans));
			return;
		}

		for (int i = idx; i < arr.length; i++) {
			if (i != idx && arr[i] == arr[i - 1]) {
				continue;
			}

			if (target >= arr[i]) {
                ans.add(arr[i]);
				Combination(list,arr, target - arr[i],ans , i + 1);
                ans.remove(ans.size() - 1);
			}

		}
	}

}