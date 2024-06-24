class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        for(int i = 0 ; i < n ; i++)
            a[i + m] = b[i];
        Arrays.sort(a);
    }
}