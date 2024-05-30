import csv

import pandas as pd

f = pd.read_csv('data.csv')
print(f)
with open('data.csv', 'r' ) as theFile:
    reader = csv.DictReader(theFile)
    for line in reader:
        print(line)

