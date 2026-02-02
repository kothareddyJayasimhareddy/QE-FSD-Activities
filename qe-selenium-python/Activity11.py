from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    wait = WebDriverWait(driver, 20)
    print(driver.title)
    actions = webdriver.ActionChains(driver)
    
    print("Title of the Page: "+driver.title)

    check_box = driver.find_element(By.ID, "checkbox")
    toggle_button = driver.find_element(By.CSS_SELECTOR, ("section.mx-auto:nth-child(1) > button:nth-child(2)"))

    actions.click(toggle_button).perform()
    actions.click(toggle_button).perform()

    wait.until(EC.visibility_of(check_box))

    actions.click(check_box).perform()