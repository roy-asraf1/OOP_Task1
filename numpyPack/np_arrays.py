import logging

import numpy as np

logging.basicConfig(level=logging.DEBUG,
                    filename='np_arrays.log', filemode='w',
                    format='%(name)s - %(levelname)s - %(message)s')
a = np.array([1, 2, 3])
logging.debug('a: ' + str(a))
a = np.zeros(5)
logging.debug('a.zeros(5): ' + str(a))
a = np.ones(5)
logging.debug('a.ones(5): ' + str(a))
a = np.empty(3)
logging.debug('a.empty(3): ' + str(a))
# we can create an array with a range of elements:
a = np.arange(4)
logging.debug('a.arange(4): ' + str(a))
# we can specify the first number, last number, and the step size.
a = np.arange(2, 9, 2)  # [2 4 6 8]
logging.debug('a.arange(2, 9, 2): ' + str(a))
#  we can use np.linspace() to create an array with
#  values that are spaced linearly in a specified interval:
a = np.linspace(0, 10, num=5)  # [ 0.   2.5  5.   7.5 10. ] (4 intervals)
logging.debug('a.linspace(0, 10, num=5): ' + str(a))
a = np.ones(4, dtype=np.int64)
logging.debug('a.ones(4, dtype=np.int64): ' + str(a))
