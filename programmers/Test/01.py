n = 6
delivery = [[1,3,1],[3,5,0],[5,4,0],[2,5,0]]

def solution(n, delivery):
    answer = ''
    p = [0] * (n+1)
    for i in delivery:
        if i[2] == 1 :
            p[i[0]] = 1
            p[i[1]] = 1
    for i in delivery:         
        if p[i[0]] == 1:
            p[i[1]] = 2
        if p[i[1]] == 1:
            p[i[0]] = 2   
    for j in range(1, len(p)):
        if p[j] == 1:
            answer += 'O'
        elif p[j] == 2:
            answer += 'X'
        else:
            answer += '?'
    print(answer)
    return answer

solution(n, delivery)
