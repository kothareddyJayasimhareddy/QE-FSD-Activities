def sum(list):
    sum=0
    for i in list:
        sum+=i
    return sum

list = []
n = int(input("Enter len of list: "))
for _ in range(n):
    list.append(int(input("Enter a number: ")))

print(sum(list))