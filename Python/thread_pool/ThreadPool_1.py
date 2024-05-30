from time import sleep, perf_counter
from concurrent.futures import ThreadPoolExecutor
# time.perf_counter() → float
# Return the value (in fractional seconds)
# of a performance counter.
# only the difference between the results of
# two calls is valid.


def task(th_id):
    print(f'Starting the task {th_id}...')
    sleep(1)
    return f'Done with task {th_id}'


start = perf_counter()
with ThreadPoolExecutor() as exc:
    f1 = exc.submit(task, 1)
    f2 = exc.submit(task, 2)
    f3 = exc.submit(task, 3)
    print(f1.result())
    print(f2.result())
    print(f3.result())
exc.shutdown()
finish = perf_counter()
diff = round(finish-start, 4)
print(f"It took {diff} second(s) to finish.")
print("exit")
