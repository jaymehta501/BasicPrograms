package Evernote;

/*Algorithm:
1) Construct a temporary array left[] such that left[i] contains product of all elements on left of arr[i] excluding arr[i].
2) Construct another temporary array right[] such that right[i] contains product of all elements on on right of arr[i] excluding arr[i].
3) To get prod[], multiply left[] and right[]. */


class ProductArray 
{
    /* Function to print product array for a given array
       arr[] of size n */
    void productArray(int nums[]) 
    {
    	int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }

        for (int p = 0; p<res.length; p++) {
        	System.out.print(res[p] + " ");
        }
    }
 
    /* Driver program to test the aboe function */
    public static void main(String[] args) 
    {
        ProductArray pa = new ProductArray();
        int arr[] = {12, 9, 8, 20, 11};
        int n = arr.length;
        System.out.println("The product array is : ");
        pa.productArray(arr);
    }
}
