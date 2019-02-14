package problem01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) 
	{
		

		int res=0;
		int clap=0;
		
		res = number %10;
		if(res ==3 || res==6 || res==9) clap++;
		res = number /10;
		if(res ==3 || res==6 || res==9) clap++;
		
		return clap;
		
			
		
	}
}