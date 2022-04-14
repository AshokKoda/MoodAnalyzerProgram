package com.bridgelabz.moodanalyzerexceptions;

import org.junit.Assert;
import org.junit.Test;

//UC2 - Handle Exceptions
public class MoodAnalyzerWithExceptionTest {

	@Test
	public void userProvidesInvalidMood() throws MoodAnalyzerExceptions { // UC2
		MoodAnalyzerWithException moodAnalyzer = new MoodAnalyzerWithException(null);
		String result = moodAnalyzer.analyseMood();
		System.out.println("Iam in " + result + " mood.");
		Assert.assertEquals("Invalid", result);
	}
}
