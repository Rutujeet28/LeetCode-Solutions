class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num : nums1) set1.add(num);

        for(int num : nums2) set2.add(num);

        List<Integer> setRes1 = new ArrayList<>();
        List<Integer> setRes2 = new ArrayList<>();

        for(int num : set1){
            if(!set2.contains(num)){
                setRes1.add(num);
            }
        }

        for(int num : set2){
            if(!set1.contains(num)){
                setRes2.add(num);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(setRes1);
        result.add(setRes2);

        return result;
    }
}
