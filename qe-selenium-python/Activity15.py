from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:

    wait = WebDriverWait(driver, 10)

    driver.get("https://training-support.net/webelements/dynamic-attributes")

    print("Title of the Page:", driver.title)
    print(driver.title)

    full_name = driver.find_element(By.XPATH, "//input[starts-with(@id, 'full-name-')]")

    email = driver.find_element(By.CSS_SELECTOR, "input[id$='email']")

    date = driver.find_element(By.XPATH, "//input[contains(@name,'event-date')]")

    text_area = driver.find_element(By.XPATH, "//textarea[contains(@id,'additional-details')]")

    full_name.send_keys("admin")
    email.send_keys("abc@xyz.com")
    date.send_keys("2026-02-01")
    text_area.send_keys("party Time!")

    driver.find_element( By.XPATH, "//button[text()='Submit']").click()

    message = wait.until(EC.visibility_of_element_located((By.ID, "action-confirmation")))

    print(message.text)
