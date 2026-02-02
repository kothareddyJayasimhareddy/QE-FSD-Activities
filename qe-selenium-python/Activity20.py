from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


with webdriver.Firefox() as driver:

    wait = WebDriverWait(driver, 10)

    driver.get("https://training-support.net/webelements/alerts")

    print("Title of the Page:", driver.title)
    print(driver.title)

    driver.find_element(By.ID, "prompt").click()

    # Wait until prompt alert is present
    wait.until(EC.alert_is_present())

    alert = driver.switch_to.alert

    print("Text in Alert:", alert.text)

    alert.send_keys("Awesome!")
    alert.accept()
