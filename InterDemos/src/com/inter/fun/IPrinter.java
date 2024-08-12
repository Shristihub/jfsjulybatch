package com.inter.fun;

public interface IPrinter {
	// no params and no return type
	void printMessage();
}
interface IChecker{
	// has params and has return type
	void checkName(String username);
}
interface ICourse{
	// no params and has return type
	String showCourse();
}

interface IProcess{
	// has params and has return type
	double power(double a);
}
