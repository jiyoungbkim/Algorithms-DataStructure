# 078
N, K = list(map(int, input('N, K : ').split()))
foods = [i for i in range(1, N+1)]

def sol(n, k):
    i = 0
    j = k-1
    while len(foods) > 2:
        if i >= len(foods):
            i -= len(foods)
        else:
            foods.pop(i)
            i += j
    return foods

print(sol(N, K))