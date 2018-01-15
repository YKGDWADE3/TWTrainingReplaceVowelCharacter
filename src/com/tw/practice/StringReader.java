package com.tw.practice;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReader {
    private Scanner mScanner = new Scanner(System.in);
    private final String STRING_RULE = "[a-z]*$";

    public String read() throws Exception{
        String string = mScanner.next();
        Pattern pattern = Pattern.compile(STRING_RULE);
        Matcher matcher = pattern.matcher(string);
        if (matcher.matches()){
            return string;
        }
        throw new Exception(string);
    }
}
