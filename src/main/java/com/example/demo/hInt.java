 package com.example.demo;

import java.util.Arrays;

public class hInt {

	
	//Merging Logic:
		//Compare elements from two sorted halves.
		//Insert the smaller element into a temporary array (temp[]).
		//Copy the remaining elements from either half (if any).
		//Copy the sorted elements back to the original array.
	
	public static void main(String[] args) {
		int[] nums = { 5, 2, 3, 1 };

		int[] mergeSort = mergeSort(nums);
		System.out.println("mergeSort : -" + Arrays.toString(mergeSort));
		System.out.println(sortArray(nums));
	}

	private static int[] mergeSort(int[] nums) {

		mergeRecusive(nums, 0, nums.length - 1);

		return nums;
	}

	private static void mergeRecusive(int[] nums, int left, int right) {
		if (left >= right) {
			return;   // Base condition: Stop when a single element remains
		}
		int mid = left + (right - left) / 2; // Find the middle index
		mergeRecusive(nums, left, mid); // Sort left half
		mergeRecusive(nums, mid + 1, right);// Sort right half
		mergeSorted(nums, left, mid, right);// Merge sorted halves

	}

	private static void mergeSorted(int[] nums, int left, int mid, int right) {
		int[] temp = new int[right - left + 1]; // Temporary array for merging
		int i = left, j = mid + 1, k = 0;
		// Compare elements from both halves and insert the smaller one into temp[]
		while (i <= mid && j <= right) {
			if (nums[i] <= nums[j]) {
				temp[k++] = nums[i++];
			} else {
				temp[k++] = nums[j++];
			}
		}
		 // Copy remaining elements from left half (if any)
		while (i <= mid) {
			temp[k++] = nums[i++];
		}
		 // Copy remaining elements from right half (if any)
		while (j <= right) {
			temp[k++] = nums[j++];
		}
		 // Copy sorted elements back into the original array
		System.arraycopy(temp, 0, nums, left, temp.length);
	}

//bubble short {1,2,3,5)
	private static String sortArray(int[] nums) {
		boolean swapped;

		for (int i = 0; i < nums.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = temp;
					swapped = true;
				}

			}
			if (swapped == false) {
				break;
			}

		}
		return Arrays.toString(nums);

	}
}


//hexaware 
//sega parttern 
//pojo class annotation 
//entity class annotation 
//jpa vs curd opertion
// main and native qreay
//how to map in pojo class 
//spring boot left cycle
//@primary vs @qualifier
//stregey desing pattern
//globaland coustom exception
//resttemplate vs feign client
//