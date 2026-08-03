# Scramble String Memoization

The hardest part of this problem is understanding the swap case. I initially used k to split both strings in every case, but in the swapped scenario, the left part of s1 (which has k characters) should be compared with the last k characters of s2. This is why we use s2.substring(n-k, n) instead of s2.substring(k, n).

The recursion always splits s1 at index k. Only the way s2 is divided changes:

In the no-swap case, compare left with left and right with right.
In the swap case, compare the left part of s1 with the last k characters of s2, and the right part of s1 with the remaining first n-k characters of s2.

For memoization, the subproblem is uniquely identified by the pair (s1, s2), so a HashMap<String, Boolean> works well. Always use a separator in the key (e.g., s1 + "#" + s2) to avoid collisions.

Before making recursive calls, compare the character frequencies of both strings. If the frequencies don't match, return false immediately. This pruning avoids exploring impossible branches and significantly reduces the number of recursive calls.

Finally, remember to store the computed result in the memoization map before returning, otherwise the same subproblem will be solved repeatedly.