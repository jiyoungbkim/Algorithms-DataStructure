s1 = [1,2,3,0,6,5,4]
s2 = [1,2,3,4,5,6,0]

def solution(s1, s2):
    answer = 0
    for i in range(len(s1)):
        if s1[i] != s2[i]:
            if s1[i] == 0:
                index = s1.index(s2[i])
                s1[i] = s1[index]
                s1[index] = 0
                answer += 1
            else :
                index2 = s1.index(0)
                s1[index2]=s1[i]
                s1[i]=0
                answer+=1
    return answer

print(solution(s1,s2))
