package com.rj.designmode.main;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import com.rj.designmode.decorater.input.LowerCaseInputStream;

public class InputTest
{
	public static void main(String[] args)
	{
		int c;
		try
		{
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
			while ((c = in.read())>= 0)
			{	
				System.out.print((char)c);
			}
			in.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
