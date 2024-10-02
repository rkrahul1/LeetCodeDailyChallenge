class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] newArr = arr.clone();
        Arrays.sort(newArr);
        Map<Integer, Integer> mp = new HashMap<>();
        int i = 1;
        for(int val : newArr){
            if(!mp.containsKey(val))
                mp.put(val, i++);
        }

        for( i = 0 ; i < arr.length ; i++)
            arr[i] = mp.get(arr[i]);

        return arr;

    }
}
//TC : O(NlogN)
//Sc : O(N+S) : N = extra array + S space for sorting like QuickSort will take S = logN space