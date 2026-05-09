public class MonkeyProblem {
    public static void main (String[] args) {
        int n=3;
        int k=2;
        int j=2;
        int m=3;
        int p=1;

        int i=Math.floorDiv(m,k);
        int t=Math.floorDiv(p,j);
        int r1 = (m-(k*i));
        int r2 = (p-(j*t));
        int ans=0;
        if(r1!=0 || r2!=0){
            ans = i+t+1;
        }
        else{
            ans = i+t;
        }
        System.out.println(r1+" "+r2+" "+i+" "+t);
        if((n-ans)<=0){
            System.out.println(0);
        }
        else
        System.out.println(n-ans);
    }
}
