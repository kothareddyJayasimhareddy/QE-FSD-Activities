"""
1. Tests must be in  the ./tests  folder
2. Test files SHOULD start or end with "test"
3. Test functions SHOULD start with "test"

"""

import math

def test_sqrt():
    num = 25
    assert math.sqrt(num) == 5


def test_square():
    num = 7
    assert num*num == 40


