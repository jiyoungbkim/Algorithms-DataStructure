# 같은 숫자는 싫어
# 인덱싱 사용 
# 배열[-1] : 배열의 마지막 값
def solution(arr):
    result = [arr[0]]
    #result.append(arr[0])
    for i in arr:
        if result[-1] != i:
            result.append(i)
    return result

# 슬라이싱 사용
# 현재의 값과 뒤의 값 1개와 비교
# 슬라이싱은 인덱스 값이 범위 초과해도 오류나지 않는다.
def solution(arr):
    # return [arr[i] for i in range(len(arr)) if [arr[i]] != arr[i+1:i+2]]
    return [j for i, j in enumerate(arr) if [j] != arr[i+1:i+2]] 
    # return [j for i, j in enumerate(arr) if arr[i-1]!=arr[i] or i == 0]