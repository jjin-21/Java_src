package array;

public class array_08 {
	public static void main(String[] args) {
		int[][] grid = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15}
		};
		int cnt = 0;
		int res = 0;
		for (int i=0; i < grid.length; i++) {
			for (int j=0; j < grid[i].length; j++) {
				if (grid[i][j] % 3 == 0) {
					cnt++;
					res += grid[i][j];
				}
			}
		}
		System.out.println(cnt);
		System.out.println(res);
	}

}
