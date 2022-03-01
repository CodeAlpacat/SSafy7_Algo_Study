package 투포인터;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;



	public class 고냥이 {

	    static int N ;
	    static int max_length = -1;
	    static int[] visit;
	    static String s;


	//고양아 이러지마
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        N = Integer.parseInt(br.readLine());
	        visit = new int[27];  //알파벳 사용한거 체크
	        s = br.readLine();
	        int count = 0;  //사용된 알파벳 개수 체크
	        int R = -1;
	        for(int L = 0 ; L<s.length();L++){  //처음 원소부터 체크
	            while (R+1 <s.length() && count <=N){  //다음볼게 범위 안에있고 사용가능한 여유가 있을떄
	               R++;
	               visit[s.charAt(R) - 96]++;   //해당 알파벳 수 증가
	                if(visit[s.charAt(R) - 96] == 1){
	                    count++;    //만약 처음 사용된 알파벳이면 증가
	                }
	            }   //최대 개수까지 체크 끝나면

	            if(count > N ) {
	                count--;
	                visit[s.charAt(R) - 96]--;
	                R--;        //종료조건이면 되돌리고 STOP
	            }

	            max_length = Math.max(max_length , R-L+1);   //최대 길이 갱신

	            visit[s.charAt(L) - 96]--;  //다음 체크를 위해 맨앞제거

	            if(visit[s.charAt(L) - 96] == 0){   //알파벳 아닐시 제거
	                count--;
	            }

	        }
	        System.out.println(max_length);
	    }
	}