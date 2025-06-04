package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IntBa {
	public static void main(String[] args) {

		// kth smalest element in 2 dimission array
		int[][] arr = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
		int k = 8;
		int result = kthSmallest(arr, k);
		System.out.println(result);

		int result1 = kthSmallestUnsorted(arr, k);
		System.out.println("second approch " +result1);
	}

	private static int kthSmallest(int[][] arr, int k) {
		int n = arr.length;
		int low = arr[0][0], high = arr[n - 1][n - 1];

		while (low < high) {
			int mid = low + (high - low) / 2;
			int count = countLessEqual(arr, mid);
			if (count < k) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return low;
	}

	private static int countLessEqual(int[][] arr, int mid) {
		int n = arr.length;
		int count = 0, row = n - 1, col = 0;
		while (row >= 0 && col < n) {
			if (arr[row][col] <= mid) {
				count += row + 1;
				col++;
			} else {
				row--;
			}
		}

		return count;
	}

//approch second Matrix is Unsorted
	private static int kthSmallestUnsorted(int[][] arr, int k) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for (int[] row : arr) {
			for (int val : row) {
				list.add(val);
			}
		}
		Collections.sort(list);
		return list.get(k-1);
	}

}