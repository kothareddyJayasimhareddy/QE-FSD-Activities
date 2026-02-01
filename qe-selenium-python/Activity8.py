import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC


with webdriver.Firefox() as driver:
    actions = webdriver.ActionChains(driver)
    wait = WebDriverWait(driver,20)
    driver.get('https://training-support.net/webelements/mouse-events')
    print(driver.title)

    cargo_lock_btn = driver.find_element(By.CSS_SELECTOR, 'div.file:nth-child(1) > div:nth-child(1)')
    cargo_toml_btn = driver.find_element(By.CSS_SELECTOR, 'div.file:nth-child(2) > div:nth-child(1)')
    src_btn = driver.find_element(By.CSS_SELECTOR, 'div.file:nth-child(3) > div:nth-child(1)')
    target_btn = driver.find_element(By.CSS_SELECTOR, 'div.file:nth-child(4) > div:nth-child(1)')

    actions.click(cargo_lock_btn).move_to_element(cargo_toml_btn).click(cargo_toml_btn).perform()

    msg = driver.find_element(By.ID, 'result').text

    print(msg)

    actions.double_click(src_btn).context_click(target_btn).perform()

    open_btn = driver.find_element(By.CSS_SELECTOR,'li.w-full:nth-child(1)')

    actions.click(open_btn).perform()

    wait.until(lambda d: len(d.find_element(By.ID, 'result').text) != len(msg))

    print(driver.find_element(By.ID,'result').text)

    driver.quit()
