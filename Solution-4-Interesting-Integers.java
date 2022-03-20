import java.util.*;
class Solution{
    static boolean isInteresting(long num){
        long mul=1,sum=0;
        while (num != 0) {
            mul = mul * (num % 10);
            sum+=num%10;
            num = num / 10;
        }
        if(mul%sum==0)
            return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int test=0;test<x;test++){
            long num1=sc.nextLong(),num2=sc.nextLong();
            int ans=0;
            for(Long i=num1;i<=num2;i++){
                if(isInteresting(i))
                    ans++;
            }
            System.out.println("Case #"+(test+1)+": "+ans);
        }
    }
}
