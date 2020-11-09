# 079
l = [10, 20, 25, 27, 34, 35, 39] #기존 입력 값
n = int(input('순회 횟수는 :'))

def rotate(inL, inN):
    list_a = inL.copy()
    list_cha = []
    for i in range(inN):
        ins = list_a.pop()
        list_a.insert(0, ins)
    for i, j in zip(inL, list_a):
        list_cha.append(abs(i-j))
    index = list_cha.index(min(list_cha))
    print("index :", index)
    print("value :", inL[index], list_a[index])
rotate(l, n)