# 077
# s1, s2 = input("s1, s2 : ")
s1 = 'THISISSTRINGS'
s2 = 'TKHKIKSIS'

def sol(strings):
    result = []
    for i in range(len(strings)):
        for j in range(i+1,len(strings)+1):
            result.append(strings[i:j])
    return result
# 나열될 수 있는 모든 경우의 수 만들기
list1 = set(sol(s1))
list2 = set(sol(s2))
# 경우의 수 교집합
answers = list1.intersection(list2)
# 가장 긴 교집합
answer = max(answers,key=len)
print(len(answer))