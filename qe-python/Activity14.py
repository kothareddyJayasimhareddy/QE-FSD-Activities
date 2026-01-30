def fibonnaci(num:int):
    if num <= 1:
        return num
    else:
        return (fibonnaci(num-1) + fibonnaci(num-2))

input = int(input("How many Fibonnaci nums to generate: "))
for i in range(input):
   print(fibonnaci(i))
