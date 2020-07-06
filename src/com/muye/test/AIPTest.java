package com.muye.test;

/**
 * 计算定投收益的测试程序，没什么用
 */
public class AIPTest {
    public static double syl = 0.15;
    public static int dt = 10000;
    public static int yearLimit = 40;

    public static void main(String[] args) {
        computeM(0,0);
    }

    public static void computeM(int m, int year ) {
        m += dt;
        m *= (1 + syl);
        year++;
        System.out.println("定投第" + year + "年，年底总金额为" + m);
        if (year < yearLimit){
            computeM(m, year);
        }else {
            System.out.println("END");
        }
    }
}
