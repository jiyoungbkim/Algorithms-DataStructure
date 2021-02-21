# 시험성적 평균과 등급 구하기
def solution(raw_input):
    user_input = list(map(float, raw_input.split(" ")))

    average = sum(user_input)/len(user_input)
    grade = ''
    if average >= 90 :
        grade = 'A'
    elif 90 > average >= 80:
        grade = 'B'
    elif 80 > average >= 70:
        grade = 'C'
    elif 70 > average >= 60:
        grade = 'E'
    else:
        grade = 'F'
    return "{0:.2f}".format(average), grade

print(solution("67 100 98"))