from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get('https://training-support.net/webelements/target-practice')
    print(driver.title)

    header3 = driver.find_element(By.XPATH, '//h3[text() = "Heading #3"]')
    header5 = driver.find_element(By.XPATH, '//h5[text() = "Heading #5"]')

    print("Header3 Text: ", header3.text)
    print("Header5 Color: ", header5.text)

    purple_btn = driver.find_element(By.CSS_SELECTOR, 'button.rounded-xl:nth-child(9)')
    slate_btn = driver.find_element(By.XPATH, "//button[text() = 'Slate']")

    print("Purle Button All Classes: ", purple_btn.get_attribute('class'))
    print("Slate Button Text: ", slate_btn.text)

    driver.quit()