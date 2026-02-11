# central config file for fixtures
# conftest file scope will be applied at "Directory level" or "Module level"

import pytest
import requests
from bs4 import BeautifulSoup

@pytest.fixture
def home_page_content():
    res = requests.get("https://training-support.net")
    content = res.content
    soup = BeautifulSoup(content, "html.parser")
    return soup


@pytest.fixture
def list_init():
    list = [i for i in range(11)]
    return list


@pytest.fixture
def wallet():
    return {"amount": 0}
