public class Hanoi{

    public static void main(String[] args) {

        int n = 6;
        move(n, 'a', 'b', 'c');
    }

    public static void move(int n, char a, char b, char c) {
        if (n == 1) {
			//只有一个盘子的时候直接把一个盘子从a柱子移动到c柱子
            System.out.println(n +":"+ a +"->"+ c);
        } else {
            // 1.
            move(n - 1, a, c, b);
            // 2.
            System.out.println(n +":" + a +"->"+ c);
            // 3.
            move(n - 1, b, a, c);
        }
    }
}
