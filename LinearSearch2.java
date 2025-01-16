public class LinearSearch2
 {
    public static void main(String[] args)
     {
        int arr[] = { 10, 20, 30, 40, 50 };
        int n=100;
        int i;
        for (i = 0; i < arr.length; i++) 
        {
            if (arr[i]==n)
            {
                System.out.println("Found..!!!");
                break;
              
            }
        }
        if (i ==arr.length) {
            System.out.println("Not Found..!!!");
        }
    }   
}
