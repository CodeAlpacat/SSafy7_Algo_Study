package 투포인터;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Arrays;
	import java.util.StringTokenizer;

	public class 두용액 {
		static int n;
		static int[] arr;
		
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st;

			n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			arr = new int[n];
			
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

	        Arrays.sort(arr);
	        
			
			int start = 0;
			int end = n-1;
			int min = Integer.MAX_VALUE;
			int[] ans = new int[2];
			
			//이진 탐색
			while(start < end) {
				int sum = arr[start]+arr[end];
				
				if(min > Math.abs(sum)) {
					min = Math.abs(sum);
					
					ans[0] = arr[start];
					ans[1] = arr[end];
					
					//0이면 제일 작은 수 임으로 종료
					if(sum==0) break;
				}
				
				if(sum < 0) start++;
				else end--;
			}
			
			System.out.print(ans[0]+" "+ans[1]);
			
		}

	}