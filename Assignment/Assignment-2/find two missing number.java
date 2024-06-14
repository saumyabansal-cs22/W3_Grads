package bit_manipulation;

public class find_two_missing_number {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int n=6;
        two_missing(arr,n);
    }
    public static void two_missing(int[] arr,int n){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        for(int i=1;i<=n;i++){
            xor=xor^i;
        }
        int diff=xor&-xor;
        int d1=0;
        int d2=0;
        for(int i=1;i<=n;i++){
            if ((diff & i)==0){
                d1^=i;
            }
            else{
                d2^=i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if ((diff&arr[i])==0){
                d1^=arr[i];
            }
            else{
                d2^=arr[i];
            }
        }
        System.out.println(d1+" "+d2);
    }
}
