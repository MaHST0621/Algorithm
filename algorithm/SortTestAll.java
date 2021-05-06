package algorithm;


import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Author Mahe
 * @Date 2021/5/3 12:34
 * @Version 1.0
 */
public class SortTestAll {
	private int[] a;
	private int[] result;
	public SortTestAll(int a[]) {
		this.a = a;
		this.result = a;
	}
	//冒泡排序优化版本，每次标记前面无序部分是否有序列变动
	//如果五序列变动说明时无序的不用在排了
	//时间复杂读O(n^1.5)
	public boolean bubble01(int low,int hi) {
		boolean sort = true;
		while (++low < hi ) {
			if (a[low - 1] > a[low]) {
				sort = false;
				int temp = a[low];
				a[low] = a[low - 1];
				a[low - 1] = temp;
			}
		}
		return sort;
	}
	//新加一个变量last来记录最后一次序列更换的位置，让hi=last
	//因为last变量可以保证last后面的序列都是不需要进行排序的
	//复杂度O(n)
	public int bubble02(int lo,int hi) {
		int last = lo;
		while (++lo < hi) {
			if (a[lo - 1] > a[lo]) {
				last = lo;
				int temp = a[lo];
				a[lo] = a[lo - 1];
				a[lo - 1] = temp;
			}
		}
		return last;
	}

	public void mergeSort(int lo, int hi) {
		if (hi - lo < 2) {return;}
		int mi = (hi + lo) >> 1;
		mergeSort(lo,mi);
		mergeSort(mi,hi);
		merge01(lo,hi,mi);
	}

	//归并排序，最坏情况下复杂度也是O(nlogN)
	public void merge01(int lo,int hi,int mi) {
		int rb = mi - lo;
		int[] B = new int[rb];
		for (int i = 0; i < rb;i++) {B[i] = a[i];}
		int lc = hi - mi;
		int[] C = new int[lc];
		for (int i = mi,j = 0; i < hi;i++) {C[j] = a[i];};
		for (int i=0,j=0,k=0; (j < rb) || (k < lc); ) {
			if ((j < rb) && (lc <= k || B[j] <= C[k])) {a[i++] = B[j++];}
			if ((k < lc) && (rb <= j || C[k] <= B[j])) {a[i++] = C[k++];}
		}
	}

	//选择排序，最稳定的排序。
	//数据无论怎么样都是O(n^2)
	public void selectionSort() {
		if (a.length == 0) {return;}
		for (int i = 0; i < a.length; i++) {
			int minIndex = i;
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			int temp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		//
	}

	public void insertSorted() {
		if (a.length == 0) {return;}

		int cur = 0;
		for (int i = 0; i < a.length - 1; i++) {
			cur = a[i+1];
			int preIndex = i;
			while (preIndex >= 0 && cur < a[preIndex]){
				a[preIndex+1] = a[preIndex];
				preIndex--;
			}
			a[preIndex+1] = cur;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int[] b = {14,5,18,91,10};
		int hi = b.length;
		int lo = 0;
		SortTestAll testAll = new SortTestAll(b);
		//while (lo < (hi = testAll.bubble02(lo,hi)));
		//while (!testAll.bubble01(lo,hi--));
		//testAll.mergeSort(0,hi);
		//for (int i = 0; i < b.length; i++) {
			//System.out.println(b[i]);
		//}
		//testAll.selectionSort();
		//testAll.insertSorted();
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,5));
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		list.add(15);
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		list.addLast(20);
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println(list.peekFirst());
	}
}
