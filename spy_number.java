import java.util.*;
class spy_number{
    void check(int x){
        int a=0,s=0,p=1;
        while(x!=0){
            a=x%10;x/=10;
            s=s+a;p=p*a;
        }if(s==p){
            System.out.println("number is spy");
        }else{
             System.out.println("number is not spy");
        }
    }public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        spy_number ob = new spy_number();
        System.out.println("Enter a number");
        int n = sc.nextInt();
        ob.check(n);
    }
}