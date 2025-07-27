package dsa.ds;
public class SegmentTree {
    int[] tree;
    void buildTree(int[] arr, int idx, int lo, int hi){
        if(lo==hi){
            tree[idx]=arr[lo];
            return;
        }
        int mid= lo + (hi-lo)/2;
        buildTree(arr, 2*idx+1, lo, mid);
        buildTree(arr, 2*idx+2, mid+1, hi);

        tree[idx] = merge(tree[2 * idx + 1], tree[2 * idx + 2]);
    }
    private int merge(int e1, int e2){
        return Math.max(e1, e2);
    }

    // public int querySeg(int idx, int lo, int hi, int i, int j){
    //     if(lo>j || i>hi) return 0; 
        
    //     if(i<=lo && j>=hi){
    //         return tree[idx];
    //     }
    //     int mid= lo + (hi-lo)/2;
    // }
}
