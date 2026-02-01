from selenium import webdriver
from selenium.webdriver.common.by import By


# when we have with 

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(driver.title)

    text_input = driver.find_element(By.XPATH, "//input[@id = 'textInput']")
    print(text_input.is_enabled())

    driver.find_element(By.XPATH, "//button[text() = 'Enable Input']").click()
    print(text_input.is_enabled())

    driver.quit()
    


