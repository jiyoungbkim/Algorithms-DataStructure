# if 조건:
#     실행 명령문

#weather = "Rain"
#weather = "Dust"
weather = input("How's the weather today? ")

if weather == "Rain" or weather == "Snow":
    print("Take a umbrella.")
elif weather == "Dust":
    print("Take a mask.")
else:
    print("Don't need anything.")

temp = int(input("What is the temperature? "))

if 30 <= temp:
    print("Too hot. Don't go out.")
elif 10 <= temp and temp < 30:
    print("Fine temp.")
elif 0 <= temp < 10:
    print("Get your jacket.")
else:
    print("Too cold. Don't go out.")