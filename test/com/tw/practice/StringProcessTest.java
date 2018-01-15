package com.tw.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringProcessTest {

    private StringProcess mStringProcess = new StringProcess();

    @Test
    public void shouldReturnMommyOneVowel() {
        assertEquals("mommy", mStringProcess.replaceVowel("a"));
    }

    @Test
    public void shouldKeepItVowelLess30Per() {
        assertEquals("abbb", mStringProcess.replaceVowel("abbb"));
    }

    @Test
    public void shouldReplaceVowelsInRow() {
        assertEquals("mommyb", mStringProcess.replaceVowel("aaab"));
    }

    @Test
    public void shouldReplaceVowelNotInRow() {
        assertEquals("mommybmommy", mStringProcess.replaceVowel("aba"));
    }



}