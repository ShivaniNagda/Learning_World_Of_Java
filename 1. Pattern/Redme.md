N = ?
1. i = Number of rows
2. j = Number of cols
3. prinf = What to print
<!-- Questions : 1 -->
Problem statement
Print the following pattern for the given N number of rows.

Pattern for N = 4
4444
4444
4444
4444
Detailed explanation ( Input/output format, Notes, Images )
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
7
Sample Output 1:
7777777
7777777
7777777
7777777
7777777
7777777
7777777
Sample Input 1:
6
Sample Output 1:
666666
666666
666666
666666
666666
666666

<!-- Solution : 1-->
Square Pattern
Problem Description: You are given with an input number N, then you have to print the given
pattern corresponding to that number N.
For example if N=4
Pattern output : 4444
 4444
 4444
 4444
How to approach?
1. Take N as input from the user.
2. Figure out the number of rows, (which is N here) and run a loop for that.
3. Now, figure out number of columns to be printed in ith row or generic row (which is the
N here) and run a loop for that within this.
4. Now, figure out “What to print?” in a particular (row, column). It can depend on the
column number, row number or N which is N here.
Pseudo code for the given problem:
input=N
i=1
While i is less than or equal to N:
 j=1
 While j is less than or equal to N:
 print(N)
 Increment j by 1
 Increment i by 1
 Add a new line here
❏ Let us dry run the Code for N=4
● i=1(<=4)
➔ j=1 (<=4), so print 4.
➔ j=2 (<=4), so print 4.
➔ j=3 (<=4), so print 4.
➔ j=4 (<=4), so print 4.
➔ j=5(>4), move out of the inner loop with a new line.
● i=2(<=4)
➔ j=1 (<=4), so print 4.
➔ j=2 (<=4), so print 4.
➔ j=3 (<=4), so print 4.
➔ j=4 (<=4), so print 4.
➔ j=5(>4), move out of the inner loop with a new line.
● i=3(<=4)
➔ j=1 (<=4), so print 4.
➔ j=2 (<=4), so print 4.
➔ j=3 (<=4), so print 4.
➔ j=4 (<=4), so print 4.
➔ j=5(>4), move out of the inner loop with a new line.
● i=4(<=4)
➔ j=1 (<=4), so print 4.
➔ j=2 (<=4), so print 4.
➔ j=3 (<=4), so print 4.
➔ j=4 (<=4), so print 4.
➔ j=5(>4), move out of the inner loop with a new line.
● i=5(>4), move out of the loop
So , final output:
4 4 4 4
4 4 4 4
4 4 4 4
4 4 4 4


<!-- Questions : 2 -->
Write a program that takes an integer n as input and prints a pattern like this:
if
input : 4
Output:
1111
2222
3333
4444

<!-- Questions : 3 -->
Write a program that takes an integer n as input and prints a pattern like this:
if input : 5
5
12345
12345
12345
12345
12345

<!-- Questions : 4 -->
Write a program that takes an integer n as input and prints a pattern like this:
if input : 5
Enter the number of rows & columns:
5
54321
54321
54321
54321
54321

<!-- Questions : 5 -->
Write a program that takes an integer n as input and prints a pattern like this:

4444
3333
2222
1111

<!-- Questions : 5 -->
Write a program that takes an integer n as input and prints a pattern like this:
Enter the number of rows & columns:
5
1
12
123
1234
12345


<!-- <!-- Questions : 6 -->
Write a program that takes an integer n as input and prints a pattern like this: -->
Enter the number of rows & columns:
5
1
12
123
1234
12345



<!-- <!-- Questions : 7 -->
Write a program that takes an integer n as input and prints a pattern like this: -->
Enter the number of rows & columns:
5
1
23
345
4567
56789
67891011

 <!-- Questions : 8 -->
Write a program that takes an integer n as input and prints a pattern like this: 
Enter the number of rows & columns:
5
1
23
456
78910
1112131415

 <!-- Questions : 9-->
Write a program that takes an integer n as input and prints a pattern like this: 
Enter the number of rows & columns:
6
A
BB
CCC
DDDD
EEEEE
FFFFFF

<!-- Questions : 10-->
Write a program that takes an integer n as input and prints a pattern like this: 
Enter the number of rows & columns:
5
1234****
123***
12**
1*
