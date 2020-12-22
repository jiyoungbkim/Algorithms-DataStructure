# N개의 최소공배수
from math import *

def solution(arr):
    def lcm(x, y):
        return x * y // gcd(x,y)
    
    while len(arr) > 1:
        arr.append(lcm(arr.pop(),arr.pop()))
    return arr[0]

from functools import reduce

def nlcm(num):
    return reduce(lambda acc, cur : acc * cur // gcd(acc, cur), num)