# Longest Common Subsequence Top Down

Holyyyy what's this literally i was feeling sleepy i did all three approach by myself!!
Small win vallahhhh
so the idea is i tabulated first row and column to zero as there is no other string means nothing to match then just used i-j loop and if both matched 
did 1 + ↖ (dp[i-1][j-1]) when it was one less 
if not matched then max( ↑dp[i-1][j] , ← dp[i][j-1] )