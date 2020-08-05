package com.thinkful.receipt_printer;

public class ReceiptPrinter {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        String dashes = "------------------";


        sb.append("Bill");
        sb.append(dashes);
        sb.append(dashes);
        sb.append(dashes);

        System.out.println(sb);
    }
}