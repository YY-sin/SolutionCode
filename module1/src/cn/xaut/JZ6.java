package cn.xaut;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class JZ6 {
    public static void main(String[] args) {
        int[] array={3,4,5,6,2};
        System.out.println(minNumberInRotateArray(array));
    }
    public static int minNumberInRotateArray(int [] array) {
        if(array.length==0) return 0;
        for(int i=0;i<array.length-1;i++){
            if(array[i+1]<array[i]){
                return array[i+1];
            }
        }
        return array[0];
    }
}
