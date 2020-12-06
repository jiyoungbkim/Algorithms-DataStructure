# 소수 찾기
# 에라토스테네스의 체
def solution(n):
    # 2부터 N까지의 모든 자연수를 나열한다.
    answer = set(range(2,n+1))
    # 2. 남은 수 중에서 아직 처리하지 않은 가장 작은 수 i를 찾는다.
    for i in range(2, n+1):
        if i in answer:
            # 3. 남은 수 중에서 i의 배수를 모두 제거한다.(i는 제거하지 않는다.)
            answer -= set(range(i*2, n+1, i))
    # 더 이상 반복할 수 없을 때까지 2번과 3번의 과정을 반복한다.
    return len(answer)