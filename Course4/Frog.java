class Frog{
    public static void main(String[] args) {
        System.out.println(frog(5));

    }
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
