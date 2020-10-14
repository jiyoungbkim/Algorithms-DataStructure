# open(파일 이름, write 쓰기위한 목적, 인코딩)
score_file = open("Python/Basic_6hours/score.txt", "w", encoding="utf8")
print("수학 : 0", file=score_file)
print("영어 : 50", file=score_file)
score_file.close()

# open(파일 이름, append 내용 추가, 인코딩)
score_file = open("Python/Basic_6hours/score.txt", "a", encoding="utf8")
score_file.write("과학 : 80\n")
score_file.write("코딩 : 100\n") # score_file.write는 자동으로 다음줄로 가지 않기 때문에 명시적으로 \n
score_file.close()

# 파일의 내용 읽어오기
score_file = open("Python/Basic_6hours/score.txt", "r", encoding="utf8")
print(score_file.read())
score_file.close()

# 파일의 내용을 한 줄씩 불러오기
score_file = open("Python/Basic_6hours/score.txt", "r", encoding="utf8")
print(score_file.readline(), end="") # 줄별로 읽기, 한 줄 읽고 커서는 다음 줄로 이동
print(score_file.readline(), end="")
print(score_file.readline(), end="")
print(score_file.readline(), end="")
score_file.close()

# 몇줄인지 모를때의 처리
score_file = open("Python/Basic_6hours/score.txt", "r", encoding="utf8")
while True:
    line = score_file.readline()
    if not line:
        break
    print(line, end="")
score_file.close()

# 리스트에 값을 넣어서 처리
score_file = open("Python/Basic_6hours/score.txt", "r", encoding="utf8")
lines = score_file.readlines() # list 형태로 저장
for line in lines:
    print(line, end="")
score_file.close()