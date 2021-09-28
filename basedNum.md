**the Basics of Binary**

#0.
"Base" in base-x number system means that the number is being represented as a geometric series with 'wonky' coefficients—basically they are not uniform in any way, only the exponential part of each term is normal. Each coefficient must be between 0 and the base itself, not including the base. The coefficients, if taken (in standard form) from left to right and strung together in a chronological manner, form a number in the base in question.

#1.
Binary is a base two number system; we care about binary because it makes computing easier. It makes computing easier because it mimics the two states found in virtually all electrical components we have today in classical computers, on and off(or pos/neg/neut. charged). These two states are found in transistors, the core of the modern computing world from an engineering point of view. This biomimicry makes it easier for us and consequently also for computers to interpret and manipulate the responses they receive from electrical components into something usable in code.

#2.
Starting from the right, go through and find the following sum: Let d_i be the digit i places from the right. Let the number we are starting with be n digits long.

```
x_2 = Sum_[start at i = 0, continue until i = n-1] 2^i •d_i = y_10 —> our initial number converted to  	base 10
```

#3.
Take the largest power of 2 that fits into our base 10 number, write a 1 if it is valid—that is if the difference between our base 10 number and the power of 2 is positive. Continue to the next largest power of 2, if it is less than our original base 10 number minus the previous power(s) of 2, then write a 1 to the right; otherwise write a 0. Continue recursively until you reach a difference of 1, at which point add a 1 to the end of your number and voíla you have found your base 10 number, now in base 2.
