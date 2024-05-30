import logging
import threading


def get_logger():
    logger = logging.getLogger("threading_example")
    logger.setLevel(logging.DEBUG)

    fh = logging.FileHandler("threading_class.log")
    fmt = '%(asctime)s - %(threadName)s - %(levelname)s - %(message)s'
    formatter = logging.Formatter(fmt)
    fh.setFormatter(formatter)

    logger.addHandler(fh)
    return logger


class MyThread(threading.Thread):
    def __init__(self, number):
        threading.Thread.__init__(self)
        self.number = number
        self.logger = get_logger()

    def run(self):
        """
        Run the thread
        """
        self.logger.debug('Calling doubler')
        doubler(self.number, self.logger)
        print(threading.currentThread().getName() + '\n')


def doubler(number, my_logger):
    """
    A function that can be used by a thread
    """
    my_logger.debug('doubler function executing')
    result = number * 2
    my_logger.debug('doubler function ended with: {}'.format(result))

