import java.util.Scanner;//�򵥵��û���½����
public class Login{
	static final String userName = "Tom";//��ʼ���û���
	static final String password = "mima123";//��ʼ������
	public static void main(String[] args){

		login();

			System.out.print("��ӭʹ��");
	}
	public static void login(){
		Scanner input = new Scanner(System.in);
		int times = 0;//����������û��������������3������������˳�
		boolean userNameTrue = false,passwordTrue = false;//�û�����������ȷ�ı�־��
		System.out.print("�������û�����");//��ʾ�û������û���
		while(times < 3){//�������С��3ʱ
			String name =input.nextLine();//�����û���
			if(userName.equals(name)){//��������ȷ
				System.out.println("�û���������ȷ��");//��ʾ������ȷ
				userNameTrue = true;//�û�����־������true
				times = 0;//���������0���˺��Ϊ���������������
				break;//�����û�������
			}
			else{//�����벻��ȷ
				times++;//��������Լ�1
				if(times >= 3)
				    break;
				System.out.printf("����������������루ʣ��%d�λ��ᣩ:",3-times);//�ٴ������ʣ�����
				userNameTrue = false;//�û���������ȷ��־����false
			}
		}
		if(userNameTrue){//�û���������ȷʱ
			System.out.print("���������룺");//��ʾ��������
			while(times < 3){//����С��3ʱ
				String inputPassword = input.nextLine();//��������
				if(inputPassword.equals(password)){//��������ȷ
					System.out.println("����������ȷ��");//��ʾ������ȷ
					passwordTrue = true;//������ȷ��־����true
			
					break;//������������
				}
				else{//���������벻��ȷ
					times++;//�����Լ�1
					if(times >= 3)
					    break;
					System.out.printf("��������������������루ʣ��%d�λ��ᣩ��",3-times);//��������ٴ�����
					passwordTrue = false;//��־����false
				}
			}
			if(passwordTrue)//������ȷ
			     System.out.print("��ӭʹ�ã�");
			else{
			    System.out.println("\n"+"��������������˳���");//�������3���˳�
			
			}
		}
		else{
		    System.out.println("\n"+"�û�������������˳���");//�û�������3���˳�
		   
		}
	}
}
