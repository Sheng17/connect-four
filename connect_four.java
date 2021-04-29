package ds_project;
import java.util.Scanner;
public class connect_four
{
	static int top1=-1,top2=-1,top3=-1,top4=-1,top5=-1,top6=-1,top7=-1;
	static String col1[],col2[],col3[],col4[],col5[],col6[],col7[];
	static void initialize(String[] col1,String[] col2,String[] col3,String[] col4,String[] col5,String[] col6,String[] col7,String[][] board)
	{
		int i;
		for(i=0;i<6;i++)
		{
			col1[i]=board[i][0];
			col2[i]=board[i][1];
			col3[i]=board[i][2];
			col4[i]=board[i][3];
			col5[i]=board[i][4];
			col6[i]=board[i][5];
			col7[i]=board[i][6];
		}
	}
	static void assign(String[] col1,String[] col2,String[] col3,String[] col4,String[] col5,String[] col6,String[] col7,String[][] board)
	{
		int i;
		for(i=0;i<6;i++)
		{
			board[i][0]=col1[i];
			board[i][1]=col2[i];
			board[i][2]=col3[i];
			board[i][3]=col4[i];
			board[i][4]=col5[i];
			board[i][5]=col6[i];
			board[i][6]=col7[i];
		}
	}
	static int isfull(String[][]board)
	{
		int i,j,counter=0;
		for(i=0;i<6;i++)
		{
			for(j=0;j<7;j++)
			{
				if(board[i][j]=="O ")
					counter++;
			}
		}
		if(counter==0)
			return 1;
		else
			return 0;
	}
	static int checkwin1(String[] col1,int top1)
	{
		if(top1==0)
		{
			if(col1[top1].equals(col2[0])&col1[top1].equals(col3[0])&col1[top1].equals(col4[0]))
			{
				return 1;
			}
			else if(col1[top1].equals(col2[1])&col1[top1].equals(col3[2])&col1[top1].equals(col4[3]))
				return 1;
			else
			{
				return 0;
			}
		}
		else if(top1==1)
		{
			if(col1[top1].equals(col2[1])&col1[top1].equals(col3[1])&col1[top1].equals(col4[1]))
				return 1;
			else if(col1[top1].equals(col2[2])&col1[top1].equals(col3[3])&col1[top1].equals(col4[4]))
				return 1;
			else return 0;
		}
		else if(top1==2)
		{
			if(col1[top1].equals(col2[2])&col1[top1].equals(col3[2])&col1[top1].equals(col4[2]))
				return 1;
			else if(col1[top1].equals(col2[3])&col1[top1].equals(col3[4])&col1[top1].equals(col4[5]))
				return 1;
			else return 0;
		}
		else if(top1==3)
		{
			if(col1[top1].equals(col2[3])&col1[top1].equals(col3[3])&col1[top1].equals(col4[3]))
				return 1;
			else if(col1[top1].equals(col1[2])&col1[top1].equals(col1[1])&col1[top1].equals(col1[0]))
				return 1;
			else if(col1[top1].equals(col2[2])&col1[top1].equals(col3[1])&col1[top1].equals(col4[0]))
				return 1;
			else return 0;
		}
		else if(top1==4)
		{
			if(col1[top1].equals(col2[4])&col1[top1].equals(col3[4])&col1[top1].equals(col4[4]))
				return 1;
			else if(col1[top1].equals(col1[3])&col1[top1].equals(col1[2])&col1[top1].equals(col1[1]))
				return 1;
			else if(col1[top1].equals(col2[3])&col1[top1].equals(col3[2])&col1[top1].equals(col4[1]))
				return 1;
			else return 0;
		}
		else if(top1==5)
		{
			if(col1[top1].equals(col2[5])&col1[top1].equals(col3[5])&col1[top1].equals(col4[5]))
				return 1;
			else if(col1[top1].equals(col1[4])&col1[top1].equals(col1[3])&col1[top1].equals(col1[2]))
				return 1;
			else if(col1[top1].equals(col2[4])&col1[top1].equals(col3[3])&col1[top1].equals(col4[2]))
				return 1;
			else return 0;
		}
		else 
			return 0;
	}
	static int checkwin2(String[] col2,int top2)
	{
		if(top2==0)
		{
			if(col2[top2].equals(col3[0])&col2[top2].equals(col4[0])&col2[top2].equals(col5[0]))
				return 1;
			else if(col2[top2].equals(col3[0])&col2[top2].equals(col4[0])&col2[top2].equals(col1[0]))
				return 1;
			else if(col2[top2].equals(col3[1])&col2[top2].equals(col4[2])&col2[top2].equals(col5[3]))
					return 1;
			else return 0;
		}
		else if(top2==1)
		{
			if(col2[top2].equals(col3[1])&col2[top2].equals(col4[1])&col2[top2].equals(col5[1]))
				return 1;
			else if(col2[top2].equals(col3[1])&col2[top2].equals(col4[1])&col2[top2].equals(col1[1]))
				return 1;
			else if(col2[top2].equals(col3[2])&col2[top2].equals(col4[3])&col2[top2].equals(col5[4]))
				return 1;
			else if(col2[top2].equals(col3[2])&col2[top2].equals(col4[3])&col2[top2].equals(col1[0]))
				return 1;
			else return 0;
		}
		else if(top2==2)
		{
			if(col2[top2].equals(col3[2])&col2[top2].equals(col4[2])&col2[top2].equals(col5[2]))
				return 1;
			else if(col2[top2].equals(col3[2])&col2[top2].equals(col4[2])&col2[top2].equals(col1[2]))
				return 1;
			else if(col2[top2].equals(col3[3])&col2[top2].equals(col4[4])&col2[top2].equals(col5[5]))
				return 1;
			else if(col2[top2].equals(col3[3])&col2[top2].equals(col4[4])&col2[top2].equals(col1[1]))
				return 1;
			else if(col2[top2].equals(col1[3])&col2[top2].equals(col3[1])&col2[top2].equals(col4[0]))
				return 1;
			else return 0;
		}
		else if(top2==3)
		{
			if(col2[top2].equals(col3[3])&col2[top2].equals(col4[3])&col2[top2].equals(col5[3]))
				return 1;
			else if(col2[top2].equals(col3[3])&col2[top2].equals(col4[3])&col2[top2].equals(col1[3]))
				return 1;
			else if(col2[top2].equals(col2[2])&col2[top2].equals(col2[1])&col2[top2].equals(col2[0]))
				return 1;
			else if(col2[top2].equals(col3[4])&col2[top2].equals(col4[5])&col2[top2].equals(col1[2]))
				return 1;
			else if(col2[top2].equals(col3[2])&col2[top2].equals(col4[1])&col2[top2].equals(col1[4]))
				return 1;
			else if(col2[top2].equals(col3[2])&col2[top2].equals(col4[1])&col2[top2].equals(col5[0]))
				return 1;
			else return 0;
		}
		else if(top2==4)
		{
			if(col2[top2].equals(col3[4])&col2[top2].equals(col4[4])&col2[top2].equals(col5[4]))
				return 1;
			else if(col2[top2].equals(col3[4])&col2[top2].equals(col4[4])&col2[top2].equals(col1[4]))
				return 1;
			else if(col2[top2].equals(col2[3])&col2[top2].equals(col2[2])&col2[top2].equals(col2[1]))
				return 1;
			else if(col2[top2].equals(col3[3])&col2[top2].equals(col4[2])&col2[top2].equals(col1[5]))
				return 1;
			else if(col2[top2].equals(col3[3])&col2[top2].equals(col4[2])&col2[top2].equals(col5[1]))
				return 1;
			else return 0;
		}
		else if(top2==5)
		{
			if(col2[top2].equals(col3[5])&col2[top2].equals(col4[5])&col2[top2].equals(col5[5]))
				return 1;
			else if(col2[top2].equals(col3[5])&col2[top2].equals(col4[5])&col2[top2].equals(col1[5]))
				return 1;
			else if(col2[top2].equals(col2[4])&col2[top2].equals(col2[3])&col2[top2].equals(col2[2]))
				return 1;
			else if(col2[top2].equals(col3[4])&col2[top2].equals(col4[3])&col2[top2].equals(col5[2]))
				return 1;
			else return 0;
		}
		else return 0;
	}
	static int checkwin3(String[] col3,int top3)
	{
		if(top3==0)
		{
			if(col3[top3].equals(col1[0])&col3[top3].equals(col2[0])&col3[top3].equals(col4[0]))
				return 1;
			else if(col3[top3].equals(col4[0])&col3[top3].equals(col5[0])&col3[top3].equals(col6[0]))
				return 1;
			else if(col3[top3].equals(col2[0])&col3[top3].equals(col4[0])&col3[top3].equals(col5[0]))
				return 1;
			else if(col3[top3].equals(col4[1])&col3[top3].equals(col5[2])&col3[top3].equals(col6[3]))
				return 1;
			else
				return 0;
		}
		else if(top3==1)
		{
			if(col3[top3].equals(col1[1])&col3[top3].equals(col2[1])&col3[top3].equals(col4[1]))
				return 1;
			else if(col3[top3].equals(col4[1])&col3[top3].equals(col5[1])&col3[top3].equals(col6[1]))
				return 1;
			else if(col3[top3].equals(col2[1])&col3[top3].equals(col4[1])&col3[top3].equals(col5[1]))
				return 1;
			else if(col3[top3].equals(col4[2])&col3[top3].equals(col5[3])&col3[top3].equals(col6[4]))
				return 1;
			else if(col3[top3].equals(col4[2])&col3[top3].equals(col5[3])&col3[top3].equals(col2[0]))
				return 1;
			else if(col3[top3].equals(col4[0])&col3[top3].equals(col2[2])&col3[top3].equals(col1[3]))
				return 1;
			else
				return 0;
		}
		else if(top3==2)
		{
			if(col3[top3].equals(col1[2])&col3[top3].equals(col2[2])&col3[top3].equals(col4[2]))
				return 1;
			else if(col3[top3].equals(col4[2])&col3[top3].equals(col5[2])&col3[top3].equals(col6[2]))
				return 1;
			else if(col3[top3].equals(col2[2])&col3[top3].equals(col4[2])&col3[top3].equals(col5[2]))
				return 1;
			else if(col3[top3].equals(col4[3])&col3[top3].equals(col5[4])&col3[top3].equals(col6[5]))
				return 1;
			else if(col3[top3].equals(col2[1])&col3[top3].equals(col4[3])&col3[top3].equals(col5[4]))
				return 1;
			else if(col3[top3].equals(col1[0])&col3[top3].equals(col2[1])&col3[top3].equals(col4[3]))
				return 1;
			else if(col3[top3].equals(col4[1])&col3[top3].equals(col5[0])&col3[top3].equals(col2[3]))
				return 1;
			else if(col3[top3].equals(col1[4])&col3[top3].equals(col2[3])&col3[top3].equals(col4[1]))
				return 1;
			else
				return 0;
		}
		else if(top3==3)
		{
			if(col3[top3].equals(col1[3])&col3[top3].equals(col2[3])&col3[top3].equals(col4[3]))
				return 1;
			else if(col3[top3].equals(col4[3])&col3[top3].equals(col5[3])&col3[top3].equals(col6[3]))
				return 1;
			else if(col3[top3].equals(col2[3])&col3[top3].equals(col4[3])&col3[top3].equals(col5[3]))
				return 1;
			else if(col3[top3].equals(col3[2])&col3[top3].equals(col3[1])&col3[top3].equals(col3[0]))
				return 1;
			else if(col3[top3].equals(col4[4])&col3[top3].equals(col5[5])&col3[top3].equals(col2[2]))
				return 1;
			else if(col3[top3].equals(col1[1])&col3[top3].equals(col2[2])&col3[top3].equals(col4[4]))
				return 1;
			else if(col3[top3].equals(col1[5])&col3[top3].equals(col2[4])&col3[top3].equals(col4[2]))
				return 1;
			else if(col3[top3].equals(col2[4])&col3[top3].equals(col4[2])&col3[top3].equals(col5[1]))
				return 1;
			else if(col3[top3].equals(col4[2])&col3[top3].equals(col5[1])&col3[top3].equals(col6[0]))
				return 1;
			else
				return 0;
		}
		else if(top3==4)
		{
			if(col3[top3].equals(col1[4])&col3[top3].equals(col2[4])&col3[top3].equals(col4[4]))
				return 1;
			else if(col3[top3].equals(col4[4])&col3[top3].equals(col5[4])&col3[top3].equals(col6[4]))
				return 1;
			else if(col3[top3].equals(col2[4])&col3[top3].equals(col4[4])&col3[top3].equals(col5[4]))
				return 1;
			else if(col3[top3].equals(col3[3])&col3[top3].equals(col3[2])&col3[top3].equals(col3[1]))
				return 1;
			else if(col3[top3].equals(col1[2])&col3[top3].equals(col2[3])&col3[top3].equals(col4[5]))
				return 1;
			else if(col3[top3].equals(col2[5])&col3[top3].equals(col4[3])&col3[top3].equals(col5[2]))
				return 1;
			else if(col3[top3].equals(col4[3])&col3[top3].equals(col5[2])&col3[top3].equals(col6[1]))
				return 1;
			else
				return 0;
		}
		else if(top3==5)
		{
			if(col3[top3].equals(col1[5])&col3[top3].equals(col2[5])&col3[top3].equals(col4[5]))
				return 1;
			else if(col3[top3].equals(col4[5])&col3[top3].equals(col5[5])&col3[top3].equals(col6[5]))
				return 1;
			else if(col3[top3].equals(col2[5])&col3[top3].equals(col4[5])&col3[top3].equals(col5[5]))
				return 1;
			else if(col3[top3].equals(col3[4])&col3[top3].equals(col3[3])&col3[top3].equals(col3[2]))
				return 1;
			else if(col3[top3].equals(col4[4])&col3[top3].equals(col5[3])&col3[top3].equals(col6[2]))
				return 1;
			else return 0;
		}
		else return 0;
	}
	static int checkwin4(String[] col4,int top4)
	{
		if(top4==0)
		{
			if(col4[top4].equals(col1[0])&col4[top4].equals(col2[0])&col4[top4].equals(col3[0]))
				return 1;
			else if(col4[top4].equals(col2[0])&col4[top4].equals(col3[0])&col4[top4].equals(col5[0]))
				return 1;
			else if(col4[top4].equals(col3[0])&col4[top4].equals(col5[0])&col4[top4].equals(col6[0]))
				return 1;
			else if(col4[top4].equals(col5[0])&col4[top4].equals(col6[0])&col4[top4].equals(col7[0]))
				return 1;
			else if(col4[top4].equals(col3[1])&col4[top4].equals(col2[2])&col4[top4].equals(col1[3]))
				return 1;
			else if(col4[top4].equals(col5[1])&col4[top4].equals(col6[2])&col4[top4].equals(col7[3]))
				return 1;
			else return 0;
		}
		if(top4==1)
		{
			if(col4[top4].equals(col1[1])&col4[top4].equals(col2[1])&col4[top4].equals(col3[1]))
				return 1;
			else if(col4[top4].equals(col2[1])&col4[top4].equals(col3[1])&col4[top4].equals(col5[1]))
				return 1;
			else if(col4[top4].equals(col3[1])&col4[top4].equals(col5[1])&col4[top4].equals(col6[1]))
				return 1;
			else if(col4[top4].equals(col5[1])&col4[top4].equals(col6[1])&col4[top4].equals(col7[1]))
				return 1;
			else if(col4[top4].equals(col3[2])&col4[top4].equals(col2[3])&col4[top4].equals(col1[4]))
				return 1;
			else if(col4[top4].equals(col3[2])&col4[top4].equals(col2[3])&col4[top4].equals(col5[0]))
				return 1;
			else if(col4[top4].equals(col3[0])&col4[top4].equals(col5[2])&col4[top4].equals(col6[3]))
				return 1;
			else if(col4[top4].equals(col5[2])&col4[top4].equals(col6[3])&col4[top4].equals(col7[4]))
				return 1;
			else return 0;
		}
		else if(top4==2)
		{
			if(col4[top4].equals(col1[2])&col4[top4].equals(col2[2])&col4[top4].equals(col3[2]))
				return 1;
			else if(col4[top4].equals(col2[2])&col4[top4].equals(col3[2])&col4[top4].equals(col5[2]))
				return 1;
			else if(col4[top4].equals(col3[2])&col4[top4].equals(col5[2])&col4[top4].equals(col6[2]))
				return 1;
			else if(col4[top4].equals(col5[2])&col4[top4].equals(col6[2])&col4[top4].equals(col7[2]))
				return 1;
			else if(col4[top4].equals(col1[5])&col4[top4].equals(col2[4])&col4[top4].equals(col3[3]))
				return 1;
			else if(col4[top4].equals(col2[4])&col4[top4].equals(col3[3])&col4[top4].equals(col5[1]))
				return 1;
			else if(col4[top4].equals(col3[3])&col4[top4].equals(col5[1])&col4[top4].equals(col6[0]))
				return 1;
			else if(col4[top4].equals(col7[5])&col4[top4].equals(col6[4])&col4[top4].equals(col5[3]))
				return 1;
			else if(col4[top4].equals(col6[4])&col4[top4].equals(col5[3])&col4[top4].equals(col3[1]))
				return 1;
			else if(col4[top4].equals(col5[3])&col4[top4].equals(col3[1])&col4[top4].equals(col2[0]))
				return 1;
		}
		if(top4==3)
		{
			if(col4[top4].equals(col1[3])&col4[top4].equals(col2[3])&col4[top4].equals(col3[3]))
				return 1;
			else if(col4[top4].equals(col2[3])&col4[top4].equals(col3[3])&col4[top4].equals(col5[3]))
				return 1;
			else if(col4[top4].equals(col3[3])&col4[top4].equals(col5[3])&col4[top4].equals(col6[3]))
				return 1;
			else if(col4[top4].equals(col5[3])&col4[top4].equals(col6[3])&col4[top4].equals(col7[3]))
				return 1;
			else if(col4[top4].equals(col2[5])&col4[top4].equals(col3[4])&col4[top4].equals(col5[2]))
				return 1;
			else if(col4[top4].equals(col3[4])&col4[top4].equals(col5[2])&col4[top4].equals(col6[1]))
				return 1;
			else if(col4[top4].equals(col5[2])&col4[top4].equals(col6[1])&col4[top4].equals(col7[0]))
				return 1;
			else if(col4[top4].equals(col6[5])&col4[top4].equals(col5[4])&col4[top4].equals(col3[2]))
				return 1;
			else if(col4[top4].equals(col5[4])&col4[top4].equals(col3[2])&col4[top4].equals(col2[1]))
				return 1;
			else if(col4[top4].equals(col3[2])&col4[top4].equals(col2[1])&col4[top4].equals(col1[0]))
				return 1;
			else if(col4[top4].equals(col4[2])&col4[top4].equals(col4[1])&col4[top4].equals(col4[0]))
				return 1;
			else return 0;
		}
		else if(top4==4)
		{
			if(col4[top4].equals(col1[4])&col4[top4].equals(col2[4])&col4[top4].equals(col3[4]))
				return 1;
			else if(col4[top4].equals(col2[4])&col4[top4].equals(col3[4])&col4[top4].equals(col5[4]))
				return 1;
			else if(col4[top4].equals(col3[4])&col4[top4].equals(col5[4])&col4[top4].equals(col6[4]))
				return 1;
			else if(col4[top4].equals(col5[4])&col4[top4].equals(col6[4])&col4[top4].equals(col7[4]))
				return 1;
			else if(col4[top4].equals(col1[1])&col4[top4].equals(col2[2])&col4[top4].equals(col3[3]))
				return 1;
			else if(col4[top4].equals(col2[2])&col4[top4].equals(col3[3])&col4[top4].equals(col5[5]))
				return 1;
			else if(col4[top4].equals(col3[5])&col4[top4].equals(col5[3])&col4[top4].equals(col6[2]))
				return 1;
			else if(col4[top4].equals(col5[3])&col4[top4].equals(col6[2])&col4[top4].equals(col7[1]))
				return 1;
			else if(col4[top4].equals(col4[3])&col4[top4].equals(col4[2])&col4[top4].equals(col4[1]))
				return 1;
			else return 0;
		}
		else if(top4==5)
		{
			if(col4[top4].equals(col1[5])&col4[top4].equals(col2[5])&col4[top4].equals(col3[5]))
				return 1;
			else if(col4[top4].equals(col2[5])&col4[top4].equals(col3[5])&col4[top4].equals(col5[5]))
				return 1;
			else if(col4[top4].equals(col3[5])&col4[top4].equals(col5[5])&col4[top4].equals(col6[5]))
				return 1;
			else if(col4[top4].equals(col5[5])&col4[top4].equals(col6[5])&col4[top4].equals(col7[5]))
				return 1;
			else if(col4[top4].equals(col1[2])&col4[top4].equals(col2[3])&col4[top4].equals(col3[4]))
				return 1;
			else if(col4[top4].equals(col5[4])&col4[top4].equals(col6[3])&col4[top4].equals(col7[2]))
				return 1;
			else if(col4[top4].equals(col4[4])&col4[top4].equals(col4[3])&col4[top4].equals(col4[2]))
				return 1;
			else return 0;
		}
		else return 0;
		
	}
	static int checkwin5(String[] col5,int top5)
	{
		if(top5==0)
		{
			if(col5[top5].equals(col7[0])&col5[top5].equals(col6[0])&col5[top5].equals(col4[0]))
				return 1;
			else if(col5[top5].equals(col4[0])&col5[top5].equals(col3[0])&col5[top5].equals(col2[0]))
				return 1;
			else if(col5[top5].equals(col6[0])&col5[top5].equals(col4[0])&col5[top5].equals(col3[0]))
				return 1;
			else if(col5[top5].equals(col4[1])&col5[top5].equals(col3[2])&col5[top5].equals(col2[3]))
				return 1;
			else
				return 0;
		}
		else if(top5==1)
		{
			if(col5[top5].equals(col7[1])&col5[top5].equals(col6[1])&col5[top5].equals(col4[1]))
				return 1;
			else if(col5[top5].equals(col4[1])&col5[top5].equals(col3[1])&col5[top5].equals(col2[1]))
				return 1;
			else if(col5[top5].equals(col6[1])&col5[top5].equals(col4[1])&col5[top5].equals(col3[1]))
				return 1;
			else if(col5[top5].equals(col4[2])&col5[top5].equals(col3[3])&col5[top5].equals(col2[4]))
				return 1;
			else if(col5[top5].equals(col4[2])&col5[top5].equals(col3[3])&col5[top5].equals(col6[0]))
				return 1;
			else if(col5[top5].equals(col4[0])&col5[top5].equals(col6[2])&col5[top5].equals(col7[3]))
				return 1;
			else
				return 0;
		}
		else if(top5==2)
		{
			if(col5[top5].equals(col7[2])&col5[top5].equals(col6[2])&col5[top5].equals(col4[2]))
				return 1;
			else if(col5[top5].equals(col4[2])&col5[top5].equals(col3[2])&col5[top5].equals(col2[2]))
				return 1;
			else if(col5[top5].equals(col6[2])&col5[top5].equals(col4[2])&col5[top5].equals(col3[2]))
				return 1;
			else if(col5[top5].equals(col4[3])&col5[top5].equals(col3[4])&col5[top5].equals(col2[5]))
				return 1;
			else if(col5[top5].equals(col6[1])&col5[top5].equals(col4[3])&col5[top5].equals(col3[4]))
				return 1;
			else if(col5[top5].equals(col7[0])&col5[top5].equals(col6[1])&col5[top5].equals(col4[3]))
				return 1;
			else if(col5[top5].equals(col4[1])&col5[top5].equals(col3[0])&col5[top5].equals(col6[3]))
				return 1;
			else if(col5[top5].equals(col7[4])&col5[top5].equals(col6[3])&col5[top5].equals(col4[1]))
				return 1;
			else
				return 0;
		}
		else if(top5==3)
		{
			if(col5[top5].equals(col7[3])&col5[top5].equals(col6[3])&col5[top5].equals(col4[3]))
				return 1;
			else if(col5[top5].equals(col4[3])&col5[top5].equals(col3[3])&col5[top5].equals(col2[3]))
				return 1;
			else if(col5[top5].equals(col6[3])&col5[top5].equals(col4[3])&col5[top5].equals(col3[3]))
				return 1;
			else if(col5[top5].equals(col5[2])&col5[top5].equals(col5[1])&col5[top5].equals(col5[0]))
				return 1;
			else if(col5[top5].equals(col4[4])&col5[top5].equals(col3[5])&col5[top5].equals(col6[2]))
				return 1;
			else if(col5[top5].equals(col7[1])&col5[top5].equals(col6[2])&col5[top5].equals(col4[4]))
				return 1;
			else if(col5[top5].equals(col7[5])&col5[top5].equals(col6[4])&col5[top5].equals(col4[2]))
				return 1;
			else if(col5[top5].equals(col6[4])&col5[top5].equals(col4[2])&col5[top5].equals(col3[1]))
				return 1;
			else if(col5[top5].equals(col4[2])&col5[top5].equals(col3[1])&col5[top5].equals(col2[0]))
				return 1;
			else
				return 0;
		}
		else if(top5==4)
		{
			if(col5[top5].equals(col7[4])&col5[top5].equals(col6[4])&col5[top5].equals(col4[4]))
				return 1;
			else if(col5[top5].equals(col4[4])&col5[top5].equals(col3[4])&col5[top5].equals(col2[4]))
				return 1;
			else if(col5[top5].equals(col6[4])&col5[top5].equals(col4[4])&col5[top5].equals(col3[4]))
				return 1;
			else if(col5[top5].equals(col5[3])&col5[top5].equals(col5[2])&col5[top5].equals(col5[1]))
				return 1;
			else if(col5[top5].equals(col7[2])&col5[top5].equals(col6[3])&col5[top5].equals(col4[5]))
				return 1;
			else if(col5[top5].equals(col6[5])&col5[top5].equals(col4[3])&col5[top5].equals(col3[2]))
				return 1;
			else if(col5[top5].equals(col4[3])&col5[top5].equals(col3[2])&col5[top5].equals(col2[1]))
				return 1;
			else
				return 0;
		}
		else if(top5==5)
		{
			if(col5[top5].equals(col7[5])&col5[top5].equals(col6[5])&col5[top5].equals(col4[5]))
				return 1;
			else if(col5[top5].equals(col4[5])&col5[top5].equals(col3[5])&col5[top5].equals(col2[5]))
				return 1;
			else if(col5[top5].equals(col6[5])&col5[top5].equals(col4[5])&col5[top5].equals(col3[5]))
				return 1;
			else if(col5[top5].equals(col5[4])&col5[top5].equals(col5[3])&col5[top5].equals(col5[2]))
				return 1;
			else if(col5[top5].equals(col4[4])&col5[top5].equals(col3[3])&col5[top5].equals(col2[2]))
				return 1;
			else return 0;
		}
		else return 0;
	}
	static int checkwin6(String[] col6,int top6)
	{
		if(top6==0)
		{
			if(col6[top6].equals(col5[0])&col6[top6].equals(col4[0])&col6[top6].equals(col3[0]))
				return 1;
			else if(col6[top6].equals(col5[0])&col6[top6].equals(col4[0])&col6[top6].equals(col7[0]))
				return 1;
			else if(col6[top6].equals(col5[1])&col6[top6].equals(col4[2])&col6[top6].equals(col3[3]))
					return 1;
			else return 0;
		}
		else if(top6==1)
		{
			if(col6[top6].equals(col5[1])&col6[top6].equals(col4[1])&col6[top6].equals(col3[1]))
				return 1;
			else if(col6[top6].equals(col5[1])&col6[top6].equals(col4[1])&col6[top6].equals(col7[1]))
				return 1;
			else if(col6[top6].equals(col5[2])&col6[top6].equals(col4[3])&col6[top6].equals(col3[4]))
				return 1;
			else if(col6[top6].equals(col5[2])&col6[top6].equals(col4[3])&col6[top6].equals(col7[0]))
				return 1;
			else return 0;
		}
		else if(top6==2)
		{
			if(col6[top6].equals(col5[2])&col6[top6].equals(col4[2])&col6[top6].equals(col3[2]))
				return 1;
			else if(col6[top6].equals(col5[2])&col6[top6].equals(col4[2])&col6[top6].equals(col7[2]))
				return 1;
			else if(col6[top6].equals(col5[3])&col6[top6].equals(col4[4])&col6[top6].equals(col3[5]))
				return 1;
			else if(col6[top6].equals(col5[3])&col6[top6].equals(col4[4])&col6[top6].equals(col7[1]))
				return 1;
			else if(col6[top6].equals(col7[3])&col6[top6].equals(col5[1])&col6[top6].equals(col4[0]))
				return 1;
			else return 0;
		}
		else if(top6==3)
		{
			if(col6[top6].equals(col5[3])&col6[top6].equals(col4[3])&col6[top6].equals(col3[3]))
				return 1;
			else if(col6[top6].equals(col5[3])&col6[top6].equals(col4[3])&col6[top6].equals(col7[3]))
				return 1;
			else if(col6[top6].equals(col6[2])&col6[top6].equals(col6[1])&col6[top6].equals(col6[0]))
				return 1;
			else if(col6[top6].equals(col5[4])&col6[top6].equals(col4[5])&col6[top6].equals(col7[2]))
				return 1;
			else if(col6[top6].equals(col5[2])&col6[top6].equals(col4[1])&col6[top6].equals(col7[4]))
				return 1;
			else if(col6[top6].equals(col5[2])&col6[top6].equals(col4[1])&col6[top6].equals(col3[0]))
				return 1;
			else return 0;
		}
		else if(top6==4)
		{
			if(col6[top6].equals(col5[4])&col6[top6].equals(col4[4])&col6[top6].equals(col3[4]))
				return 1;
			else if(col6[top6].equals(col5[4])&col6[top6].equals(col4[4])&col6[top6].equals(col7[4]))
				return 1;
			else if(col6[top6].equals(col6[3])&col6[top6].equals(col6[2])&col6[top6].equals(col6[1]))
				return 1;
			else if(col6[top6].equals(col5[3])&col6[top6].equals(col4[2])&col6[top6].equals(col7[5]))
				return 1;
			else if(col6[top6].equals(col5[3])&col6[top6].equals(col4[2])&col6[top6].equals(col3[1]))
				return 1;
			else return 0;
		}
		else if(top6==5)
		{
			if(col6[top6].equals(col5[5])&col6[top6].equals(col4[5])&col6[top6].equals(col3[5]))
				return 1;
			else if(col6[top6].equals(col5[5])&col6[top6].equals(col4[5])&col6[top6].equals(col7[5]))
				return 1;
			else if(col6[top6].equals(col6[4])&col6[top6].equals(col6[3])&col6[top6].equals(col6[2]))
				return 1;
			else if(col6[top6].equals(col5[4])&col6[top6].equals(col4[3])&col6[top6].equals(col3[2]))
				return 1;
			else return 0;
		}
		else return 0;
	}
	static int checkwin7(String[] col7,int top7)
	{
		if(top7==0)
		{
			if(col7[top7].equals(col6[0])&col7[top7].equals(col5[0])&col7[top7].equals(col4[0]))
				return 1;
			else if(col7[top7].equals(col6[1])&col7[top7].equals(col5[2])&col7[top7].equals(col4[3]))
				return 1;
			else
				return 0;
		}
		else if(top7==1)
		{
			if(col7[top7].equals(col6[1])&col7[top7].equals(col5[1])&col7[top7].equals(col4[1]))
				return 1;
			else if(col7[top7].equals(col6[2])&col7[top7].equals(col5[3])&col7[top7].equals(col4[4]))
				return 1;
			else return 0;
		}
		else if(top7==2)
		{
			if(col7[top7].equals(col6[2])&col7[top7].equals(col5[2])&col7[top7].equals(col4[2]))
				return 1;
			else if(col7[top7].equals(col6[3])&col7[top7].equals(col5[4])&col7[top7].equals(col4[5]))
				return 1;
			else return 0;
		}
		else if(top7==3)
		{
			if(col7[top7].equals(col6[3])&col7[top7].equals(col5[3])&col7[top7].equals(col4[3]))
				return 1;
			else if(col7[top7].equals(col7[2])&col7[top7].equals(col7[1])&col7[top7].equals(col7[0]))
				return 1;
			else if(col7[top7].equals(col6[2])&col7[top7].equals(col5[1])&col7[top7].equals(col4[0]))
				return 1;
			else return 0;
		}
		else if(top7==4)
		{
			if(col7[top7].equals(col6[4])&col7[top7].equals(col5[4])&col7[top7].equals(col4[4]))
				return 1;
			else if(col7[top7].equals(col7[3])&col7[top7].equals(col7[2])&col7[top7].equals(col7[1]))
				return 1;
			else if(col7[top7].equals(col6[3])&col7[top7].equals(col5[2])&col7[top7].equals(col4[1]))
				return 1;
			else return 0;
		}
		else if(top7==5)
		{
			if(col7[top7].equals(col6[5])&col7[top7].equals(col5[5])&col7[top7].equals(col4[5]))
				return 1;
			else if(col7[top7].equals(col7[4])&col7[top7].equals(col7[3])&col7[top7].equals(col7[2]))
				return 1;
			else if(col7[top7].equals(col6[4])&col7[top7].equals(col5[3])&col7[top7].equals(col4[2]))
				return 1;
			else return 0;
		}
		else 
			return 0;
	}
	static void display(String[][] board)
	{
		int	 i,j;
		System.out.println("1 2 3 4 5 6 7\n---------------");
		for(i=5;i>=0;i--)
		{
			for(j=0;j<7;j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------\n1 2 3 4 5 6 7\n");
	}
	public static void main(String args[])
	{
		col1=new String[6]; col2=new String[6];
		col3=new String[6]; col4=new String[6];
		col5=new String[6]; col6=new String[6];
		col7=new String[6];
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String board[][]=new String[6][7];
		int	 i,j,l=0; char repeat='y';int player1win=0,player2win=0;
		System.out.println("**************Greetings**************\nPlayer 1, enter your name.");
		String name1=sc.nextLine();
		System.out.println("Player 2, enter your name.");
		String name2=sc.nextLine();
		do
		{
			top1=-1;top2=-1;top3=-1;top4=-1;top5=-1;top6=-1;top7=-1;
			for(i=0;i<6;i++)
			{
				for(j=0;j<7;j++)
				{
					board[i][j]="O ";
				}	
			}
			System.out.println(name1+", enter your symbol.");
			char p1=sc.next().charAt(0);
			System.out.println(name2+", enter your symbol.");
			char p2=sc.next().charAt(0);
			display(board);
			initialize(col1,col2,col3,col4,col5,col6,col7,board);
			int z=2;
			do
			{
				if(z%2==0)
				{
					if(l==0) {System.out.println(name1+", choose a column to place your chip in.");}
					int col=sc.nextInt();
					if(col==1)
					{
						if(top1==5)
						{
							System.out.println("This column is full. Choose a different one.");
							l++;
							continue;
						}
						else
						{
							l=0;
							top1++;
							col1[top1]=p1+" ";
						}
					}
					else if(col==2)
					{
						if(top2==5)
						{
							System.out.println("This column is full. Choose a different one.");
							l++;
							continue;
						}
						else
						{
							l=0;
							top2++;
							col2[top2]=p1+" ";
						}
					}
					else if(col==3)
					{
						if(top3==5)
						{
							System.out.println("This column is full. Choose a different one.");
							l++;
							continue;
						}
						else
						{
							l=0;
							top3++;
							col3[top3]=p1+" ";
						}
					}
					else if(col==4)
					{
						if(top4==5)
						{
							System.out.println("This column is full. Choose a different one.");
							l++;
							continue;
						}
						else
						{
							l=0;
							top4++;
							col4[top4]=p1+" ";
						}
					}
					else if(col==5)
					{
						if(top5==5)
						{
							System.out.println("This column is full. Choose a different one.");
							l++;
							continue;
						}
						else
						{
							l=0;
							top5++;
							col5[top5]=p1+" ";
						}
					}
					else if(col==6)
					{
						if(top6==5)
						{
							System.out.println("This column is full. Choose a different one.");
							l++;
							continue;
						}
						else
						{
							l=0;
							top6++;
							col6[top6]=p1+" ";
						}
					}
					else if(col==7)
					{
						if(top7==5)
						{
							System.out.println("This column is full. Choose a different one.");
							l++;
							continue;
						}
						else
						{
							l=0;
							top7++;
							col7[top7]=p1+" ";
						}
					}
					else
					{
						System.out.println("This column does not exist. Choose one that does.");
						l++;
						continue;
					}
					assign(col1,col2,col3,col4,col5,col6,col7,board);
					display(board);
					z++;
					if(col==1)
					{
						if(checkwin1(col1,top1)==1)
						{
							System.out.println("***************** "+name1+" wins! *****************");
							player1win++;
							break;
						}
					}
					else if(col==2)
					{
						if(checkwin2(col2,top2)==1)
						{
							System.out.println("***************** "+name1+" wins! *****************");
							player1win++;
							break;
						}
					}
					else if(col==3)
					{
						if(checkwin3(col3,top3)==1)
						{
							System.out.println("***************** "+name1+" wins! *****************");
							player1win++;
							break;
						}
					}
					else if(col==4)
					{
						if(checkwin4(col4,top4)==1)
						{
							System.out.println("***************** "+name1+" wins! *****************");
							player1win++;
							break;
						}
					}
					else if(col==5)
					{
						if(checkwin5(col5,top5)==1)
						{
							System.out.println("***************** "+name1+" wins! *****************");
							player1win++;
							break;
						}
					}
					else if(col==6)
					{
						if(checkwin6(col6,top6)==1)
						{
							System.out.println("***************** "+name1+" wins! *****************");
							player1win++;
							break;
						}
					}
					else if(col==7)
					{
						if(checkwin7(col7,top7)==1)
						{
							System.out.println("***************** "+name1+" wins! *****************");
							player1win++;
							break;
						}
					}
						if(isfull(board)==1)
						{
							System.out.println("Neither player wins :(");
							break;
						}
				}
				else if(z%2!=0)
				{
					if(l==0) {System.out.println(name2+", choose a column to place your chip in.");}
					int col=sc.nextInt();
					if(col==1)
					{
						if(top1==5)
						{
							System.out.println("This column is full. Choose a different one.");
							l++;
							continue;
						}
						else
						{
							l=0;
							top1++;
							col1[top1]=p2+" ";
						}
					}
					else if(col==2)
					{
						if(top2==5)
						{
							System.out.println("This column is full. Choose a different one.");
							l++;
							continue;
						}
						else
						{
							l=0;
							top2++;
							col2[top2]=p2+" ";
						}
					}
					else if(col==3)
					{
						if(top3==5)
						{
							System.out.println("This column is full. Choose a different one.");
							l++;
							continue;
						}
						else
						{
							l=0;
							top3++;
							col3[top3]=p2+" ";
						}
					}
					else if(col==4)
					{
						if(top4==5)
						{
							System.out.println("This column is full. Choose a different one.");
							l++;
							continue;
						}
						else
						{
							l=0;
							top4++;
							col4[top4]=p2+" ";
						}
					}
					else if(col==5)
					{
						if(top5==5)
						{
							System.out.println("This column is full. Choose a different one.");
							l++;
							continue;
						}
						else
						{
							l=0;
							top5++;
							col5[top5]=p2+" ";
						}
					}
					else if(col==6)
					{
						if(top6==5)
						{
							System.out.println("This column is full. Choose a different one.");
							l++;
							continue;
						}
						else
						{
							l=0;
							top6++;
							col6[top6]=p2+" ";
						}
					}
					else if(col==7)
					{
						if(top7==5)
						{
							System.out.println("This column is full. Choose a different one.");
							l++;
							continue;
						}
						else
						{
							l=0;
							top7++;
							col7[top7]=p2+" ";
						}
					}
					else
					{
						System.out.println("This column does not exist. Choose one that does.");
						l++;
						continue;
					}
					assign(col1,col2,col3,col4,col5,col6,col7,board);
					display(board);
					z++;
					if(col==1)
					{
						if(checkwin1(col1,top1)==1)
						{
							System.out.println("***************** "+name2+" wins! *****************");
							player2win++;
							break;
						}
					}
					else if(col==2)
					{
						if(checkwin2(col2,top2)==1)
						{
							System.out.println("***************** "+name2+" wins! *****************");
							player2win++;
							break;
						}
					}
					else if(col==3)
					{
						if(checkwin3(col3,top3)==1)
						{
							System.out.println("***************** "+name2+" wins! *****************");
							player2win++;
							break;
						}
					}
					else if(col==4)
					{
						if(checkwin4(col4,top4)==1)
						{
							System.out.println("***************** "+name2+" wins! *****************");
							player2win++;
							break;
						}
					}
					else if(col==5)
					{
						if(checkwin5(col5,top5)==1)
						{
							System.out.println("***************** "+name2+" wins! *****************");
							player2win++;
							break;
						}
					}
					else if(col==6)
					{
						if(checkwin6(col6,top6)==1)
						{
							System.out.println("***************** "+name2+" wins! *****************");
							player2win++;
							break;
						}
					}
					else if(col==7)
					{
						if(checkwin7(col7,top7)==1)
						{
							System.out.println("***************** "+name2+" wins! *****************");
							player2win++;
							break;
						}
					}
					if(isfull(board)==1)
					{
						System.out.println("**************Neither player wins :(**************");
						break;
					}
				}
			}while(z!=0);
			if(player1win==1)
				System.out.println(name1+": "+player1win+" point");
			else System.out.println(name1+": "+player1win+" points");
			if(player2win==1)
				System.out.println(name2+": "+player2win+" point");
			else System.out.println(name2+": "+player2win+" points");
				
			System.out.println("Do you want to play again?\nPress y for ''yes'' or anything else for ''No''\n**************************************************\n");
			repeat=sc.next().charAt(0);
	}while(repeat=='y');
		if(player1win>player2win)
		System.out.print(name1+" wins! Better luck next time, "+name2+"...");
		else if(player1win<player2win)
			System.out.print(name2+ " wins! Better luck next time, "+name1+"...");
		else if(player1win==player2win)
			System.out.print("Scores are tied...");
	}
}
