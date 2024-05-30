import pandas as pd

inp = pd.read_csv("persons.cvs")
# for accessing i th row:
var = inp.iloc[1]
print(var)
# for accessing column named name
n = inp.name
print(n)
# for accessing i th row and column named X
m = inp.iloc[1].profession
print(m)
