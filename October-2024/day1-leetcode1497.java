class Solution {
    public boolean canArrange(int[] arr, int k) {
        int [] mp = new int[k];
        for(int val : arr){
            int rem = ((val % k) + k) % k;
            mp[rem]++;
        }

        if(mp[0] % 2 != 0)
            return false;
        
        for(int i = 1 ; i <= k / 2 ; i++){
            if(mp[i] != mp[k - i])
                return false;
        }
        return true;
    }
}
//TC : O(N)
//Sc : O(N)