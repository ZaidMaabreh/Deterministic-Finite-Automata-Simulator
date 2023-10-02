# Deterministic-Finite-Automata-Simulator

A program that can simulate DFAs with States, Arcs, Alphabets.
And check if a given string is accepted by the automata or not

Example Run:
this example is an automaton that only accepts strings ending with "b" or empty

-------------------------

Please enter the language alphabet concatenated ex: ab , 01 , abc

ab

------------------------

Please enter the number of states in the automaton

2

Enter the state number (integer) and if its a start state 0 or 1 and if its a final state 0 or 1
Eample: 1 0 0 , 0 0 1

0 true true

Enter the state number (integer) and if its a start state 0 or 1 and if its a final state 0 or 1
Eample: 1 0 0 , 0 0 1

1 false false

------------------------

Please enter the arcs (edges) in this format:
 symbol fromState toState ex: a 0 0 (loop)

Enter Arc:  
b 0 0

Enter Arc:  
a 0 1

Enter Arc:  
a 1 1

Enter Arc:  
b 1 0

------------------------

Please the number of inputs you want to check

5

------------------------

Enter the input to check:  

The string "" is Accepted

------------------------

Enter the input to check:  
abb

The string "abb" is Accepted

------------------------

Enter the input to check:  
aaab

The string "aaab" is Accepted

------------------------

Enter the input to check:  
aaaaaa

The string "aaaaaa" is Rejected

------------------------

Enter the input to check:  
aaaaaaba

The string "aaaaaaba" is Rejected

Process finished with exit code 0


