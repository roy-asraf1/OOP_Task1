# we can sort the numbers in ascending order with:
import logging
import numpy as np
from numpy import ndarray as nd
logging.basicConfig(level=logging.DEBUG,
                    filename='np_arrays2.log', filemode='w',
                    format='%(name)s - %(levelname)s - %(message)s')

a = np.array([8, 4, 7, 3, 9, 1, 2])
aa = np.sort(a)  # [1 2 3 4 7 8 9]
logging.debug('a: ' + str(a))
logging.debug('aa: ' + str(aa))

#  this method sorts an array in-place.
nd.sort(a)
logging.debug('nd.sort(a): ' + str(a))
a = np.array([4, 3, 2])
b = np.array([9, 6, 7])
c = np.array([0, 1])
logging.debug('a: ' + str(a) + ", b:" + str(b) + ", c:" + str(c))
d = np.concatenate((a, b, c))
logging.debug('np.concatenate((a, b, c)): ' + str(d))
