package com.advanced.exceptions;

public class DivideTowNumberExceptions {

    public static void main(String[] args) throws ZeroDivisorException {
        System.out.println(divide(30,2));
        System.out.println(divide(15,0));
        System.out.println("The job is finished !");

    }

    private static int divide(int dividend, int divisor) throws ZeroDivisorException {
        if(divisor == 0){
            throw new ZeroDivisorException("The divisor can not vbe zero - custom exception");
        }
        try{

            return dividend / divisor;
        }catch (NullPointerException exception){
        System.err.println("NullPointerException is thrown !");
        return 0;

    }    catch (ArithmeticException exception){
        System.err.println("The divisor can not be zero !");
        return 0;

    } finally {
            System.out.println("i am very good tool to close files and database connections");

        }
    }}
