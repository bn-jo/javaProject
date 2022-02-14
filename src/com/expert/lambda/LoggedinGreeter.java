package com.expert.lambda;

public class LoggedinGreeter implements Greeter{
    @Override
    public void perform() {
        System.out.println("Welcome back");
    }
}
