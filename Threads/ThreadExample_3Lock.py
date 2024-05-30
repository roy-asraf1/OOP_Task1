import threading
import time
import logging
import random
'''
Here is our example code using the Lock object. 
In the code the worker() function increments a Counter instance, 
which manages a Lock to prevent two threads from changing
its internal state at the same time.
'''

logging.basicConfig(level=logging.DEBUG,
                    format='(%(threadName)-9s) %(message)s',)
                    # filename='Counter.log')


class Counter(object):
    def __init__(self, start=0):
        self.lock = threading.Lock()
        self.value = start

    def increment(self):
        logging.debug('Waiting for a lock')
        self.lock.acquire()
        try:
            logging.debug('Acquired a lock')
            self.value = self.value + 1
        finally:
            logging.debug('Released a lock')
            self.lock.release()


def worker(c):
    for i in range(2):
        r = random.random()
        logging.debug('Sleeping %0.02f', r)
        time.sleep(5)
        c.increment()
    logging.debug('Done')


def run_example():
    counter = Counter()
    for i in range(2):
        t = threading.Thread(target=worker, args=(counter,))
        t.start()
    logging.debug('Waiting for worker threads')
    main_thread = threading.current_thread()
    logging.debug('main thread name: %s', main_thread)

    for t in threading.enumerate():
        if t is not main_thread:
            logging.debug('thread name: %s', t.name)
            t.join()
    logging.debug('Counter: %d', counter.value)
    logging.debug('Run_example done')


run_example()
