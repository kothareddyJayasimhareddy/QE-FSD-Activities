import pytest
import pandas as pd



def get_csv_data():
    df = pd.read_csv("./tests/test_inputs.csv")
    return list(df.itertuples(index=False, name=None))

@pytest.mark.parametrize("earned,spent,expected",get_csv_data())
def test_wallet_transaction(wallet, earned,spent,expected):
    assert wallet["amount"] ==0

    wallet["amount"] += earned
    wallet["amount"] -= spent
    
    assert wallet["amount"] == expected