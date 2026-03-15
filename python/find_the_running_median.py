# The median of a set of integers is the midpoint value of the data set for which an equal number of integers are less than and greater than the value. To find the median, you must first sort your set of integers in non-decreasing order, then:
#
# If your set contains an odd number of elements, the median is the middle element of the sorted sample. In the sorted set ,  is the median.
# If your set contains an even number of elements, the median is the average of the two middle elements of the sorted sample. In the sorted set ,  is the median.
# Given an input stream of  integers, perform the following task for each  integer:
#
# Add the  integer to a running list of integers.
# Find the median of the updated list (i.e., for the first element through the  element).
# Print the updated median on a new line. The printed value must be a double-precision number scaled to  decimal place (i.e.,  format).
# Example
#
# Sorted          Median
# [7]             7.0
# [3, 7]          5.0
# [3, 5, 7]       5.0
# [2, 3, 5, 7]    4.0
# Each of the median values is stored in an array and the array is returned for the main function to print.
#
# Note: Add formatting to the print statement.
#
# Function Description
# Complete the runningMedian function in the editor below.
#
# runningMedian has the following parameters:
# - int a[n]: an array of integers
#
# Returns
# - float[n]: the median of the array after each insertion, modify the print statement in main to get proper formatting.
#
# Input Format
#
# The first line contains a single integer, , the number of integers in the data stream.
# Each line  of the  subsequent lines contains an integer, , to be inserted into the list.
#
# Constraints
#
# Sample Input
#
# STDIN   Function
# -----   --------
# 6       a[] size n = 6
# 12      a = [12, 4, 5, 3, 8, 7]
# 4
# 5
# 3
# 8
# 7
# Sample Output
#
# 12.0
# 8.0
# 5.0
# 4.5
# 5.0
# 6.0
#!/bin/python3

import math
import os
import random
import re
import sys


#
# Complete the 'runningMedian' function below.
#
# The function is expected to return a DOUBLE_ARRAY.
# The function accepts INTEGER_ARRAY a as parameter.
#

def runningMedian(a):
    array_aux = []
    results = []
    for i in a:
        array_aux.append(i)
        array_aux.sort()

        size = len(array_aux)
        meio = size // 2

        if size % 2 != 0:
            res = float(array_aux[meio])
        else:
            a = float(array_aux[meio])
            b = float(array_aux[meio - 1])
            res = float((a + b) / 2)

        results.append(res)

    return results


if __name__ == '__main__':

    a = [12, 4, 5, 3, 8, 7]

    result = runningMedian(a)

    for r in result:
        print(f"{r:.1f}")