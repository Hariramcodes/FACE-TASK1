package facetask1;
import java.io.*;
import java.util.*;
public class Maingames {
	public static void appendscorefile(String fileName, String str){
        
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName, false));
 
            out.write(str);
            out.close();
        }
        catch (IOException e) {}
        	
        }
	public static void main(String args[])
	{
		System.out.println("Welcome to rock, paper, scissors");
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your name");
		String str=in.nextLine();
		String[] action= {"rock","paper","scissors"};
		int c;
		int score1;
		String text,oldscore,newscore;
		int hscore;
		int score=0;
		do
		{
		System.out.println("ENTER \n 0 - ROCK \n 1 - PAPER \n 2 - SCISSORS");
		int choice=in.nextInt();
		Random random = new Random();  
		int a=random.nextInt(3);
		System.out.println("the computer picked "+action[a]);
		if(a==choice)
		{
			System.out.println("match drawn");
			score=score+10;
		}
		else if((a==0&&choice==1)||(a==1&&choice==2)||(a==2&&choice==0))
		{
			System.out.println("you won");
			score=score+20;
		}
		else
		{
			System.out.println("computer won");
		}
		System.out.println("your score : "+score);
		score1=score;
		System.out.println("Do you want to continue? 1/0");
		c=in.nextInt();
		
		} while(c==1);
		try {
		FileReader readfile = new FileReader("C:\\Users\\HARI'S PC\\OneDrive\\Desktop\\scores.txt");
		BufferedReader readbuffer= new BufferedReader(readfile);
		text = readbuffer.readLine();
		hscore=Integer.parseInt(text);
		if(hscore<=score)
		{
		System.out.println("congradulations your score is the highest score!");
		System.out.println("highest score of the game is = "+score);
		String s=Integer.toString(score);
        File f1 = new File("C:/Users/HARI'S PC/OneDrive/Desktop/scores2.txt");
        appendscorefile("C:/Users/HARI'S PC/OneDrive/Desktop/scores.txt",s);
		}
		else
		{
			System.out.println("highest score of the game is = "+hscore);
		}
		}
		catch(IOException e) {}
	}

}
