package com.github.coderepositories;

import com.github.coderepositories.jcommons.core.X;

import java.util.Date;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String dateString = X.dateFormat(new Date(), "yyyy-MM-dd");
        System.out.println(dateString);
        System.out.println("Hello World!");
    }
}
