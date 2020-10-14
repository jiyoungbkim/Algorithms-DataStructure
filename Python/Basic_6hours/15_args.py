def profile(name, age, main_lang):
    print("이름 : {0}\t나이: {1}\t주 사용 언어: {2}" \
        .format(name, age, main_lang))
profile("Rowena", 30, "Java")
profile("Sue", 27, "Python")

# 이름만 다른 경우
def profile(name, age=17, main_lang="Python"):
    print("이름 : {0}\t나이: {1}\t주 사용 언어: {2}" \
        .format(name, age, main_lang))
profile("Rowena")
profile("Sue")

# 키워드 값
def profile(name, age, main_lang):
    print(name, age, main_lang)

profile(name="Rowena", main_lang="Java", age=20)
profile(main_lang="Python", age=25, name="Sue")

# 일반적인 매개변수
def profile(name, age, lang1, lang2, lang3, lang4, lang5):
    print("이름 : {0}\t나이 : {1}\t".format(name, age), end=" ")
    print(lang1, lang2, lang3, lang4, lang5)

profile("Rowena", 20, "Python", "Java", "C", "C++", "C#")
profile("Sue", 25, "Kotlin", "Swift", "", "", "")

# 가변인자
def profile(name, age, *language):
    print("이름 : {0}\t나이 : {1}\t".format(name, age), end=" ")
    for lang in language:
        print(lang, end=" ")
    print()

profile("Rowena", 20, "Python", "Java", "C", "C++", "C#", "JavaScript")
profile("Sue", 25, "Kotlin", "Swift")