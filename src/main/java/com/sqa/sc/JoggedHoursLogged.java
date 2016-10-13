/**
 * File Name: JoggedHoursLogged.java<br>
 * Chillappagari, Srikanth<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 12, 2016
 */
package com.sqa.sc;

import com.sqa.sc.helpers.*;

/**
 * JoggedHoursLogged //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chillappagari, Srikanth
 * @version 1.0.0
 * @since 1.0
 */
public class JoggedHoursLogged {

	private static double avgJoggedHours;

	private static final int total_days_in_week = 7;

	private static int totalJoggedHours = 0;

	private static String userName;

	public static void main(String[] args) {
		System.out.println(" Welcome to jogging hours logging application");
		userName = RequestInput.getString("What is your name ?");
		for (int i = 1; i <= total_days_in_week; i++) {
			// request amount of hours per day and add it to the
			// totalJoggedHours variable
			totalJoggedHours = totalJoggedHours + RequestInput.getInt("how many hours logged on day " + i);
		}
		avgJoggedHours = totalJoggedHours / 7;
		System.out.println(userName + " average hours jogged" + avgJoggedHours);
		if (avgJoggedHours <= 10) {
			System.out.println(" Amateur jogger ");
		} else if (avgJoggedHours <= 20) {
			System.out.println(" Decicated jogger ");
		} else if (avgJoggedHours <= 30) {
			System.out.println(" Advanced jogger ");
		} else {
			System.out.println(" Premium jogger ");
		}
	}
}
