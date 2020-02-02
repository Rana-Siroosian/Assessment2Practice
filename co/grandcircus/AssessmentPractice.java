package co.grandcircus;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AssessmentPractice {
	
	
	public static boolean takeItAway(Map<String,String> map, String key) {
		boolean containedKey = map.containsKey(key);
		map.remove(key);
		return containedKey;
	}
	
	public static Map<Integer,String>espanol () {
		Map <Integer,String> word = new HashMap<>();
		word.put(1, "Uno");
		word.put(2, "Dos");
		word.put(3, "Tres");
		
		return word;
	}
	
	public static int lift(List<String> words){
		
		for (int i=0; i<words.size(); i++) {
			String newWord = words.get(i).toUpperCase();
			words.remove(i);
			words.add(i,newWord);
		}
		return words.size();
	}
	
	public static Set<String> listToSet(List<String> str) {
	
		Set<String> str1 = new LinkedHashSet<>();
		for (int i = 0; i<str.size();i++) {
			str1.add(str.get(i));
			
		}
		return str1;
	}
	
	public static int howFarApart(List<String> str, String str1, String str2) {
		int index1 = 0;
		int index2 = 0;
		int difference = 0;
		boolean flag =false;
		try {
			if(!str.contains(str1) && str.contains(str2)) {
				throw new IllegalArgumentException();
			}
			if (str.contains(str1) && !str.contains(str2)) {
				throw new IllegalArgumentException();

			}
			if (str.contains(str1)&& str.contains(str2)) {
				index1 = str.indexOf(str1);
				index2=str.indexOf(str2);
				difference = index2-index1;
			}
		}catch(Exception IllegalArgumentException) {

			throw IllegalArgumentException;
			}
		return difference;
		}
	
	public static Set<Integer> neverTellMeTheOdds(int [] num) {
		Set<Integer> newList = new HashSet<Integer>();
		for (int i=0; i<num.length;i++) {
			if (num[i]%2==0) {
			
				newList.add(num[i]);
		}
		}
		return newList;
	}
	public static double makeADifference (double[] thing, int index1, int index2) {
		int len = thing.length;
		double sub=0;
		try {
			if( (index1>=0 && index1<len)&&(index2>=0 && index2<len)) {
			
				 sub = thing[index1] - thing[index2];
			}
		}catch(Exception e) {
			throw e;
			
		}
		return sub;
	}
	
	public static int fleeZero(int [] nums) {
		int[] numbers = nums;
		int numPositive=0;
		int copy = 0;
		for (int i=0; i <nums.length; i++) {
			if (nums[i]>0) {
				numbers[i] = nums[i]+1;
				numPositive+=1;
			}
			else if(nums[i]<0) {
				numbers[i]= nums[i]-1;
			}	
		}
		 
		return numPositive;
		
		
	}
}

