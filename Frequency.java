// ptogram to count frequency of elements in an array

class Frequency {
    public static void main(String[] args) {
    int arr[]={2,5,7,5,3,8,9,3,8,4,2,6,7,8,4,2};
    int hashtable[]=new int[100];
    for(int i=0;i<arr.length;i++)
    {
        hashtable[arr[i]]++;
    }
    for(int i=0;i<hashtable.length;i++)
    {
        if(hashtable[i]!=0)
        {
            System.out.println(i+" freq "+hashtable[i]);
            System.out.println();
        }
    }
    }
}