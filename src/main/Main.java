package main;

import java.util.ArrayList;

/**
 * A program that can find primes in a certain range.
 * Made for a Project-Euler challenge, but can be used
 * in other ways as well.
 * 
 * @author Staven
 */
public class Main 
{

	static ArrayList<Integer> primeList = new ArrayList<Integer>();
	
	public static void main(String[] args) 
	{
		addPrimesInRangeToList(140000, primeList);
		printList(primeList);
	}
	
	/**
	 * Checks if a given number is a prime
	 * 
	 * @param num The number to check
	 * @return if number is prime
	 */
	public static boolean isPrime(int num) 
	{
		for (int i = 2; 2 * i < num; i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Adds all the primes in a certain range, to a
	 * list
	 * 
	 * @param range The range of the primes to be added
	 * @param list The list for the primes to be added into
	 */
	public static void addPrimesInRangeToList(int range, ArrayList<Integer> list)
	{	
		for (int i = 2; i < range; i++)
		{	
			if (isPrime(i))
			{
				list.add(i);	
			}
		}
	}
	
	
	/**
	 * Prints a list to the console 
	 * (preferably with primes)
	 * 
	 * @param list The list to be printed
	 */
	public static void printList(ArrayList<Integer> list) 
	{
		int index = 0; 
		for (int i = 1; i < list.size(); i++)
		{
			index++;
			
			System.out.println(
					"INDEX " +
					index +
					": " +
					list.get(i));				
		}
	}
}
