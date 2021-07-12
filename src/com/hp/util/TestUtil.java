package com.hp.util;

public class TestUtil {
    public static void welcome() {
        System.out.println("****************");
        System.out.println("先生/女士");
        System.out.println("欢迎欢迎ATM取款机");
        System.out.println("****************");
    }
    public static void oneLeveOption() {
        System.out.println("***********************************");
        System.out.println("***********请输入你想要的操作类型******");
        System.out.println("***********1.余额查询  2.取款********");
        System.out.println("***********3.转账     4.存款*********");
        System.out.println("***********5.退卡             ******");
        System.out.println("***********************************");
    }

    public static void towLeveOption() {
        System.out.println("***********************************");
        System.out.println("***********请输入你想取款的数目：******");
        System.out.println("***********1.100      2.200********");
        System.out.println("***********3.300     4.500******");
        System.out.println("***********5.800     6.1000******");
        System.out.println("***********7.2000     8.其他******");
        System.out.println("***********************************");
    }
    public static void threeLeveOption() {
        System.out.println("***********************************");
        System.out.println("***********请输入你想存款的数目：******");
        System.out.println("***********1.500      2.1000********");
        System.out.println("***********3.1500     4.其他******");
        System.out.println("***********************************");
    }
}
