# SuperFastPython.com
# example of using join and task_done queue
import logging
from time import sleep
import random
from threading import Thread
from queue import Queue

logging.basicConfig(level=logging.DEBUG,
                    filename='prod_cons_daemon.log', filemode='w',
                    format='(%(threadName)-9s) %(message)s', )


# generate work
def producer(q):
    print('Producer: Running')
    # generate work
    for i in range(6):
        # generate a value
        value = random.randint(1, 10)
        logging.debug('Putting ' + str(value)
                      + ' : ' + str(q.qsize()) + ' items in queue')

        # print(f'>put {value}')
        # block
        # sleep(value)
        # add to the queue
        q.put(value)
    # all done
    # print('Producer: Done')


# consume work
def consumer(q):
    print('Consumer: Running')
    # consume work
    while True:
        # get a unit of work
        item = q.get()
        logging.debug('Getting ' + str(item)
                      + ' : ' + str(q.qsize()) + ' items in queue')
        # report
        print(f'>got {item}')
        # mark the task as done
        q.task_done()


# create the shared queue
queue = Queue()
# start the consumer
consumer = Thread(target=consumer, args=(queue,), daemon=True)
consumer.start()
# start the producer
producer = Thread(target=producer, args=(queue,))
producer.start()
# wait for all tasks to be processed
producer.join()
queue.join()
print("exit")
