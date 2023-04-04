# Task 4

An array A consisting of N integers is given. A pair of integers (P, Q), such that 0 <= P <= Q < N, is called a slice of Array A. A slice is called alternating if the signs of its consecutive elements alternate.

More precisely, slice (P, Q) is alternating if:
- A[P] >= 0, A[P+1] <= 0, A[P+2] >= 0 and so on up to A[Q], or
- A[P] <= 0, A[P+1] >= 0, A[P+2] <= 0 and so on up to A[Q]

```Note that 0 is treated as both positive and negative.```

### Write a function:

``` java
class Solution { public int solution(int[] A); }
```

that given A consisting of N integers, return the size of the largest alternating slice in A.

For example:
``` java
Solution solution = new Solution();

solution.solution(new int[]{5, 4, -3, 2, 0, 1, -1, 0, 2, -3, 4 ,-5}); should return 7
solution.solution(new int[]{1, 2, 3}); should return 1
```
Write efficient algorithm for the following assumptions:
1. N is an integer within range [1 .. 100000]
2. each element of array A is an integer within range [-1,000,000,000 .. 1,000,000,000]