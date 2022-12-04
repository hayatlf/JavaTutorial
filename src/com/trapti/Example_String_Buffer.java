package com.trapti;

public class Example_String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Trapti");
        sb.append(" Gupta");
        System.out.println(sb);
    }
}

//StringBuffer is same as stringbuilder but the difference is stringbuffer is thread safe and follow synchronization
