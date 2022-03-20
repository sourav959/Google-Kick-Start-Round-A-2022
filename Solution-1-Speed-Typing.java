import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int test=0;test<x;test++){
            String str1=sc.next();
            String str2=sc.next();
            int m=str1.length(),n=str2.length();
            int i=0,j=0,ans=0;
            while(j<n && i<m){
                if(str1.charAt(i)==str2.charAt(j))
                    i++;
                else
                    ans++;
                j++;
            }
            if(i==m){
                System.out.println("Case #"+(test+1)+": "+(ans+n-j));
            }else{
                System.out.println("Case #"+(test+1)+": IMPOSSIBLE");
            }
        }
    }
}
