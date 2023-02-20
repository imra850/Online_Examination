package oops;

import java.util.*;
import java.util.HashMap;

public class Online_Examination {
	HashMap<String,Integer> data = new HashMap <String,Integer>();
	Scanner sc=new Scanner(System.in);
	void login()
	{
		data.put("Shivani", 20);
		data.put("imran", 21);
		data.put("spurabh", 22);
		data.put("akash", 23);
		data.put("simran", 24);
		System.out.println("Welcome to Oasis Infobyte");
		System.out.println("Enter User ID");
		String UserId=sc.nextLine();
		System.out.println("Enter Password");
		int Password=sc.nextInt();
		
		if(data.containsKey(UserId) && data.get(UserId)==Password)
		{
			System.out.println("Successfully Login");
			menu();
		}
		else
		{
			System.out.println("Invalid login , try again");
			login();
		}
	}
	public void menu()
	{
		System.out.println("Select any one");
		System.out.println("1. Update profile and password");
		System.out.println("2. start the exam");
		System.out.println("3. logout");
		
		System.out.println("Enter any option");
		int op=sc.nextInt();
		
		switch(op)
		{
		case 1:
			data=update();
			menu();
			break;
		case 2:
			writeExam();
			menu();
			break;
		case 3:
			System.exit(0);
			break;
			
			default:
				System.out.println("Invalid option");
			
		}
	}
	public HashMap<String,Integer> update()
	{
		System.out.println("UPDATE PROFILE");
		System.out.println("Enter  UserName");
		Scanner in=new Scanner(System.in);
		String uid=in.nextLine();
		if(data.containsKey(uid)) {
			System.out.println("Enter new password");
			int newpwd=in.nextInt();
			data.remove(uid,newpwd);
		}
		else
		{
			System.out.println("User dosen't exists");
		}
		System.out.println("profile update successfully");
		return data;
	}
	public void writeExam()
	{
		long start=System.currentTimeMillis();
		long end1=start+15*1000;
		long end2=start+30*1000;
		int score1=0,score2=0;
		int cnt1=0,cnt2=0;
		char ans;
		System.out.println("start the exam");
		System.out.println("you have just 15 seconds to aswer each question in section 1");
		System.out.println("you have just 30 seconds to aswer each question in section 2");
		System.out.println("each question in section 1 takes 5 marks for correct answer and "
				+ "-1 mark for wrong answer ");
		System.out.println("each question in section 2 takes 10 marks for correct answer and "
				+ "-1 mark for wrong answer ");
		System.out.println("Best Wishesh for your exam");
		while(System.currentTimeMillis()<end1)
		{
			System.out.println("section 1 ");
			System.out.println("who developed java");
			System.out.println("a.James Gosling \n b.Dennins Rithce \n c. Guido Van Rossum \n d. Bjarnee Stroustrup");
			System.out.println("Enter your answer");
			ans=sc.next().charAt(0);
			if(ans=='a')
			{
				cnt1+=1;
			}
			System.out.println("2. Name the java IDE's");
			System.out.println("a. vsCode \n b.Eclipse & NetBeans \n c. notepad \n d. None ");
			System.out.println("Enter your answer");
			ans=sc.next().charAt(0);
			if(ans=='b')
			{
				cnt1+=1;
			}
			System.out.println("3. What is the reason java stands unique from other language");
			System.out.println("a. Platform Dependent \n b. Platform Independent \n c. Simple and Easy \n d.None");
			System.out.println("Enter your answer");
			ans=sc.next().charAt(0);
			if(ans=='b')
			{
				cnt1+=1;
			}
			System.out.println("4. Correct Syntex for the compilation of a java program");
			System.out.println("a. javac filename.java \b.java filename.java \n c.java filename \n d. java c filename");
			System.out.println("Enter your answer");
			ans=sc.next().charAt(0);
			if(ans=='a')
			{
				cnt1+=1;
			}
			System.out.println("5. Automatic type conversion is possible in which of the possible  cases");
			System.out.println("a.Byte To Int \b. Int To Long \n c.Long To Int \n d. None");
			System.out.println("Enter your answer");
			ans=sc.toString().charAt(0);
			if(ans=='b')
			{
				cnt1+=1;
			}
			break;
		}
		while(System.currentTimeMillis()<end1)
		{
			System.out.println("***Section 2***");
			System.out.println("6. Guess the output");
			System.out.println("public static void main(String args[] \n\t int x=5; \n\t int y=x++ + ++x; \n\t System.out.println('value of y');\n}");
			System.out.println("a.10\n b.11 \n c.12 \n d.13");
			System.out.println("Enter your answer");
			ans=sc.next().charAt(0);
			if(ans=='c')
			{
				score2+=10;
				cnt2+=1;
			}
			else
				score2-=2;
			break;
		}
		System.out.println("You have completed the exam!!");
		score1=cnt1*5-((4-cnt1)*1);
		System.out.println("Number of correct answers in section1 :"+cnt1);
		System.out.println("Number of correct answer in section 2"+cnt2);
		System.out.println("Your Score in section1"+score1);
		System.out.println("Your score in section2"+score2);
		System.out.println("Your total score is "+(score1+score2));
		
	}
	public static void main(String[] args)
	{
		Online_Examination can=new Online_Examination();
		can.login();
	}
}
