import pandas as pd

df = pd.read_csv("./users.csv")

print("Usernames column:")
print(df["Usernames"])

print("\nSecond row (Username & Password) :")
print(df.loc[1, ["Usernames", "Passwords"]])

print("\nSorted by Usernames  (asc order):")
print(df.sort_values("Usernames"))

print("\nSorted by Passwords  (desc order):")
print(df.sort_values("Passwords", ascending=False))