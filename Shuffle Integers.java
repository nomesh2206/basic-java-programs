class  Solution
{
    void shuffleArray(long arr[], int n)
    {
        // Your code goes here
        int x = 50000;
	    for(int i=0; i<n/2; i++)
	    {
	        arr[i] = arr[i] + arr[n/2+i]*x;
	    }
	    
	    int j = n-1;
	    for(int i=n/2-1; i>=0; i--)
	    {
	        arr[j] = arr[i]/x;
	        arr[j-1] = arr[i]%x;
	        j = j-2;
	    }
    }
}
