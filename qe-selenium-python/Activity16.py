from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select

with webdriver.Firefox() as driver:

    driver.get("https://training-support.net/webelements/selects")

    print("Title of the Page:", driver.title)
    print(driver.title)

    single_select_element = driver.find_element(By.TAG_NAME, "select")

    # Create Select object
    single_select = Select(single_select_element)

    # Select second option using visible text
    single_select.select_by_visible_text("Two")

    # Select third option using index
    single_select.select_by_index(2)

    # Select fourth option using value
    single_select.select_by_value("four")

    # Get all options and print them
    options = single_select.options
    print("Available options:")

    for option in options:
        print(option.text)
