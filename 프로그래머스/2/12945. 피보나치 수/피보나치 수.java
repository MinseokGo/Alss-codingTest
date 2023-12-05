class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        
        answer = arr[n];
        
        return answer % 1234567;
    }
}