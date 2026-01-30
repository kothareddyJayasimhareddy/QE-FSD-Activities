import pandas as pd
from pandas import ExcelWriter
data = {
    "FirstName" : ["Satvik", "Avinash", "Lahri"],
    "LastName" : ["Shah", "Kati", "Rath"],
    "Email" : ["satvik@example.com", "avinash@example.com", "lahri.rath@example.com"]
}

df = pd.DataFrame(data)

writer = ExcelWriter("Users.xlsx")
df.to_excel(writer, sheet_name="Sheet1", index=False)
