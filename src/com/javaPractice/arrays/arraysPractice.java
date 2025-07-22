package com.javaPractice.arrays;

import java.util.*;



public class arraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {1,2,3,4,5};
		
		int[] array = {1,2,3,4,5,8,7};
		int[] arrayDuplicates = {1,2,2,3,4,4,5,6,7,7};
		
		int[] sortedArrayOne = {1,3,5,7,9};
		int[] sortedArrayTwo = {2,4,6,8,10};
		
		
		
		System.out.println(Arrays.toString(printOddNumbers(30)));
		
		
		System.out.println("The reverse of the Array is: "+ Arrays.toString(reverseArray(numbers)));
		
		System.out.println("The missing number from array is : " + missingNumber(array,8));
		
		System.out.println("The Duplicates in arrayDuplicates are: "+ findDuplicates(arrayDuplicates));
		
		
		System.out.println("The final array after merge of sortedArray one and two is: " + Arrays.toString(mergeSortedArray(sortedArrayOne, sortedArrayTwo)));
	}
	
	public static int [] printOddNumbers(int n) {
			
			int[] oddNumbers =  new int[20];
			int index=0;	
			for(int i=0;i<n;i++) {
				if(i%2!=0) {
					oddNumbers[index++] = i;
				}
			}
			
			return oddNumbers;
			
			
			
		}
	
	public static int[] reverseArray(int[] array) {
		
		int l=0;
		int r= array.length-1;
		
		while(l<r) {
			
			int temp = array[l];
			array[l]=array[r];
			array[r]=temp;
			
			l++;
			r--;
		}
		
		return array;
		
		
	}
	
	public static int missingNumber(int[] nums,int n ) {
		
		int expectedSum = n*(n+1)/2;
		int actualSum = 0;
		
		for(int i:nums) {
			
			actualSum+=i;
			
		}
		
		return expectedSum - actualSum;
	}
	public static List<Integer> findDuplicates(int[] array){
		
		Set<Integer> seen = new HashSet();
		
		List<Integer> duplicates = new ArrayList();
		
		for(int i:array) {
			
			if(seen.contains(i)) {
				
				duplicates.add(i);
			}
			else {
				seen.add(i);
			}
		}
		return duplicates;
	}
	
	public static int[] mergeSortedArray(int[] arr1, int[] arr2) {
		
		
		int[] mergedArray = new int[arr1.length+arr2.length];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<arr1.length && j<arr2.length) {
			
			if(arr1[i]<arr2[j]) {
				
				mergedArray[k++] = arr1[i++];
			}
			else {
				
				mergedArray[k++] = arr2[j++];
			}
		}
		
		while(i<arr1.length) {
			mergedArray[k++] = arr1[i++];
			
		}
		while(j<arr2.length) {
			mergedArray[k++] = arr2[j++];
		}
		return mergedArray;
	}
	
	
		
		
		

	}


