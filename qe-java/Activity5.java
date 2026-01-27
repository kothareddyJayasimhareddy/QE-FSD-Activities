package com;

public class Activity5 {
    public static void main(String[] args) {
        MyBook newNovel = new MyBook();
        newNovel.setTitle("Java Book");
        System.out.println("The title is: "+ newNovel.getTitle());
    }
}
abstract class Book{
    String title;
    abstract void setTitle(String str);
    public String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    public void setTitle(String s){
        title = s;
    }
}