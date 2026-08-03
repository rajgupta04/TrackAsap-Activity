# Evaluate Expression to True Boolean Parenthesization Memoization

Somehow i am doing these problem on my own idk the feeling is strange Something Something.......
so the idea was here the mcm is used 
we are only evaluating at the operator question is in such a way that there is operator after every T F
so, we did k=i+1; k<j; k+=2 

and checked lt,lf,rt,rf 
base case was very crucial :
if(i>j) return 0; // if it's going out rarely happens
if(i==j) return (curr==(s.charAt(i)=='T')) ? 1 : 0 ; // if curr is true and char is true then yeah we can , if curr is false and character is also false  then yeah you got one 
other wise notttt

yeah will need revisitssss!