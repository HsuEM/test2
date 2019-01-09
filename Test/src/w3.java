import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class w3 {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//不死母蜂一年生一隻公蜂，每隻公蜂一年生一隻普通的母蜂和一個公蜂後就死掉，
		//普通的母蜂一年生一隻公蜂後死掉。現在在一個只有一隻不死母蜂的實驗環境下，
		//Input N年，Output 公蜂有幾隻、總共有幾隻蜜蜂
		calBee(2);

	}
	private static void calBee(int n) {
		// TODO Auto-generated method stub
		int totalMale=0;
		int totalFemale=0;
		for(int i = 0; i < n;i++) {
			int male = fib(n-i);
			int female = fib(n-1-i);
			totalMale += male;
			totalFemale += female;
		}
		System.out.println("公蜂有" + totalMale +"隻");
		System.out.println("蜜蜂總共有" + (totalMale+totalFemale+1) +"隻");
	}

	private static int fib(int i) {
		// TODO Auto-generated method stub
		if(i == 0 || i ==1) {
			return i;
		}else {
			return fib(i-2)+fib(i-1);
		}
	}
	

}
