#  FIFO Queue
import queue
from queue import Queue

# q = Queue(maxsize=100)
q = Queue()
for i in range(5):
    q.put(i)
print("simple FIFO: ", end="")
while not q.empty():
    print(q.get(), end=", ")
print()
