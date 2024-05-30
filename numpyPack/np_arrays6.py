import logging
import sys

import numpy as np

logging.basicConfig(level=logging.DEBUG,
                    filename='np_arrays6.log', filemode='w',
                    format='%(name)s - %(levelname)s - %(message)s')
handlers = [
    logging.FileHandler('np_arrays6.log'),
    logging.StreamHandler(sys.stdout),
]

data = np.array([1, 2, 3])
a = data[1:2]
b = data[1:]
c = data[-2:]
d = data[5:10]
logging.debug("data: " + str(data))
logging.debug("data[1:2]: " + str(a))
logging.debug("data[1:]: " + str(b))
logging.debug("data[-2:]: " + str(c))
logging.debug("data[5:10]: " + str(d))

data = np.arange(6)
logging.debug("data]: " + str(data))
logging.debug("data<= 4: " + str(data[data <= 4]))
logging.debug("data % 2 == 0]: " + str(data[data % 2 == 0]))

