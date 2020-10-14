# 나의 풀이
def std_weight(height, gender):
    if gender == "man":
        height = height * 0.01
        weight = height * height * 22
        print("키 {0}cm 남자의 표준 체중은 {1}kg 입니다."\
            .format(int(height*100), format(float(weight),".2f")))
    if gender == "woman":
        height = height * 0.01
        weight = height * height * 21
        print("키 {0}cm 여자의 표준 체중은 {1}kg 입니다."\
            .format(int(height*100), format(float(weight),".2f")))

std_weight(175, "man")
std_weight(165, "woman")

# 해설
def std_weight(height, gender): # 키는 m 단위(실수), 성별 "남자"/"여자"
    if gender == "남자":
        return height * height * 22
    else:
        return height * height * 21

height = 175 #cm 단위
gender = "남자"
weight = round(std_weight(height / 100, gender), 2)
print("키 {0}cm {1}의 표준 체중은 {2}kg 입니다."\
    .format(height, gender, weight))