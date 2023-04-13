package com.IBM.mavenproject;

public class Activity5 {

    abstract class Book {
        String title;
        abstract void setTitle(String s);
        String getTitle()
        {
            return title;
        }
    }

    class MyBook extends Book {
        public void setTitle(String s) {
            title = s;
        }

        public void main(String[] args)
        {
                String title="Harry Potter";
                MyBook newNovel = new MyBook();
                newNovel.setTitle(title);
                System.out.println("The title of the book is " + newNovel.getTitle());
        }

    }

}
