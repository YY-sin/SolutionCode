package cn.xaut;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class JZ1 {
    public static void main(String[] args) {
        int target=7;
        int [][] array={
                          {1,2,8,9},
                          {2,4,9,12},
                          {4,7,10,13},
                          {6,8,11,15}
                        };
        boolean falg=Find(target,array);
        System.out.println(falg);
    }
    public static boolean Find(int target, int [][] array) {
        int m = array.length;
        if (m == 0) return false;
        int n = array[0].length;
        if (n == 0) return false;
        if(target>array[m-1][n-1]||target<array[0][0])
            return false;
        int r = m-1, c = 0;
        while(r>=0&&c<n){
            if(target>array[r][c]){
                c++;
            }else if(target<array[r][c]){
                r--;
            }else {
                return true;
            }
        }
        return false;
    }
}
