public class RotateArray1 {
        public void RotateArray1(int arr[],int mid)
        {
            for(int i=1;i<=mid;i++)
            {
                int temp=arr[0];
                int j;
                for(j=1;j<arr.length;j++)
                {
                    arr[j-1]=arr[j];

                }
                arr[j-1]=temp;
            }
        }
}
