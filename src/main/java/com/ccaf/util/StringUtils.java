package com.ccaf.util;

/**
 * @author newtouch
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils{

    private static String[] num = {"零","一","二","三","四","五","六","七","八","九","十"};

    private static String[] unit = {"","十","百","千","万","十","百","千","亿"};

    private static String[] result;

    public static String transfer(String input) {
        String out = "";
        result = new String[input.length()];
        int length = result.length;
        for(int i = 0; i< length; i++) {
            result[i] = String.valueOf(input.charAt(i));
        }
        for(int i = 0; i< length; i++) {
            int back;
            if(!result[i].equals("0")) {
                back = length - i - 1;
                out += num[Integer.parseInt(result[i])];
                out += unit[back];
            } else {
                //最后一位不考虑
                if(i == (length - 1)) {
                    if(length > 4 && result[length - 1].equals("0") && result[length - 2].equals("0") && result[length - 3].equals("0") && result[length - 4].equals("0")){
                        out += unit[4];
                    }
                } else {
                    //九位数，千万，百万，十万，万位都为0，则不加“万”
                    if(length == 9 && result[1].equals("0") && result[2].equals("0") && result[3].equals("0") && result[4].equals("0")) {

                    } else {
                        //大于万位，连着的两个数不为0，万位等于0则加上“万”
                        if(length > 4 && !result[i+1].equals("0") && result[length -5].equals("0")){
                            out += unit[4];
                        }
                    }
                    //万位之后的零显示
                    if(i == length -4 && !result[i+1].equals("0")) {
                        out += num[0];
                    }
                }
            }
        }
        return out;
    }


}
