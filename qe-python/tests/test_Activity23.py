import pytest

# @pytest.fixture
# def list_init():
#     list = [i for i in range(11)]
#     return list


def test_sum_of_list(list_init):
    sum = 0
    for i in list_init:
        sum += i
    assert sum == 55