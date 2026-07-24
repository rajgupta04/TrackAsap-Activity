# Coin change problem: Minimum number of coins

the figuring out the initialization was the key part of this problem statement ,
suppose for the first row there aren't any coin so how many coin are required if you have zero coin 
technically invalid question but Mathematically answer is infinity 
so we did initialized with infinity 
and for the second row we have the obvious answer also that we have only one type of coin so ans would be obvious nnnn then just check if it is divisible take the value else it's impossible to achieve the exact amount using that one type of coin 
so mathematically it's infinity too!
that's
it now it's upon us just pick the min
Min(dp[i][j-coins[i] + 1 , dp[i-1][j]);
+1 means hell yeah we are taking this coin!!