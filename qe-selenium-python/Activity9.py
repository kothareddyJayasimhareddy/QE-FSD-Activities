from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/keyboard-events")
    print(driver.title)
    actions = webdriver.ActionChains(driver)
    actions.send_keys("Hello World!").perform()
    text = driver.find_element(By.CSS_SELECTOR, 'h1.mt-3').text
    print(text)