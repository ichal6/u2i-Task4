class Solution {
    public int solution(int[] A) {
        int length = A.length;
        int maxSlice = 1;
        int sliceLength = 1;
        boolean isUp = A[0] < 0;

        for (int i = 0; i < length - 1; i++) {
            if(!isUp && A[i] >= 0 && A[i+1] <= 0){
                sliceLength+=1;
                isUp = true;
            } else if(isUp && A[i] <= 0 && A[i+1] >= 0){
                sliceLength+=1;
                isUp = false;
            } else{
                maxSlice = sliceLength > maxSlice ? sliceLength : maxSlice;
                sliceLength = 1;
                isUp = A[i+1] < 0;
            }
        }
        return sliceLength > maxSlice ? sliceLength : maxSlice;
    }
}

