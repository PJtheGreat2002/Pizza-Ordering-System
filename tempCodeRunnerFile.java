import java.util.*;

public class Status
{
    public static void main(String[] args)
    {

        int arr1[] = {1,5,2,2,6,3,9,0,1};
        int arr2[] = {4,1,5,1,7,1,2,9,2};

        int count = 0;
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    count++;
                    break;
                }else
                    i++;
            }
        }

        System.out.println("Output : "+ count);
    }
}