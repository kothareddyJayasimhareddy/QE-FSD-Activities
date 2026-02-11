
def test_page_title(home_page_content):
    heading = home_page_content.find("h1")
    assert heading.text == "Training Support"