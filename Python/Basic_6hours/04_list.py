# list []

# 지하철 칸별로 10명, 20명, 30명
# subway = [10, 20, 30]

subway = ["유재석","조세호","박명수"]
print(subway)

# 몇 번째 칸에 타고 있는가?
print(subway.index("조세호"))

# 맨 뒤에 넣기
subway.append("haha")
print(subway)

# 0,2 사이에 넣기
subway.insert(1, "정형돈")
print(subway)

# 뒤에서 꺼내기
print(subway.pop())
print(subway)
print(subway.pop(2))
print(subway)

# 정렬
num_list = [5,2,4,3,1]
num_list.sort()
print(num_list)

# 뒤집기
num_list.reverse()
print(num_list)

# 모두 지우기
# num_list.clear()
# print(num_list)

# 다양한 자료형 함께 사용
mix_list = ["haha", 20, True]
print(mix_list)

# 리스트 확장
num_list.extend(mix_list)
print(num_list)