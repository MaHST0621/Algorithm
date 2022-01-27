package basick.binarysearch;

/**
 * @description: 两个有序数组获取中位数
 * @author：异想天开的咸鱼
 * @date: 2022/1/27
 */
public class GetKth {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int left = (len + 1) >> 1;
        int right = (len + 2) >> 1;
        if (left != right) {
            return (getKth(nums1,0,nums2,0,left) + getKth(nums1,0,nums2,0,right)) / 2.0;
        }
        return getKth(nums1,0,nums2,0,left);
    }


    public int getKth(int[] nums1,int index_1,int[] nums2,int index_2,int k) {
        //如果某一数组为空的话，就返回另一数组的第k个数
        if (index_1 >= nums1.length) {
            return nums2[index_2 + k - 1];
        }
        if (index_2 >= nums2.length) {
            return nums1[index_1 + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[index_1],nums2[index_2]);
        }
        int mid_1 = index_1 + (k >> 1) - 1 < nums1.length ? nums1[index_1 + (k >> 1) - 1] : Integer.MAX_VALUE;
        int mid_2 = index_2 + (k >> 1) - 1 < nums2.length ? nums2[index_2 + (k >> 1) - 1] : Integer.MAX_VALUE;

        if (mid_1 < mid_2) {
            return getKth(nums1,index_1 + (k >> 1),nums2,index_2,k -= k >>=1);
        }
        return getKth(nums1,index_1,nums2,index_2 + (k >> 1),k -= k >>= 1);
    }

    public static void main(String[] args) {
        GetKth getKth = new GetKth();
        int[] nums1 = new int[]{1,3,4,7};
        int[] nums2 = new int[]{1,4,6};
        getKth.findMedianSortedArrays(nums1, nums2);
    }
}
