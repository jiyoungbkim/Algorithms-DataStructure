# 나의 풀이
# 처음에는 입출력 예를 보고 내림차순 한 다음 맨 뒤의 인덱스를 제거하고 리턴했으나,
# 제일 작은 수가 2개인 경우나 입출력 예가 내림차순이 아닌경우 테스트 에러
# del을 이용해서 제일 작은 수만 삭제
def solution(arr):
    answer = []
    if len(arr) <= 1:
        answer.append(-1)
    else:
        del arr[arr.index(min(arr))]
        answer = arr
    return answer

# 참고
# 제일 작은 수가 여러개 일 경우와 배열의 길이가 1일 경우도 이렇게 간단히 표현할 수 있다.
def sol(arr):
    return [i for i in arr if i > min(arr)] or [-1]