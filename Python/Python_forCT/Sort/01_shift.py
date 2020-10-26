# 나의 풀이
n, k = map(int, input("N, K : ").split(' '))
array_a = list(map(int, input("A : ").split(' ')))
array_b = list(map(int, input("B : ").split(' ')))

array_a.sort()
array_b.sort(reverse=True)
for i in range(k):
    if array_a[i] < array_b[i]:
        array_a[i], array_b[i] = array_b[i], array_a[i]

print(sum(array_a))

# 해설
n, k = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

a.sort() # 배열 A는 오름차순 정렬 수행
b.sort(reverse=True) # 배열 B는 내림차순 정렬 수행
# 첫 번째 인덱스부터 확인하며, 두 배열의 원소를 최대 K번 비교
for i in range(k):
    # A의 원소가 B의 원소보다 작은 경우
    if a[i] < b[i]:
        # 두 원소를 교체
        a[i], b[i] = b[i], a[i]
    else: # A의 원소가 B의 원소보다 크거나 같을 때, 반복문을 탈출
        break
# 배열 A의 모든 원소의 합을 출력
print(sum(a))