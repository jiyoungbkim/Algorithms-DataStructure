# 2016년
from datetime import date
def solution(a, b):
    day = ["MON","TUE","WED","THU","FRI","SAT","SUN"]
    return day[date(2016, a, b).weekday()]

# 2016년 1월 1일은 금요일
# 금요일부터 시작하면 인덱스 때문에 1을 빼주어야 하기 때문에 목요일부터 리스트를 만든다.
def getDayName(a,b):
    months = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    days = ['THU', 'FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED']
    return days[(sum(months[:a-1])+b)%7]
