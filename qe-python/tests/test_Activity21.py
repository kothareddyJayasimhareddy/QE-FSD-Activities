import math

import pytest

def sum(num1, num2):
    return num1+num2

def diff(num1, num2):
    return num1-num2

def product(num1, num2):
    return num1*num2

def quot(num1, num2):
    return num1 % num2

# test methods


def test_sum():
    assert sum(2, 2) == 4

def test_diff():
    assert diff(4, 2) == 2

@pytest.mark.activity
def test_product():
    assert product(4, 2) == 8

@pytest.mark.activity
def test_quot():
    assert quot(4, 2) == 0
