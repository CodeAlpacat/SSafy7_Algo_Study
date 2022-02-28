package 완전탐색;


import java.util.Scanner;

public class 분해합 {

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();
	        int res = 0;
	        
	        for(int i = 1; i<n; i++) {
	        	int num = i;
	        	int sum = 0;
	        	
	        	while(true) {
	        		sum = sum + (num%10);
	        		num = num / 10;
	        		
	        		if(num == 0) {
	        			break;
	        		}
	        	}
	        	if(n == (sum + i)) {
	        		res = i;
	        		break;
	        	}
	        }
	        System.out.println(res);
	        
	    }
	}

