package com.calci;

public class CalciImplementation implements Calci {

	@Override
	public int add(int a, int b) {
		//this is vishnu imp
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multi(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int div(int a, int b) {

		return a/b;
	}
	
	public int mod(int a,int b) {
		return a%b;
	}
	
	public int add(int a,int b, int c)
	{
		return a+b+c;
	}

}
