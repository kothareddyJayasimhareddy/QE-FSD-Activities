from datetime import datetime 
name = input("Enter name: ")
age = int(input("Enter age: "))
current_year = datetime.now().year
res = current_year+(100-age)
print(f"Hi {name}, you will turn 100 in {res}")