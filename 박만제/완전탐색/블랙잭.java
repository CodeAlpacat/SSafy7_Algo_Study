package 완전탐색;


import java.util.Scanner;
	
	
	
public class 블랙잭 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] arr = new int[N];
			int sum = 0;
			int black = 0;
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
				
			}
			for(int i=0; i<N; i++) {
				for(int j=i+1; j<N; j++) {
					for(int k=j+1; k<N; k++) {
						sum = arr[i] + arr[j] + arr[k];
						
						if(black<sum && sum<=M)
							black = sum;
						}
					
				}
			}
			System.out.println(black);
		}
	}

