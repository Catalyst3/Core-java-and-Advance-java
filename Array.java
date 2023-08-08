package BasicOperation;

public class Array {
   public int length = 0;
    int[] arr;

    public Array(int[] arr) {
        this.arr = arr;
    }

    public void insert(int element) {
        // Check if the array is already full before inserting
        if (length == arr.length) {
            System.out.println("Array is already full. Cannot insert more elements.");
            return; // Add this line to stop the insertion process
        }

        // Insert the element at the end of the array
        arr[length] = element;
        length++;
    }
    public void print()
    {
    	for(int i =0;i<length;i++)
    	{
    		System.out.print(arr[i]+",");
    	}
    }
    public int search(int index)
    {
    	int temp = -1;
    	temp=arr[index];
    	return temp;
    }
    public void insertAtIndex(int index,int value)
    {
    	for(int i=length-1;i>=index;i--)
    	{
    		arr[i+1]=arr[i];
    		if(i==index)	
    		{
    			arr[i]=value;
    		}
    	}
    	length++;
    }
    public boolean deleteAtIndex(int index)
    {
    	if(index<0 || index>length) return false;
    	for(int i=index; i<length;i++)
    	{
    		arr[i]=arr[i+1];
    	}
    	length--;
		return true;
    }
    public boolean updateAtIndex(int index,int value)
    {
    	if(index<0 || index>length) return false;
    	arr[index]=value;
    	return true;
    }
    
}
