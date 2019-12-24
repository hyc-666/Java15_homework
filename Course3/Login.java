import java.util.Scanner;//简单的用户登陆界面
public class Login{
	static final String userName = "Tom";//初始化用户名
	static final String password = "mima123";//初始化密码
	public static void main(String[] args){

		login();

			System.out.print("欢迎使用");
	}
	public static void login(){
		Scanner input = new Scanner(System.in);
		int times = 0;//限制密码和用户名的输入次数，3次输入错误则退出
		boolean userNameTrue = false,passwordTrue = false;//用户名和密码正确的标志量
		System.out.print("请输入用户名：");//提示用户输入用户名
		while(times < 3){//错误次数小于3时
			String name =input.nextLine();//输入用户名
			if(userName.equals(name)){//若输入正确
				System.out.println("用户名输入正确！");//提示输入正确
				userNameTrue = true;//用户名标志变量置true
				times = 0;//输入次数置0，此后变为限制密码输入次数
				break;//结束用户名输入
			}
			else{//若输入不正确
				times++;//输入次数自加1
				if(times >= 3)
				    break;
				System.out.printf("输入错误，请重新输入（剩余%d次机会）:",3-times);//再次输入和剩余次数
				userNameTrue = false;//用户名输入正确标志量置false
			}
		}
		if(userNameTrue){//用户名输入正确时
			System.out.print("请输入密码：");//提示输入密码
			while(times < 3){//次数小于3时
				String inputPassword = input.nextLine();//输入密码
				if(inputPassword.equals(password)){//若密码正确
					System.out.println("密码输入正确。");//提示输入正确
					passwordTrue = true;//密码正确标志量置true
			
					break;//结束密码输入
				}
				else{//若密码输入不正确
					times++;//次数自加1
					if(times >= 3)
					    break;
					System.out.printf("输入错误，请重新输入密码（剩余%d次机会）：",3-times);//输入错误，再次输入
					passwordTrue = false;//标志量置false
				}
			}
			if(passwordTrue)//密码正确
			     System.out.print("欢迎使用！");
			else{
			    System.out.println("\n"+"密码输入错误！请退出。");//密码错误3次退出
			
			}
		}
		else{
		    System.out.println("\n"+"用户名输入错误！请退出。");//用户名错误3次退出
		   
		}
	}
}
