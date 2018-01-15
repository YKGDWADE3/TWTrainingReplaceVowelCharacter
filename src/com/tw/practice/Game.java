package com.tw.practice;

public class Game {
    private StringReader mStringReader;
    private Printer mPrinter;
    private StringProcess mStringProcess;
    private boolean over = false;

    public Game(StringReader stringReader, Printer printer, StringProcess stringProcess) {
        mStringReader = stringReader;
        mPrinter = printer;
        mStringProcess = stringProcess;
    }




    public void start(){
        while (!over){
            mPrinter.print("please input a string: ");
            try {
                mPrinter.print(mStringProcess.replaceVowel(mStringReader.read()));
            } catch (Exception e) {
                mPrinter.print(e.getMessage());
            }
        }
    }
}
