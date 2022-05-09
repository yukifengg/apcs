Chocolate Freds:: Anjini, Yuki, Hamim
APCS pd08
HW93 -- exploring tree properties, extracting actionable intel from traversals
2022-05-06f
time spent: 0.8 hrs


DISCO
------------------------------------------------
* Back tracing trees are hard
* you can use In-order, post-order, or pre-order to describe any type of tree
* Perfect trees are balanced but balanced trees don't have to be perfect
================================================


QCC
------------------------------------------------
* Do balanced trees need to have every level completed?
* Is there a more techinical/better answer to Q3?
* What does full mean exactly? Does it refer to the number of nodes, in that 
  every node must have a right and left subtree unless its the heighest 
  row of nodes? 
================================================


SELF-ASSESSMENT PROMPTS
------------------------------------------------
In which direction does a tree grow?
 - A tree grows downwards. Or, away from the root. 

Provide as many alternate definitions as you can for "tree," using graph terminology 
("closed/open tours", "paths", "cycles", etc). Maximize clarity, succinctness.
 - A tree is a series of nodes that are grown vertically, while utilizing paths 
   to relate them.

Why is a balanced tree allowed a difference of 1 in height between right and left 
subtrees?
 - Because of the definition of a balanced tree, which states that if the left 
   and right subtrees of a node have a height difference that is equal to or less
   than 1, the tree is balanced.

Alternate (equivalent, but more succinct?) definitions of "balanced" tree?
 - In a balanced tree, node in the second to last level don't need to have both 
   a right and a ledt subtree. All other nodes higher than the second to lest 
   level must have one. 

Is a perfect tree complete? 
 - Yes, it is. 

Is a complete tree balanced? 
 - Yes, but balanced trees don't have to be complete

Is the Man Who Is Tall Happy?
 - Yes, but if he's not, he should seek happiness

What must be true of perfect trees but not others?
 - Perfect trees must have all levels be full

================================================


C'EST POSSIBLE?
------------------------------------------------
Yes, it is possible:

	E
	 \ 
	  G
	 /
	D
       / \
      K	  I
	 / \
	N   L
     / \
    O   W

================================================
