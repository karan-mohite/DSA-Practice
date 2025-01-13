public class sumottwonumber {
    public static void main(String[] args) {
        int arr[]={10,20,40,100,150};
        int sum=170;
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
             for(int j=0;j<arr.length;j++)
             {
                if(arr[i]+arr[j]==sum && arr[i]<arr[j])
                {
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                    flag=1;
                    break;
                }
             }           
        }
        if(flag==0)
        {
            System.out.println("No such pair found");
        }   
    }
}
