package com.k003.lesson6;

import java.util.Scanner;

public class Book {
    private String bookCode, bookTitle, author, publishingCompany, major;
    private int numberOfPage;
    private Scanner input = new Scanner(System.in);
    public void inBookCode(){
        System.out.print("Enter book code: ");
        bookCode = input.nextLine();
    }
    public void inBookTitle(){
        System.out.print("Enter book title: ");
        bookTitle = input.nextLine();
    }
    public void inAuthor(){
        System.out.print("Enter author: ");
        author = input.nextLine();
    }
    public void inPublishingCompany(){
        System.out.print("Enter publishing company: ");
        publishingCompany = input.nextLine();
    }
    public void inMajor(){
        System.out.print("Enter major: ");
        major = input.nextLine();
    }
    public void  inNumberOfPage(){
        System.out.print("Enter number of pages: ");
        numberOfPage = input.nextInt();
    }
}
