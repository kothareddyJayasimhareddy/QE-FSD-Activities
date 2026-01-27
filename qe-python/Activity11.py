fruits = {
    "banana" : 5,
    "apple" : 20,
    "orange" : 15,
    "pineapple" : 30
}

input = input("Enter a Fruit to check: ")
print(f"Is the {input} fruit available? {input in fruits}")