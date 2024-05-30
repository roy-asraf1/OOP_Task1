#  LIFO Queue
import queue

ql = queue.LifoQueue()
for i in range(5):
    ql.put(i)
while not ql.empty():
    print(ql.get(), end=", ")
print()
