import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int d[][] = { { 1, 2, 3, 3 }, { 4, 5, 6, 7 }, { 8, 9, 0, 1 } };
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				if (d[i][j] % 2 == 0) {
					System.out.println(d[i][j]);
				}
			}
		}

		
		int e[][] = new int[3][4];
		for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < e[i].length; j++) {
				e[i][j] = in.nextInt();
			}
		}
		System.out.println();
		for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < e[i].length; j++) {
				System.out.print(e[i][j] + "\t");
			}
			System.out.println();
		}

		
		int a = in.nextInt();
		int b = in.nextInt();
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		
		for (int j = 0, k = 30; j < 5; j++) {
			for (int i = 0; i < 6; i++, k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		
		int N = in.nextInt();
		int f[][] = new int[N][N];
		for (int j = 0; j < N; j++) {
			for (int i = 0; i < N; i++) {
				f[i][j] = (int) (1 + Math.random() * 10.0);
			}
		}
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum = sum + f[i][i];
		}
		System.out.println(sum);
	}

}
