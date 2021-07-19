package cn.xaut;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n<= 39
 */
public class JZ7 {
    public static void main(String[] args) {
        System.out.println(Fibonacci1(5));
    }
    /**
     * 斐波那契数列
     * F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
     * @param n
     * @return
     */
    public static int Fibonacci(int n) {
        if(n==0) return 0;
        if (n==1||n==2) return 1;
        else
            return Fibonacci(n-1)+Fibonacci(n-2);
    }
    //方法2
    public static int Fibonacci1(int n) {
        int ans[] = new int[40];
        ans[0] = 0;
        ans[1] = 1;
        for(int i=2;i<=n;i++){
            ans[i] = ans[i-1] + ans[i-2];
        }
        return ans[n];
    }
}
