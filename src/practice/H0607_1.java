package practice;

public class H0607_1 {

	public static void main(String[] args) {
		int size = 5;
		for( int i = 0 ; i < size ; i++ ){
		    for( int j = 0 ; j < size ; j++ ){
		        if( i == j || ( size - i - 1 ) == j )//i==jが左上から右下の線を描く。(size - i - 1 ) == jが右上から左下への線を描く。
		        	//(size - i - 1 )は4,3,2,1を表す式
		            System.out.print( "X" );
		        else
		            System.out.print( " " );
		    }
		    System.out.println( "" );
		}
		System.out.println();
		System.out.println();
		for( int p = 1 ; p <= 9 ; p++ )
		{
		    for( int q = 1 ; q <= 9 ; q++ )
		        System.out.printf(" %2d", p * q );

		    System.out.println();
		}
		System.out.println();
		System.out.println();

		int n = 20100;
		for( int x = 2 ; n > 1 ; x++ ){
		    while( ( n % x ) == 0 ){
		        System.out.print( x + " " );
		        n /= x;
		    }
		}

	}

}
