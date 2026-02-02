from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-content")
    wait = WebDriverWait(driver, 20)
    print(driver.title)
    actions = webdriver.ActionChains(driver)
    
    print("Title of the Page: "+driver.title)

    click_me_btn = driver.find_element(By.ID,"genButton")

    actions.click(click_me_btn).perform()

    wait.until(EC.text_to_be_present_in_element((By.ID, "word"), "release"))

    print(driver.find_element(By.ID,"word").text)
