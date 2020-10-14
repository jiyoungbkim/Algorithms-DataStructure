import pickle # 프로그램 상에서 사용하고 있는 데이터를 파일 형태로 저장해주는 것
# 파일에 데이터를 저장하기
profile_file = open("Python/Basic_6hours/profile.pickle", "wb") # write binary type
profile = {"name":"Rowena","age": 30, "hobby":["soccer", "golf", "codding"]}
print(profile)
pickle.dump(profile, profile_file) # profile에 있는 정보를 file에 저장
profile_file.close()

# 파일에서 데이터를 가져오기
profile_file = open("Python/Basic_6hours/profile.pickle", "rb") # read binary type
profile = pickle.load(profile_file) # file에 있는 정보를 profile에 불러오기
print(profile)
profile_file.close()

# with : 열었던 파일을 닫아줄 필요 없이 with문을 탈출하면서 자동 종료
with open("Python/Basic_6hours/profile.pickle","rb") as profile_file:
    print(pickle.load(profile_file))

# pickle을 사용하지 않고 일반적인 파일 쓰고 읽기
with open("Python/Basic_6hours/study.txt", "w", encoding="utf8") as study_file:
    study_file.write("파이썬을 열심히 공부하고 있어요")

with open("Python/Basic_6hours/study.txt", "r", encoding="utf8") as study_file:
    print(study_file.read())