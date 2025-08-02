package dsa.algo;
import java.util.ArrayList;
import java.util.List;

public class Backtrack {
    private static int count;
    public Backtrack(){
        count=1;
    }
    public List<List<Integer>> powerSet(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        powerSetHelper(arr, 0, new ArrayList<>(), result);
        return result;
    }
    // get set of k-Permutations of n nums
    public void getPermutation(int[] nums, List<Integer> curr, boolean[] used, int k){ 
        if(curr.size()==k) {
            System.out.println((count++)+": "+curr+", "); // k for unit testing at last; k=nPr
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!used[i]) {
                curr.add(nums[i]);
                used[i]=true;
                getPermutation(nums, curr, used, k);
                curr.remove(curr.size()-1); used[i]=false;
            }
        }
    }

    private void powerSetHelper(int[] arr, int i, List<Integer> current, List<List<Integer>> result) {
        if (i == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        // Exclude arr[i]
        powerSetHelper(arr, i + 1, current, result);

        // Include arr[i]
        current.add(arr[i]);
        powerSetHelper(arr, i + 1, current, result);
        current.remove(current.size() - 1); //pruning
    }
}
