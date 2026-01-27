list = []
n = int(input("Enter len of list: "))
for _ in range(n):
    list.append(int(input("Enter a number: ")))

if list[0] == list[n-1]:
    print("True")
else:
    print("False")