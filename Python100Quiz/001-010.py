# 001
nums = [100, 200, 300, 400, 500]
nums.remove(400)
nums.remove(500)
print(nums)

# 002
l = [200, 100, 300]
l.insert(2, 10000)
print(l)

# 008
d = {'height':180,'weight':78,'weight':84,'temparture':36,'eyesight':1}
print(d['weight']) 

#009
year = '2019'
month = '04'
day = '26'
hour = '11'
minute = '34'
second = '27'

print(year, month, day, sep="/", end=" ")
print(hour, minute, second, sep=":")

#010
star = int(input("몇 줄?"))
for i in range(1, star+1):
    print(" " * (star-i) + "*" * (i+i-1))