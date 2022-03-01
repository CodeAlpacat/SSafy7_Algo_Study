package 투포인터;


	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.IOException;
	import java.util.Arrays;
	import java.util.StringTokenizer;

	public class 먹을것인가먹힐것인가 {
	    static int t;
	    static int n, m;
	    static int[] arrN, arrM;
	    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    public static void main(String[] args) throws IOException {

	        //test 개수 입력
	        t = Integer.parseInt(br.readLine());

	        for(int i=0; i<t; i++) {
	            inputTC();
	            outputTC();
	        }
	    }

	    static void inputTC() throws IOException {

	        StringTokenizer st;

	        // n, m  입력
	        st = new StringTokenizer(br.readLine());
	        n = Integer.parseInt(st.nextToken());
	        m = Integer.parseInt(st.nextToken());
	        arrN = new int[n + 1];
	        arrM = new int[m + 1];

	        // N 원소값 입력
	        st = new StringTokenizer(br.readLine());
	        for (int i = 1; i <= n; i++) {
	            arrN[i] = Integer.parseInt(st.nextToken());
	        }

	        // M 원소값 입력
	        st = new StringTokenizer(br.readLine());
	        for (int i = 1; i <= m; i++) {
	            arrM[i] = Integer.parseInt(st.nextToken());
	        }
	    }

	    static void outputTC() {
	        
	        // 정렬
	        Arrays.sort(arrM, 1, m+1);
	        

	        int result = 0;        
	 
	        for(int i=0;i<=n;i++) {
	           result += binarySearch(arrM, 1, m, arrN[i]);
	        }
	        System.out.println(result);
	    }

	    static int binarySearch(int[] arr, int left, int right, int key) {

	        // 이진 탐색
	        int result = left - 1;
	        while (left <= right) {
	            int mid = (left + right) / 2;
	            if (arr[mid] < key) {
	                result = mid;
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return result;
	    }
	}