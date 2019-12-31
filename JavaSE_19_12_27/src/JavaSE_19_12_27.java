/*
* 1、递归求 N 的阶乘
2、递归求 1 + 2 + 3 + ... + 10
3、按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
4、写一个递归方法，输入一个非负整数，返回组成它的数字之和.
5、递归求斐波那契数列的第 N 项
6、递归求解汉诺塔问题
​ 汉诺塔问题是一个经典的问题。汉诺塔（Hanoi Tower）,
* 又称河内塔，源于印度一个古老传说。 大梵天创造世界的时候做了三根金刚石柱子，
* 在一根柱子上从下往上按照大小顺序摞着64片黄金圆盘。
* 大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上。
* 并且规定，任何时候，在小圆盘上都不能放大圆盘，且在三根柱子之间一次只能移动一个圆盘。
*  问应该如何操作？
7、递归实现代码: 青蛙跳台阶问题
一只青蛙一次可以跳上 1 级台阶，也可以跳上2 级。
* 求该青蛙跳上一个n 级的台阶总共有多少种跳法
* */
public class JavaSE_19_12_27 {
    public static int step = 0;
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sum(10));
        System.out.println();
        printInt(1234);
        System.out.println();
        System.out.println(sum_int(1729));
        System.out.println();
        System.out.println(fib(10));
        System.out.println();
        hanoi(6,'a','b','c');

    }
     //1、递归求 N 的阶乘
    public static int factorial(int num){
        if(num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
    //2、递归求 1 + 2 + 3 + ... + 10
    public static int sum(int num){
        if(num==1){
            return 1;
        }
        return num+sum(num-1);
    }
    //3、按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
    public static void printInt(int num){
        if (num > 9){
            printInt(num / 10);
        }
        System.out.printf("%d ", num % 10);
    }
    //4、写一个递归方法，输入一个非负整数，返回组成它的数字之和.
    public static int sum_int(int n){
        if(n<10){
            return n;
        }
        return n%10 +sum_int(n/10);
    }
    //5、递归求斐波那契数列的第 N 项
    public static int fib(int n){
        if(n<=2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    //6、递归求解汉诺塔问题
    //分析一下：如果只有一个盘子，则直接移动到c
    //如果有两个盘子，假设从上到下依次编号为1和2
    //此时的做法一共有三个步骤
//    1.把1号从a移动到b
//    2.把2号从a移动到c
//    3.把1号从b移动到c
    //同理，如果有n个盘子
    //则需要把n-1号从a移动到b，再把n号从a移到c，再把n-1号从b移到c
    public static void hanoi(int n, char a, char b, char c) {
        if (n == 1) {
            //只有一个盘子的时候直接把一个盘子从a柱子移动到c柱子
            System.out.println("步骤"+(++step)+"：将"+n +"从"+ a +"->"+ c);
        } else {
            // 1.
            hanoi(n - 1, a, c, b);//n-1从a移动到c
            // 2.
            System.out.println("步骤"+(++step)+"：将"+n +"从" + a +"->"+ c);//把n从a到c
            // 3.
            hanoi(n - 1, b, a, c);//调函数的时候愿意是将n-1从b移动到c
            //但是函数的形参所要表示的意思是从a到c
            //所以此时形参发生位置调换，把形参a的地方写成b，c不变，
            //即表示把从b到c
            // 形参b的位置就可以写a
        }
    }
    //7、青蛙跳台阶问题
    public static int frog(int n){
        int f1 = 1;//如果只有一级则只有一种跳法
        int f2 = 2;//如果有两级就有两种跳法
        //假设n级台阶共有f(n)种跳法
        //第一次如果选择跳一级，那么剩下的n -1级就有f(n-1)次跳法
        //第一次如果跳两级，那么剩下的n-2级就有f(n-2)种跳法
        //于是可以构造递归关系，把n拆分
        if(n == 1)
            return f1;
        if(n == 2)
            return f2;
        return frog(n-1) + frog(n-2);
    }


}
