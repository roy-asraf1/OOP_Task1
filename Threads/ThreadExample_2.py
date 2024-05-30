from threading import Thread
import time


class MyThreads(Thread):
    def __init__(self, name):
        super().__init__()
        self.running = True
        self.name = name

    def run(self):
        i = 0
        while self.running:
            print("T runs!, running = ", self.running, ", i = ", i)
            i = i + 1
            time.sleep(0.5)

    def terminate(self):
        self.running = False


def run_with_start():
    c = MyThreads("my_thread")
    c.start()
    time.sleep(2.6)
    print("t is alive? ", c.is_alive())
    c.terminate()
    time.sleep(0.51)
    print("t is alive? ", c.is_alive())


run_with_start()
