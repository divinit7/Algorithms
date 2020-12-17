//using a prefix array
//i.e. for every index ‘i’ of the array ‘arr[]’, create a prefix array to store the XOR of all the elements from left end of the array ‘arr[]’ up to the ith element of ‘arr[]’.
//Creating a prefix array will take a time of O(N).
public class Xorqueriesofsubs {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int prefix[] = new int[arr.length+1];

        for(int i = 0; i < arr.length; i++)
            prefix[i+1] = prefix[i] ^ arr[i];

        int ans[] = new int[queries.length];

        for(int i = 0; i < queries.length; i++)
            ans[i] = (prefix[queries[i][1] + 1] ^ prefix[queries[i][0]]);

        return ans;
    }
}
