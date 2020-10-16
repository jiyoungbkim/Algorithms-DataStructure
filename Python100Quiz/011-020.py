# 011
s = 0
for i in range(101):
    s += i
print(s)

# 012
class Wizard:
    def __init__(self, health, mana, armor):
        self.health = health
        self.mana = mana
        self.armor = armor
    def attack(self):
        print("파이어볼")

x = Wizard(health = 545, mana = 210, armor = 10)
print(x.health, x.mana, x.armor)
x.attack()

# 013
planets =['수성', '금성', '지구', '화성', '목성', '토성', '천왕성', '해왕성']
n = int(input("몇 번째?")) -1
print(planets[n])

# 014
n = int(input("번호?"))
print("짝") if n%3 == 0 else print(n)

# 015
name = input("이름?")
print(f"안녕하세요. 저는 {name}입니다.")

# 016
n = input("로꾸꺼")
print(n[::-1])

# 017
h = int(input("키?"))
print("YES") if h >= 150 else print("NO")

# 018
scores = list(map(int, input("점수는? ").split(" ")))
print(int(sum(scores)/3))

# 019
n = list(map(int, input("a의 b승 ").split(" ")))
print(n[0] ** n[1])

# 020
n = list(map(int, input("두개 의 숫자").split(" ")))
print(n[0]//n[1], n[0]%n[1])