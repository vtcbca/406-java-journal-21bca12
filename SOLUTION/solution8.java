import java.util.*;
class StudDetail{
    public static void main(String args[]){
        // String[] StdName=new String[10];
        // int[] age=new int[10];
        String StdName[]={"chetan","brijesh","shivraj","yash","vivek","kamlesh","ajay","chandresh","chandratre","divyang"};
        int age[]={18,18,18,18,17,19,19,19,18,20};
        int n=9;
        String temp;
        for (int i=0; i<=n;i++) {
            for (int j=i+1;j<=n;j++){               
                // to compare one string with other strings
                if (StdName[i].compareTo(StdName[j]) > 0) {
                    // swapping
                    temp = StdName[i];
                    StdName[i] = StdName[j];
                    StdName[j] = temp;
                }
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                int temp1;
                if(age[i]>age[j]){
                    temp1=age[i];
                    age[i]=age[j];
                    age[j]=temp1;
                }
            }
        }
        System.out.println("Names & Age in descnding order.");
        System.out.println("Names\t\t\tAge");
       	for (int i = n; i >=0; i--) {
            System.out.println(StdName[i]+"\t\t\t"+age[i]);
        }

    }
}