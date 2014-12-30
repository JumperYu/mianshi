package com.yu._1;

/**
 * 冒泡
 * 
 * @author zengxm 2014年12月30日
 * 
 */
public class Bubble {

	public static void main(String[] args) {
		Bubble sort = new Bubble();
		int[] arr = new int[] { 3, 22, 11, 5, 400, 99, 20, 22, 5 };
		sort.sort(arr);
		for (int i : arr) {
			System.out.print(i + ",");
		}
	}

	public void sort(int[] targetArr) {// 小到大的排序

		for (int i = 0; i < targetArr.length; i++) {
			for (int j = i; j < targetArr.length; j++) {

				if (targetArr[i] > targetArr[j]) {

					// 方法一：
					/*
					 * int temp = targetArr[i]; targetArr[i] = targetArr[j];
					 * targetArr[j] = temp;
					 */

					// 方法二:
					targetArr[i] = targetArr[i] + targetArr[j];
					targetArr[j] = targetArr[i] - targetArr[j];
					targetArr[i] = targetArr[i] - targetArr[j];

				}

			}
		}
	}
}
