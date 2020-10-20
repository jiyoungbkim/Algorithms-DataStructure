# 041
n = int(input("isPrime : "))
b = True
for i in range(2, n//2 +1):
    if (n % i) == 0:
        b = False
print("YES") if b == True else print("NO")

# 042
from datetime import *
week = ['MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT', 'SUN']
m = int(input("month : "))
d = int(input("day : "))
day = date(2020, m, d)
print(week[day.weekday()])

# 043
n = int(input("binary : "))
def binary(n):
    if n < 2:
        return str(n)
    else:
        return str(binary(n//2)) + str(n%2)
print(binary(n))

# 044
n = input("sum : ")
l = []
for i in range(len(n)):
    l.append(int(n[i]))
print(sum(l))

n = list(map(int,input()))
result = 0
for i in n:
	result += i	
print(result)

# 045
import time
t = time.time()
t = int(t//(3600*24*365))+1970
print(t)

# 046
result = ''
hap = 0
for i in range(1, 101):
    result += str(i)
for i in result:
    hap += int(i)        
print(hap)

# 047
people = [
         ('이호준', '01050442903'),
         ('이호상', '01051442904'),
         ('이준호', '01050342904'),
         ('이호준', '01050442903'),
         ('이준', '01050412904'),
         ('이호', '01050443904'),
         ('이호준', '01050442903'),
         ]
print(len(set(people)))

# 048
al = input("uplow : ")
result = ''
for i in al:
    if i.isupper():
        result += i.lower()        
    else:
        result += i.upper()
print(result)

# 049
n = list(map(int, input("max : ").split()))
print(max(n))