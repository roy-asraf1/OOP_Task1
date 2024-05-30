import logging

import numpy as np

logging.basicConfig(level=logging.DEBUG,
                    filename='np_arrays3.log', filemode='w',
                    format='%(name)s - %(levelname)s - %(message)s')

a = np.array([[[0, 1, 2, 3], [4, 5, 6, 7]],
              [[8, 9, 10, 11], [12, 13, 14, 15]],
              [[16, 17, 18, 19], [20, 21, 22, 23]]])
logging.debug("a.ndim = " + str(a.ndim) + ", a.size = " + str(a.size)
              + ", a.shape = " + str(a.shape))

a = np.array([[[1, 2, 9, 7], [4, 5, 8, 9]],
              [[8, 9, 6, 5], [3, 4, 0, 2]]])
logging.debug("a.ndim = " + str(a.ndim) + ", a.size = " + str(a.size)
              + ", a.shape = " + str(a.shape))
