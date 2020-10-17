# 024
n = input("이름?")
print(n.upper())

# 025
def circle(n):
    return n * n * 3.14

print(circle(int(input("반지름? "))))

# 026
list_k = ['수성', '금성', '지구', '화성', '목성', '토성', '천왕성', '해왕성']
list_e = ['Mercury', 'Venus', 'Earth', 'Mars', 'Jupiter', 'Saturn', 'Uranus', 'Neptune']
i = list_k.index(input("행성? "))
print(list_e[i])

# 026
planets = {
    '수성' : 'Mercury',
    '금성' : 'Venus',
    '지구' : 'Earth',
    '화성' : 'Mars',
    '목성' : 'Jupiter',
    '토성' : 'Saturn', 
    '천왕성' : 'Uranus',
    '해왕성' : 'Neptune',   
}
print(planets[input("행성? ")])

# 027
name = list(input("이름? ").split(" "))
math = list(map(int, input("수학 점수? ").split(" ")))

data = dict()
for i in range(len(name)):
    data[name[i]]=math[i]
print(data)

# 028
gram = input("2-gram ")

for i in range(len(gram)-1):
    print(gram[i], gram[i+1], sep="")

# 029
alpabet = input("upper ")
upper = alpabet.upper()
print("YES") if alpabet == upper else print("NO")

alpabet = input("upper ")
print("YES") if alpabet.isupper() else print("NO")

aplabets = list(input("uplow "))
aplabets_upper = []
for i in range(len(aplabets)):
    if aplabets[i] == aplabets[i].upper():
        aplabets_upper.append(aplabets[i])

print("".join(aplabets_upper))

# 030
sentence = input("sentence? ")
word = input("찾을 문자? ")

print(sentence.index(word))