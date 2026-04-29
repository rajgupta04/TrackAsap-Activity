# Longest Substring Without Repeating Characters

stucked in start pointer updation:
-> failing suppose the window is already Passed and we are getting index that is lower than the actual window start


fix:

  if(map.containsKey(c)){
                start=Math.max(start,map.get(c)+1);
                
            }
