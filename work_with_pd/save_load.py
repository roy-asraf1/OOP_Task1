import numpy as np

a = np.array([1, 2, 3, 4, 5, 6])
np.save('my_file', a)
f = np.load('../numpyPack/my_file.npy')
print(f)

x = ["I", "Love", "Python", 'and', 'Java']
a = np.array([1, 2, 3, 4, 5, 6])
np.savetxt('array1.csv', a, delimiter=',', fmt='%s')
p = np.loadtxt('array1.csv')
print(p)

