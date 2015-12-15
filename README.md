# Practice 2015 - 05: You Wouldn’t Like Me When I’m Angry

## Background
Bruce Banner gets mad when he sees numbers that are sad during his calculations,
and he turns into the Hulk and smashes everything in his path. We want to make
sure he won’t get mad, so we need to write a program to determine if numbers are
happy or not before we let him see them.

“Happy Numbers” have been studied in the branch of mathematics known as Number
Theory (you don’t need to know what a happy number is for this problem). This
problem explores a variation on these numbers, which we will call “quasi-happy”
and “quasi-sad” numbers.

To determine if a number is quasi-happy, first break it into groups of two
adjacent digits; if there are an odd number of digits, the most significant
digit should be left by itself. For example, 123456 would split into three
groups: 12, 34, and 56. Likewise, 99941 would split into
three groups: 9, 99, and 41.

Next, square each of those groups and add them
together: 12 2 + 34 2 + 56 2 = 4436 and 9 2 + 99 2 + 41 2 = 11563, respectively.

You now have a new number. If you can repeat this process any number of times
and reach a value greater or equal to 50 and less than 100 (i.e., 50 ≤ x < 100),
then the number is “quasi-happy.” Similarly, if you can repeat this process any
number of times and reach a value less than 50, we call the number “quasi-sad”.
Continuing with our example from before: 99941 → 11563 → 4195 → 10706 → 86.

Thus, we can see that 99941 is a quasi-happy number, and it took four
iterations of our procedure to determine that fact.

There are some quasi-happy or quasi-sad numbers that require an enormous number
of iterations to validate, and it is possible for some numbers to be neither
quasi-happy nor quasi-sad. Thus, if it takes more than 1000 iterations of our
procedure to determine if a number is quasi-happy or quasi-sad, print “LONG”.

## Description

### Input
The first line of the file will have an integer, n, which is the number of
test cases in this file.

Each of the n lines that follow consist of a single integer x. That number
is guaranteed to fit in a int variable. To be more specific, x will
have a value between 0 and 2147483647.

### Output
For each x in the file, your program is to determine if it is quasi-happy,
quasi-sad, or too long to decide.

If the number is quasi-happy, print “QUASI-HAPPY: k”, where k is the number of
iterations of our procedure it took to find that result.

Similarly, if the number is quasi-sad, print “QUASI-SAD: k”, where k is the same
as before.

If it took more than 1000 iterations of our procedure to determine if a number
is in either category,
print “LONG”.

Note that it is possible for input to take 0 iterations to determine if a number
is quasi-happy or quasi-sad.

## Sample
### Input
```
6
1214829
995
1214831
986
1214837
```

### Output
```
QUASI-SAD: 41
QUASI-HAPPY: 26
QUASI-SAD: 46
LONG
QUASI-HAPPY: 10
QUASI-HAPPY: 0
```
