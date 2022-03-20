import java.util.*;
class Solution{
    static String solve(String numStr){
        long x=0;
        for(int i=0;i<numStr.length();i++){
            x+=Character.getNumericValue(numStr.charAt(i));
        }
        long num=(long)9-(x%9);
        String str=new String(numStr);
        int n=str.length();
        if(num==9){
            str=str.substring(0,1)+String.valueOf("0")+str.substring(1);
            return str;
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            int temp=Character.getNumericValue(str.charAt(i));
            if(temp>num){
                flag=true;
                str=str.substring(0,i)+String.valueOf(num)+str.substring(i);
                break;
            }
        }
        if(flag)
            return str;
        return str+String.valueOf(num);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int test=0;test<x;test++){
            String num=sc.next();
            System.out.println("Case #"+(test+1)+": "+solve(num));
        }
    }
}
