package com.nowcoder.mavendemo1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int n = 1;
        int m = 4;
        String[][] map = {{">",">",">",">"}};
        int sx = 0;
        int sy = 0;
        int k =10000;
        int[] res = run(map,sx,sy,k);
        System.out.println( res[0]+" "+res[1] );
    }
    public static int[] run(String[][] map , int sx, int sy, int k) {
        int ex = 0;
        int ey = 0;
        int[] end = {ex,ey};
        int[] start = {sx,sy};
        for (int i = 0; i < k; i++) {

        }
        return end;
    }
}
