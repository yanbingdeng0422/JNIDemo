package com.yanbing.hello_jni;

public class Jni
{

	public native String stringFromJNI();
        public static final native String helloFromJNI();

	static {
		System.loadLibrary("hello-jni");
	
	}
	
    	public static void main(String[] args) {
	    	// TODO Auto-generated method stub
		new Jni().stringFromJNI();
	}
}
