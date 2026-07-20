# Count the number of subset with a given difference

Partition with Given Difference

s1 - s2 = diff
s1 + s2 = totalSum
=> s1 = (totalSum + diff) / 2

Count subsets with sum = (totalSum + diff) / 2.

Edge cases:
- If diff > totalSum → answer = 0
- If (totalSum + diff) is odd → answer = 0

If array contains 0s, don't special-case them.
The standard DP transition automatically doubles the count when including/excluding 0.