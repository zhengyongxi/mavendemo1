package com.nowcoder.mavendemo1;

import java.util.Scanner;

public class test {
    private static int type;
    static String result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 =sc.nextLine();
        String s2 =sc.nextLine();
        String [] str1=s1.split(",");
        result="";
        for (int i = 0; i < str1.length; i++) {
            find(s2,str1[i]);
        }
        if (result.length()>0){
            System.out.println(result.substring(0,result.length()-1));
        }else {
            System.out.println(" ");
        }
    }
    public static void find(String s2,String str11){
        String[] str2=str11.split(" ");
        type=0;
        dsp(s2,str2,0,s2.length(),0,str2.length,0);
        if (type==1){
            result=result+str11+",";
        }
    }
    public static void dsp(String s2,String[] str2,int indx1,int len1,int indx2,int len2,int indx3){
        if (type==1){
            return;
        }
        if (s2.charAt(indx1)==str2[indx2].charAt(indx3)){
            if (indx1==len1-1||indx2==len2-1){
                if ((indx1==len1-1)&&(indx2==len2-1)) {
                    type = 1;
                    return;
                }
                return;
            }
            if (indx3<str2[indx2].length()-1){
                dsp(s2,str2,indx1+1,len1,indx2,len2,indx3+1);
            }
            dsp(s2,str2,indx1+1,len1,indx2+1,len2,0);
            dsp(s2,str2,indx1+1,len1,indx2+1,len2,0);
        }
    }
}
