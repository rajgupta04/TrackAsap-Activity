# Count of Subsets Sum with a Given Sum

In starting checked notes key was to treat 1 for true an 0 for false butttttt
Counterexample
arr = [0, 0]
target = 0

How many subsets have sum 0?

{}
{0(first)}
{0(second)}
{0(first), 0(second)}

Answer = 4

But our initialization fixes

dp[0][0] = 1
dp[1][0] = 1
dp[2][0] = 1

so it can never become 4.

so, we only do dp[0][0] =1 and 
i will start from 1 but j will start from 0.