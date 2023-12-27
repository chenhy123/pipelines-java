package com.microsoft.demo;

public class Demo {
    public void DoSomething(boolean flag){
		// test
        System.out.println("Starting...");
        
        if(flag){
            System.out.println("I am covered");
            return;
        }

        System.out.println("I am not covered");
    }
}
