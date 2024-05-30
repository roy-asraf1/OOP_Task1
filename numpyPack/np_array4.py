import logging
import numpy as np

logging.basicConfig(level=logging.DEBUG,
                    filename='np_arrays4.log', filemode='w',
                    format='%(name)s - %(levelname)s - %(message)s')

a = np.arange(6)
logging.debug('a: ' + str(a))
logging.debug("a.ndim = " + str(a.ndim) + ", a.size = " + str(a.size)
              + ", a.shape = " + str(a.shape))
b = a.reshape(2, 3)
logging.debug("b: " + str(b))
logging.debug("b.ndim = " + str(b.ndim) + ", b.size = " + str(b.size)
              + ", b.shape = " + str(b.shape))
c = b.reshape(1, 6)
logging.debug("c: " + str(c))
logging.debug("c.ndim = " + str(c.ndim) + ", c.size = " + str(c.size)
              + ", c.shape = " + str(c.shape))
logging.debug("a: " + str(a))

