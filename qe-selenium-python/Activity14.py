from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/tables")
   
    print(driver.title)
    actions = webdriver.ActionChains(driver)
    
    print("Title of the Page: "+driver.title)

    rows = driver.find_elements(By.XPATH,"//table/tbody/tr")
    cols = driver.find_elements(By.XPATH, "//table/thead/tr/th")
    print("No of Row in the Table: ", len(rows))
    print("No of Cols in the Table: ", len(cols))

    book_name = driver.find_element(By.XPATH, "//table/tbody/tr[5]/td[2]")
    
    print("Book name in the 5th Row: ",book_name.text)

    price_header = driver.find_element(By.XPATH, "//table/thead/tr/th[last()]")
    actions.click(price_header).perform()

    print("Book Name after sorting: ", driver.find_element(By.XPATH, "//table/tbody/tr[5]/td[2]").text)
