import numpy as np

arr = np.arange(6).reshape((2, 3))
print(arr)
arr = arr.reshape(3, 2)
print(arr)
arr = arr.transpose()
print(arr)
arr = np.array([1, 2, 3, 4, 5])
rvrs_arr = np.flip(arr)
print(rvrs_arr)
a2d = np.array([[1, 2, 3, 4], [5, 6, 7, 8]])
rvrs_arr = np.flip(a2d)
print(rvrs_arr)

