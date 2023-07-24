import java.util.Scanner;

class Prime{
    public static int countPrime(int n){
        int count=0;
        if(n<=2){
            count=0;
        }
        if(n>3){
            for(int i=2;i<n;i++){
                int c=0;
                for(int j=2;j<i;j++){
                 if(i%j==0){
                     c++;
                 }
                }
                if(c==0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(countPrime(n));
    }
}
