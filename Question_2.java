import java.util.Scanner;
class Question_2
{
    public static void insert_num(int arr[],int num, int index){// a function to add the given number at given index location 
        int newarr[]=new int[7];//to create a new array with an increment in the array size
        for(int x=0;x<7;x++)
        {
            //checking the respective conditions for moving the elements of the array
            if(x<index-1)
            newarr[x]=arr[x];
            else if(x == index-1)
            newarr[x]=num;
            else
            newarr[x]=arr[x-1];
        }
        for(int x=0;x<newarr.length;x++)//for printing the elements of the array
        System.out.println(newarr[x]);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6};//creating an initialized array
        System.out.println("Enter a number:");//storing the number to be inserted in the array
        int n=sc.nextInt();
        System.out.println("Enter index:");//to store the index at which the given number should be stored
        int i=sc.nextInt();
        insert_num(arr,n,i);//passing the entered values function parameters
    }
}