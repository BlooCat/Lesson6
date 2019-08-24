package com.k003.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] it = new Book[100];
        Book[] ls = new Book[100];
        Book[] la = new Book[100];
        while (true) {
            System.out.println("1.Information technology book");
            System.out.println("2.Life-science book");
            System.out.println("3.Literature-art book");
            System.out.println("0.Exit");
            System.out.print("Enter your choise: ");
            int choise, i = 0, j = 0, k = 0;
            Scanner input = new Scanner(System.in);
            choise = input.nextInt();
            switch (choise){
                case 1:
                    it[i] = new Book();
                    it[i].inBookCode();
                    it[i].inBookTitle();
                    it[i].inAuthor();
                    it[i].inPublishingCompany();;
                    it[i].inMajor();
                    it[i].inNumberOfPage();
                    i++;
                    break;
                case 2:
                    ls[j] = new Book();
                    ls[j].inBookCode();
                    ls[j].inBookTitle();
                    ls[j].inAuthor();
                    ls[j].inPublishingCompany();;
                    ls[j].inMajor();
                    ls[j].inNumberOfPage();
                    j++;
                    break;
                case 3:
                    la[k] = new Book();
                    la[k].inBookCode();
                    la[k].inBookTitle();
                    la[k].inAuthor();
                    la[k].inPublishingCompany();;
                    la[k].inMajor();
                    la[k].inNumberOfPage();
                    k++;
                    break;
                case 0:
                    System.out.println("Bye !!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Only enter 0-3: ");
            }
        }
    }
}
