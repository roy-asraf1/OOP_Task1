import logging
import numpy as np

logging.basicConfig(level=logging.DEBUG,
                    filename='np_arrays5.log', filemode='w',
                    format='%(name)s - %(levelname)s - %(message)s')

a = np.arange(12)
b = np.reshape(a, newshape=(4, 3))
logging.debug("b: " + str(b))
logging.debug("b.ndim = " + str(b.ndim) + ", b.size = " + str(b.size)
              + ", b.shape = " + str(b.shape))

c = np.arange(12)
d = c[np.newaxis, :]
logging.debug("d: " + str(d))
logging.debug("d.ndim = " + str(d.ndim) + ", d.size = " + str(d.size)
              + ", d.shape = " + str(d.shape))

a = np.array([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]])
logging.debug(str(a))
b = a.flatten()
a[0][0] = 99
logging.debug("a: " + str(a))
logging.debug("b: " + str(b))

c = np.array([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]])
d = c.ravel()
c[0][0] = 99
logging.debug("c: " + str(c))
logging.debug("d: " + str(d))
