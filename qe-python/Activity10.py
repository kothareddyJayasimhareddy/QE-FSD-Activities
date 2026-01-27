tuple = ()
n = int(input("Enter len of list: "))
for _ in range(n):
    tuple += (int(input("Enter a number: ")),)

for i in tuple:
    if i%5==0:
        print(i)
    else:
        print("None")

