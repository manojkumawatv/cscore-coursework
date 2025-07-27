package dsa.algo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Backtrack {
    public List<List<Integer>> powerSet(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        powerSetHelper(arr, 0, new ArrayList<>(), result);
        return result;
    }
    public List<List<Integer>> permute(int[] nums){
        // TODO task
        return Collections.emptyList();
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
