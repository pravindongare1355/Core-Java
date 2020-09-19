import java.util.*;

public class SortArrayDesc{
    public static void main(String[] args) {
     
        int arr[] = {30,10,40,5,50,11,55,77,70,80};
        int min;
        int x=0;
       	
	for(int j=0;j<9;j++)     /* Sorting using selection sort */
	{	min = arr[j];
		for(int i=j+1;i<=9;i++)
		{	if(arr[i]>min)
			{	min = arr[i];
			}
		}
		for(int i=0;i<=9;i++)
		{	if(arr[i] == min)
			{	x = i;
			}
		}
		int temp;
		temp=arr[j];
		arr[j]=arr[x];
		arr[x]=temp;
	}
	
	for(int i=0;i<10;i++)
	{	System.out.println("Array Order in Desc:"+arr[i]);
	}
        }
    }