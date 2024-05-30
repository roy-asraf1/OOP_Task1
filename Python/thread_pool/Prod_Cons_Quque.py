# SuperFastPython.com
# example of using the queue
import logging
from time import sleep
import random
from threading import Thread
from queue import Queue

logging.basicConfig(level=logging.DEBUG,
                    filename='prod_cons_queue.log', filemode='w',
                    format='(%(threadName)-9s) %(message)s', )


# generate work
def producer(q):
    print('Producer: Running')
    # generate work
    for i in range(5):
        # generate a value
        value = random.randint(1, 10)
        logging.debug('Putting ' + str(value)
                      + ' : ' + str(q.qsize()) + ' items in queue')
        print(f'>put {value}')
        # block
        # sleep(value)
        # add to the queue
        q.put(value)
    # all done
    q.put(None)
    print('Producer: Done\n')


# consume work
def consumer(q):
    print('Consumer: Running')
    # consume work
    while True:
        # get a unit of work
        item = q.get()
        # check for stop
        if item is None:
            break
        # report
        logging.debug('Getting ' + str(item)
                      + ' : ' + str(q.qsize()) + ' items in queue')
        print(f'>got {item}')
    # all done
    print('Consumer: Done\n')


# create the shared queue
queue = Queue()
# start the consumer
consumer = Thread(target=consumer, args=(queue,))
consumer.start()
# start the producer
producer = Thread(target=producer, args=(queue,))
producer.start()
# wait for all threads to finish
producer.join()
consumer.join()
