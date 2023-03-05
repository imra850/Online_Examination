package oops;

import java.util.*;
import java.util.HashMap;

public class Online_Examination {
	
	HashMap<String,Integer> data = new HashMap <String,Integer>();
	Scanner sc=new Scanner(System.in);
	public void login()
	{
		data.put("Shivani", 20);
		data.put("imran", 21);
		data.put("sourabh", 22);
		data.put("Irshad", 23);
		data.put("simran", 24);
		
		System.out.println("**********Welcome to Oasis Infobyte**********");
		System.out.println("Enter User ID");
		String UserId=sc.nextLine();
		System.out.println("Enter Password");
		
		int Password=sc.nextInt();
		
		if(data.containsKey(UserId) && data.get(UserId)==Password)
		{
			System.out.println("*****Successfully Login*****");
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
			int newpwd=sc.nextInt();
			data.replace(uid,newpwd);
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
		System.out.println("Best Wishesh for your exam \n");
		
		while(System.currentTimeMillis()<end1)
		{
			System.out.println("section 1 \n");
			
			System.out.println(" 1)Which component is used to compile, debug and execut the java programs?");
			System.out.println(" a)JRE \n b)JIT \n c)JDK \n D)JVM");
			System.out.println("Enter your answer");
			ans=sc.next().charAt(0);
			if(ans=='c')
			{
				cnt1+=1;
			}
			System.out.println(" 2)Which one of the following is not a java feature?");
			System.out.println(" a)Object-oriented \n b)Use of pointer \n c)Portable \n d)Dynamic and Extensible ");
			System.out.println("Enter your answer");
			ans=sc.next().charAt(0);
			if(ans=='b')
			{
				cnt1+=1;
			}
			System.out.println(" 3)Which of these cannot be used for a variable name in java?");
			System.out.println(" a)identifier & keyword \n b)identifier \n c)Keyword \n d)none of the mentioned");
			System.out.println("Enter your answer");
			ans=sc.next().charAt(0);
			if(ans=='c')
			{
				cnt1+=1;
			}
			System.out.println(" 4)What is the extension of java code files");
			System.out.println(" a).js \n b).txt \n c).class \n d).java");
			System.out.println("Enter your answer");
			ans=sc.next().charAt(0);
			if(ans=='d')
			{
				cnt1+=1;
			}
			System.out.println(" 5)Which environment variable is used to set the java path?");
			System.out.println(" a)MAVEN_Path \n b)JavaPATH \n c)JAVA \n d)JAVA_HOME");
			System.out.println("Enter your answer");
			ans=sc.next().charAt(0);
			if(ans=='d')
			{
				cnt1+=1;
			}
			break;
		}
		while(System.currentTimeMillis()<end2)
		{
			System.out.println("***Section 2***");
			System.out.println(" 6)Guess the output");
			System.out.println("public static void main(String args[]){ \n\t int x=5; \n\t int y=x++ + ++x; "
					+ "\n\t System.out.println('value of y');\n}");
			System.out.println(" a)10 \n b)11 \n c)12 \n d)13");
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
		System.out.println("You have completed the exam!! \n");
		score1=cnt1*5-((4-cnt1)*1);
		System.out.println("Number of correct answers in section1 : \n"+cnt1);
		System.out.println("Number of correct answer in section 2 \n"+cnt2);
		System.out.println("Your Score in section1 \n"+score1);
		System.out.println("Your score in section2 \n"+score2);
		System.out.println("Your total score is \n "+(score1+score2));
		
	}
	public static void main(String[] args)
	{
		Online_Examination can=new Online_Examination();
		can.login();
	}
}
