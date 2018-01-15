package com.tw.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void shouldReadString() throws Exception{
        setpInput("abc");
        assertEquals("abc", readInput);
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionForNonCharacterInput() {
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionForNonLowerInput() {
    }

    @Test
    public void ReturnMommyOneVowel(){
        assertTrue(processResult(input).equals("mommy"));
    }

    @Test
    public void KeepItVowelsLess30Per() {
        assertEquals("abbb",processResult("abbb"));
    }

    @Test
    public void ReplaceVowelsInRow() {
        assertEquals("mommyb", processResult("aaab"));
    }

    @Test
    public void ReplaceVowelNotInRow() {
        assertEquals("mommybmommy", processResult("aba"));
    }
}