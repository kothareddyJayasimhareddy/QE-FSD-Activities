import pandas as pd


df = pd.read_excel("students.xlsx")


rows, columns = df.shape
print("Number of Rows:", rows)
print("Number of Columns:", columns)


print("Email Column:")
print(df["Email"])




sorted_df = df.sort_values(by="Firstname")

print("Sorted Data by Firstname:")
print(sorted_df)
