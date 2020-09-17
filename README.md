# Foundations-of-Algorithms
The objective of this project is to develop an algorithm to have a fixed partition memory management for the provided input files.

## OBJECTIVE
Develop  an algorithm to have a fixed partition
memory management for the input files given.
## METHODOLOGY
A technique used in early multiprogramming operating systems involved
partitioning the available primary memory into a number of regions with each
region having a fixed size, different regions potentially having different sizes. The
sum of the sizes of all regions equals the size of the primary memory.

Given a set of programs, it was the task of the operating system to assign the
programs to different memory regions, so that they could be executed concurrently.
This was made difficult due to the fact that the execution time of a program might
depend on the amount of memory available to it. Every program has a minimum
space requirement, but if it is assigned to a larger memory region its execution time
might increase or decrease.

In this program, you have to determine optimal assignments of programs to
memory regions. Your program is given the sizes of the memory regions available
for the execution of programs, and for each program a description of how its’
running time depends on the amount of memory available to it. Your program has
to find the execution schedule of the programs that minimizes the average
turnaround time for the programs. An execution schedule is an assignment of
programs to memory regions and times, such that no two programs use the same
memory region at the same time, and no program is assigned to a memory region of
size less than its minimum memory requirement. The turnaround time of the program is the difference between the time when the program was submitted for
execution (which is time zero for all programs in this problem), and the time that the
program completes execution.

## INPUT
The input data will contain multiple test cases. Each test case begins with a line
containing a pair of integers m and n. The number m specifies the number of
regions into which primary memory has been partitioned (1 <= m<= 10), and n
specifies the number of programs to be executed (1 <= n<= 50).

The next line contains m positive integers giving the sizes of the m memory
regions. Following this are n lines, describing the time -space tradeoffs for each of
the n programs. Each line starts with a positive integer k (k <= 10), followed by k
pairs of positive integers s1,t1,s2,t2,…,sk,tk, that satisfy si < si+1 for 1 <= i < k .
The minimum space requirement of the program is s1, i.e. it cannot run in a
partition of size less than this number. If the program runs in a memory partition of
size s, where si <= s < si+1 for some i, then its execution time will be ti. Finally,
if the programs runs in a memory partition of size sk or more, then its execution
time will be tk.

A pair of zeroes will follow the input for the last test case.

You may assume that each program will execute in exactly the time specified for the
given region size, regardless of the number of other programs in the system. No
program will have a memory requirement larger than that of the largest memory
region.

## OUTPUT

For each test case, first display the case number (starting with 1 and increasing
sequentially). Then print the minimum average turnaround time for the set of
programs with two digits to the right of the decimal point. Follow this by the
description of an execution schedule that achieves this average turnaround time.
Display one line for each program, in the order they were given in the input that
identifies the program number, the region in which it was executed (numbered in
the order given in the input), the time when the program started execution, and
the time when the program completed execution. Follow the format shown in the
sample output, and print a blank line after each test case.

If there are multiple program orderings or assignments to memory regions that yield
the same minimum average turnaround time, give one of the schedules with the
minimum average turnaround time.

![Capture](https://user-images.githubusercontent.com/49120359/93498874-f3f63700-f92f-11ea-902e-c5da120a7297.PNG)

