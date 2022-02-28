package 투포인터;



	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.Arrays;
	import java.util.StringTokenizer;

	public class 용액 {
		static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		public static void main(String[] args) throws IOException {

			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int []arr = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);

			
			
			int left = 0; 
			int right = n-1; 
			int min = 2100000000;
			int arr_left = 0; 
			int arr_right = n-1;
			
			// 이진 탐색
			while(left<=right)
			{
				int val = arr[right] + arr[left];
				if(left != right && Math.abs(arr[right] + arr[left])< min)
				{
					arr_left= left;
					arr_right = right;
					min = Math.abs(val);
				}
				if(val >= 0)
				{
					right--;
				}
				else
				{
					left++;
				}
			}
			System.out.println(arr[arr_left] + " " + arr[arr_right]);
		}

	}