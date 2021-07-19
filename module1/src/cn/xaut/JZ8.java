package cn.xaut;

import java.util.ArrayList;
import java.util.List;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class JZ8 {
    public static void main(String[] args) {
        System.out.println(jumpFloor1(7));
    }
    public static int jumpFloor(int target) {
        if(target==0) return 0;
        if(target==1) return 1;
        if(target==2) return 2;
        if(target==3) return 3;
        return jumpFloor(target-1)+jumpFloor(target-2);
    }
    public static int jumpFloor1(int target) {
        List<Integer> list=new ArrayList<>();
        list.add(0);//0
        list.add(1);//1
        list.add(2);//2
        list.add(3);//3
        for (int i=4; i<=target; i++) {
            list.add(list.get(i-1)+list.get(i-2));
        }
        return list.get(target);
    }
}
