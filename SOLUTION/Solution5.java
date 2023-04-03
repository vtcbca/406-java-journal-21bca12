class oddexcep extends Exception{
    oddexcep(String str){
        System.out.println(str);
    }
}
class exceptionhandle{
    public static void main(String args[]){
        int a=Integer.parseInt(args[0]);
        try
          {
            if(a%2==0){
                System.out.println("The "+a+" is Even.");
            }
            else{
                throw new oddexcep("the following number is odd.");
            }

        }
        catch(oddexcep e){
            System.out.println(e);
        }

    }
}