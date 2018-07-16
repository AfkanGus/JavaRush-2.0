package com.javarush.task.task37.task3702;

import com.javarush.task.task37.task3702.male.MaleFactory;

/**
 * Created by Taly on 16.07.2018.
 */
public class Solution {
	public static void main(String[] args) {
		MaleFactory factory = new MaleFactory();
		System.out.println(factory.getPerson(99));
		System.out.println(factory.getPerson(4));
		System.out.println(factory.getPerson(15));

	}
}
