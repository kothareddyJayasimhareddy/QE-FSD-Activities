from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select


with webdriver.Firefox() as driver:

    driver.get("https://training-support.net/webelements/selects")

    print("Title of the Page:", driver.title)
    print(driver.title)

    multi_select_element = driver.find_element(By.CSS_SELECTOR, ".h-80")

    # Create Select object
    multi_select = Select(multi_select_element)

    # Select options
    multi_select.select_by_visible_text("HTML")

    multi_select.select_by_index(4)
    multi_select.select_by_index(5)
    multi_select.select_by_index(6)

    # Deselect one option
    multi_select.deselect_by_index(5)
