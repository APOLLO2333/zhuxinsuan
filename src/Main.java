import java.util.Scanner;

/**
 * Created by song2 on 2018/5/1.
 */
public class Main {
    public static void main(String args[]){
        class paixu{
            public int[] maopaopaixu(int[] arr){
                for (int i=0;i<arr.length;i++){
                    for (int j=i+1;j<arr.length;j++){
                        if (arr[i]>arr[j]){
                            int t=arr[i];
                            arr[i]=arr[j];
                            arr[j]=t;

                        }
                    }
                }
                return arr;
            }
        }
        paixu p=new paixu();
        Scanner scanner=new Scanner(System.in);
        int count=0;
        //int[] arr={4,1,2,3};
        //int n=arr.length;
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        p.maopaopaixu(arr);
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    if (arr[i]+arr[j]>=arr[k]){
                        if (arr[i]+arr[j]==arr[k]){
                            count++;
                            break;
                        }
                    }else {
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
