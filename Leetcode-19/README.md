# Leetcode19
Remove Nth node from the end of the list

The solution is based on the idea of two pointers. 

- 1st Step:
    + Initialize all the necessary variables (nodes and numberOfNodes)
      
- 2nd Step:
    + Find the numberOfNodes by traversing through the LinkedList while updating the numberOfNodes
- 3rd Step: (Make use of the two pointers currObj and prevObj)
    + Set back the currObj to the head then traverse again with the decreasing numberOfNodes (decrease numberOfNodes by 1 whenever currObj is updated)
    + If the numberOfNodes matches with input n, which means the node at that position needs to be removed.
          ---> Simply change the next reference of prevObj to the currObj.next (In other word, skip the currObj or the node at that position).

- Final step:
    + Return the dummyHead.next;
