package array;

public class array_04 {
	public static void main(String[] args) {
		// 理쒕�, 理쒖냼媛� 李�
		int[] nums = {45,9,3,7,16,25};
		int maxnum = Integer.MIN_VALUE;
		int minnum = Integer.MAX_VALUE;
		for (int i=0; i<nums.length; i++) {
			if (nums[i] > maxnum) {
				maxnum = nums[i];
			}
			else if (nums[i] < minnum) {
				minnum = nums[i];
			}
		}
		System.out.println(maxnum);
		System.out.println(minnum);
		
		// 鍮덈룄�닔 援ы븯湲�
		int[] intArr = {3,2,5,7,7,5,4,2,3,5,1,9,2,3,5,7,8,3,4};
		int maxVal = 0;
		for (int i=0; i<intArr.length; i++) {
			if (intArr[i] > maxVal) {
				maxVal = intArr[i];
			}
		}
		int[] cnt = new int[maxVal+1];
		for (int i=0; i<intArr.length; i++) {
			cnt[intArr[i]] = cnt[intArr[i]]+1;
		}
		for (int i = 0; i <= maxVal; i++) {
		    if (cnt[i] >= 0) {
		        System.out.println("�닽�옄 " + i + "�쓽 鍮덈룄�닔: " + cnt[i]);
		    }
		}
	}
}