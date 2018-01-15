package com.tw.practice;

public class StringProcess {

    private  final String REPLACE = "mommy";

    public String replaceVowel(String string){
        int vowelNumber = 0;
        for (int i = 0; i < string.length(); i++) {
            char temp = string.charAt(i);
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u'){
                vowelNumber++;
            }
        }
        if (vowelNumber * 10 > string.length() * 3){
            boolean beforeVowel = false;//上一个字符是否是元音
            StringBuffer resultBuffer = new StringBuffer();
            for (int i = 0; i < string.length(); i++) {
                char temp = string.charAt(i);
                if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u'){
                    if (!beforeVowel){
                        resultBuffer.append(REPLACE);
                        beforeVowel = true;
                    }
                }else{
                    resultBuffer.append(temp);
                    beforeVowel = false;
                }
            }
            return resultBuffer.toString();

        }else{
            return string;
        }
    }
}
