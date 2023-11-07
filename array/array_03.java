package array;

import java.util.Arrays;

public class array_03 {
	public static void main(String[] args) {
		// 諛곗뿴�쓽 蹂듭궗
		int[] nums = {45,9,3,7,16,25};
		
		// �쟾�넻�쟻�씤 諛⑸쾿
		int[] tmp = new int[nums.length*2];
		for (int i=0; i<nums.length; i++) {
			tmp[i] = nums[i];
		}
		System.out.println(Arrays.toString(tmp));
		
		// Arrays.copyOf(�썝蹂몃같�뿴, 蹂듭궗�븷 諛곗뿴�겕湲�)
		int[] tmp2 = Arrays.copyOf(nums, nums.length*2);
		System.out.println(Arrays.toString(tmp2));
		
		// System.arraycopy(�썝蹂� 諛곗뿴, �떆�옉�젏, 蹂듭궗�븷 諛곗뿴, 蹂듭궗 諛곗뿴 �떆�옉�젏, �겕湲�)
		int[] tmp3 = new int[nums.length*2];
		System.arraycopy(nums, 0, tmp3, 0, nums.length);
		System.out.println(Arrays.toString(tmp3));
	}
}