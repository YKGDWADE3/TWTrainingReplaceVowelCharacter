package com.tw.practice;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class StringReaderTest {
    private StringReader mReader = new StringReader();

    private void setInputStream(String input) throws NoSuchFieldException, IllegalAccessException {
        Field scannerField = mReader.getClass().getDeclaredField("mScanner");
        scannerField.setAccessible(true);
        Scanner scannerWithMockedStream = new Scanner(new ByteArrayInputStream(input.getBytes()));
        scannerField.set(mReader, scannerWithMockedStream);
    }

    @Test
    public void shouldReadString() throws Exception{
        setInputStream("abcd");
        assertEquals("abcd", mReader.read());
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionForNonLetterInput() throws Exception{
        setInputStream("abc123");
        mReader.read();
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionForUpperLetterInput() throws Exception{
        setInputStream("abcBC");
        mReader.read();
    }


}