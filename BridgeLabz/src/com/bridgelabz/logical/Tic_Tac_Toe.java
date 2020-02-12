package com.bridgelabz.logical;
import java.util.Random;
import java.util.Scanner;
public class Tic_Tac_Toe {
	/*public static boolean draw(String[][] array)
	{
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(!(array[i][j]=="5"))
					break;
			}
		}
		return false;
	}*/
	public static boolean win(String array[][]) {
		if(array[0][0]==array[0][1] && array[0][1]==array[0][2] && array[0][0]!="5")
			return true;
		if(array[0][0]==array[1][0] && array[1][0]==array[2][0] && array[0][0]!="5")
			return true;
		if(array[2][0]==array[2][1] && array[2][1]==array[2][2] && array[2][0]!="5")
			return true;
		if(array[0][2]==array[1][2] && array[1][2]==array[2][2] && array[2][2]!="5")
			return true;
		if(array[0][0]==array[1][1] && array[1][1]==array[2][2] && array[0][0]!="5")
			return true;
		if(array[2][0]==array[1][1] && array[1][1]==array[2][0] && array[2][0]!="5")
			return true;
		if(array[1][0]==array[1][1] && array[1][1]==array[1][2] && array[1][0]!="5")
			return true;
		if(array[0][1]==array[1][1] && array[1][1]==array[2][1] && array[1][1]!="5")
			return true;
		return false;
	}
	public static void show(String array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		String tic_tac[][] = new String[3][3];
		for (int i = 0; i < tic_tac.length; i++) {
			for (int j = 0; j < tic_tac.length; j++) {
				tic_tac[i][j] = "5";
			}
		}
		int chances = 9;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name.");
		String player = sc.nextLine();
		String p = "X";
		String c = "O";
		while(true)
		{
			System.out.println(player+" please enter the Co-ordinate");
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(tic_tac[x][y]=="5")
			{
				tic_tac[x][y] = p;
				chances--;
			}
			else
			{
				System.out.println("This co-ordinate is already occupied");
				continue;
			}
			show(tic_tac);
			if(chances==0)
			{
				System.out.println("Game Draw");
				return;
			}
			if(win(tic_tac))
			{
				System.out.println(player+" Wins");
				return;
			}
			System.out.println("------------------------------------------------");
			System.out.println("------------------------------------------------");
			System.out.println("Computer's Chance to Play");
			while(true)
			{
				Random rm = new Random();
				int n = rm.nextInt(3);
				int m = rm.nextInt(3);
				System.out.println(n+" "+m);
				if(tic_tac[n][m]=="5")
				{
					tic_tac[n][m] = c;
					chances--;
					show(tic_tac);
					if(chances==0)
					{
						System.out.println("Game Draw");
						return;
					}
					Thread.sleep(1000);
					if(win(tic_tac))
					{
						System.out.println("Computer Wins");
						return;
					}
					break;
				}
				else
					continue;
			}
		}
	}
}
