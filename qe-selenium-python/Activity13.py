from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/tables")
  
    print(driver.title)
   
    
    print("Title of the Page: "+driver.title)

    rows = driver.find_elements(By.XPATH,"//table/tbody/tr")
    cols = driver.find_elements(By.XPATH, "//table/thead/tr/th")
    print("No of Row in the Table: ", len(rows))
    print("No of Cols in the Table: ", len(cols))

    cellValusOfRow = driver.find_elements(By.XPATH, "//table/tbody/tr[3]/td")

    print("Cell Values in the 5 Row")
    for cellValue in cellValusOfRow:
       print(cellValue.text)
      

    cellValue = driver.find_element(By.XPATH,"//table/tbody/tr[2]/td[2]")

    print(cellValue.text)
