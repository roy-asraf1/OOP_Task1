import threading
import time


def task(num, tim, name):
    print(threading.currentThread())
    for i in range(1,  num):
        time.sleep(tim)
        print("\n", name, ", Task, i = ", i)


t = threading.Thread(target=task, args=(5, 0.4, "T1", ))
t.start()
print("\nt1 is alive? ", t.is_alive())
t.join()  # wait until thread 1 is completely executed
#  time.sleep(0.1)  # milliseconds
# the thread completely executed
print("\nt1 is alive? ", t.is_alive())
# print("main exit!")
