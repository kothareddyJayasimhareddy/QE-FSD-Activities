package com;

public class Activity8 {
    public static void main(String[] args){
        try{
        Activity8.exceptionTest("hi");
        Activity8.exceptionTest(null);
        } catch(CustomException e){
            System.out.println("Enter valid String: "+e.getMessage());
        }
    }

    public static void exceptionTest(String str) throws CustomException{
        if(str == null){
            throw new CustomException("String Value should not be null");
        }
        else{
            System.out.println(str);
        }
    }
}

class CustomException extends Exception{
    
    private String message;

    public CustomException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return this.message;
    }
}
