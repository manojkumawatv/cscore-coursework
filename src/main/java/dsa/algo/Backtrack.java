package dsa.algo;
import java.util.ArrayList;
import java.util.List;

public class Backtrack {
    private static int k;
    public Backtrack(){
        k=1;
    }
    public List<List<Integer>> powerSet(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        powerSetHelper(arr, 0, new ArrayList<>(), result);
        return result;
    }
    public void getPermutation(int[] nums, List<Integer> curr){
        if(curr.size()==nums.length) {
            System.out.println((k++)+": "+curr+", "); // k for unit testing at last; k=n!
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!curr.contains(nums[i])) {
                curr.add(nums[i]);
                getPermutation(nums, curr);
                curr.remove(curr.size()-1);
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
