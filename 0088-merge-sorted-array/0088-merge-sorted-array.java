class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a[]=new int[m+n];
        for(int i=0;i<m;i++){
            a[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            a[m+i]=nums2[i];
        }
        Arrays.sort(a);
        for(int i=0;i<(m+n);i++){
            nums1[i]=a[i];
        }
    }
}