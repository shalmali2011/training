package com.company.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringEx {
		
		
		String removeCh(String exa, char ch) {
			String result = exa.replaceAll("a", "");
			return result;
		};
		
		
		String replaceFunc(String str1, char ch1){
			
			char altChar[] = str1.toCharArray();
			char resChar[];
			
			int len = str1.length();
			for(int i=0; i<len; i++) {
				char chAlt = str1.charAt(i);
				if(chAlt==ch1) {
					altChar[i]= '/0';
				}
				else
					altChar[i] = chAlt;
				
				String result = new String(altChar);
				return result;
			}
		};
		
		@Test
		void testCase1() {
			String str = "Mississippi";
			char ch = 's';
			String res = replaceFunc(str, ch);
			Assert.assertEquals(res, "Mi  i  ippi");
		}
		
		@Test
		void testCase2() {
			String str = "Mississippi";
			char ch = 's';
			String res1 = removeCh(str, ch);
			Assert.assertEquals(res1, "Miiippi");
		}
}
