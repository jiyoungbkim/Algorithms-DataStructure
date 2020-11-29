# 이상한 문자 만들기
# 첫번째 풀이
# 테스트 케이스 중에 통과 안되는 것이 있었는데 13번째를 수정 후 통과
def solution(s):
    lst = s.split(' ')
    index = 0
    for i in lst:
        t = ''
        for j in range(len(i)):
            # if j % 2 == 0:
            #     t += i[j].upper()
            # else :
            #     t += i[j].lower()
            t += i[j].upper() if j % 2 == 0 else i[j].lower()
        lst[index] = t
        index += 1
    return ' '.join(lst)

print(solution(" try  hello world"))

# 두번째 풀이
# 공백인 경우와 아닌 경우(인덱스가 짝수인 경우는 대문자)
def solution(s):
    index = 0
    answer = ''
    for i in range(len(s)):
        if s[i] == ' ':
            index = 0
            answer += ' '
        else:
            if index % 2 == 0:
                answer += s[i].upper()
                index += 1
            else:
                answer += s[i].lower()
                index += 1
    return answer

print(solution(" try  hello world"))

# 참고
def solution(s):
    return " ".join(map(lambda x: "".join([a.lower() if i % 2 else a.upper() for i, a in enumerate(x)]), s.split(" ")))
print(solution(" try  hello world"))