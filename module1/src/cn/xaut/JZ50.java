package cn.xaut;

import java.util.HashSet;
import java.util.Set;

public class JZ50 {
    public static void main(String[] args) {
        int[] numbers={2,3,1,0,2,5,3};
        //int num=duplicate(numbers);
        int num=duplicate2(numbers);
        System.out.println(num);
    }
    public static int duplicate (int[] numbers) {
        // write code here
        int n=numbers.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int x=numbers[i];
            arr[x]=arr[x]+1;
            if(arr[x]>1){
                return x;
            }
        }
        return -1;
    }
    public static int duplicate2 (int[] numbers) {
        // write code here
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<numbers.length;i++){
            if(!set.add(numbers[i])){//HashSet中不能存重复元素，若add方法返回flase,即要加入元素重复
                return numbers[i];
            }
        }
        return -1;
    }
}
