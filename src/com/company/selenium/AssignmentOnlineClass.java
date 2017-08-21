package com.company.selenium;

public class AssignmentOnlineClass {

	public static void main(String[] args) {
		
		int[] arrayEx = {6, 85, 10, 52, 31};
		
		int sumResult = sumN(5);
		System.out.println(sumResult);
		
		int factResult = factResEx(3);
		System.out.println(factResult);
		
		int minResult = minA(arrayEx);
		System.out.println(minResult);
		
		int maxResult = maxA(arrayEx);
		System.out.println(maxResult);
		
		float avgResult = avgArray(arrayEx);
		System.out.println(avgResult);

	}
	
	
	public static int sumN(int n) {
		
		int sum=0;
		if(n==0) {
			sum = 0;
			return sum;
		}
		else if(n==1) {
			sum = 1;
			return sum;
		}
		else {
			for(int i=1; i<=n; i++) {
				sum = sum + i;
			}
			return sum;
		}
		
	}
	
	static int factResEx(int n) {
		int factRes = 1;
		
		if(n==0 || n==1) {
			factRes = 1;
				
		}
		else {
			
			for(int i=1;i<=n;i++) {
			factRes = factRes * i;
				
			}
				
		}
		return factRes;
		
	}
	
	
	static float avgArray(int[] a) {
		float avgA=0;
		int len = a.length;
		int sum=0;
		
		for(int i=0; i<len; i++) {
			sum=sum+a[i];
		}
		
		avgA=(float)sum/len;
		return avgA;
	}
	
	
	static int minA(int[] a) {
		int minValue=a[0];
		int len=a.length;
		for(int i=1; i<len; i++) {
			if(a[i] < minValue) {
				minValue = a[i];
			}
		}
		return minValue;
	}
	
	
	static int maxA(int[] a) {
		int maxValue=a[0];
		int len = a.length;
		for(int i=1; i<len; i++) {
			if(a[i]>maxValue) {
				maxValue = a[i];
			}
		}
		
		return maxValue;
	}
	
	
}
