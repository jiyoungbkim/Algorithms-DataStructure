absent = [2, 5] # 결석
no_book = [7] # 책을 깜빡
for student in range(1, 11):
    if student in absent:
        continue # 다음 반복 진행
    elif student in no_book:
        print("오늘 수업 여기까지. {0}은 교무실로 따라와.".format(student))
        break # 반복문 바로 종료
    print("{0}, 책을 읽어봐".format(student))