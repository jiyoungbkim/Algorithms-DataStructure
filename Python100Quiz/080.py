# 080
from itertools import combinations

consonant = input('consonant: ').split(',')
n = int(input('n : '))

print(list(map(''.join, combinations(consonant, n))))

import itertools

print(list(map(''.join, itertools.combinations(consonant, n))))