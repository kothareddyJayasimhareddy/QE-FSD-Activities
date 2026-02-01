from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(driver.title)

    checkBox = driver.find_element(By.XPATH, "//input[@id = 'checkbox']")
    print(checkBox.is_selected())

    checkBox.click()
    print(checkBox.is_selected())

    driver.quit()
    


