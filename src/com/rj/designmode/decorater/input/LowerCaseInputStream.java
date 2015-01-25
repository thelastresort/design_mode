package com.rj.designmode.decorater.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream
{

	public LowerCaseInputStream(InputStream arg0)
	{
		super(arg0);
	}

	@Override
	public int read() throws IOException
	{
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}
	
	@Override
	public int read(byte[] arg0, int arg1, int arg2) throws IOException
	{
		int result = super.read(arg0, arg1, arg1);
		for(int i = arg1; i < arg1 + result; i ++)
		{
			arg0[i] = (byte)Character.toLowerCase((char)arg0[i]);
		}
		return result;
	}
}
