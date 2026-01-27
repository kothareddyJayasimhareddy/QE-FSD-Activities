# list = [1,3,4,6,2,34]

list = []
n = int(input("Enter len of list: "))
for _ in range(n):
    list.append(int(input("Enter a number: ")))

sum=0
for i in list:
    sum+=i
print(sum)