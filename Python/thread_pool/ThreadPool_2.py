# Using the map() method example
# The following program uses a ThreadPoolExecutor class.
# However, instead of using the submit() method,
# it uses the map() method to execute a function:

from time import sleep, perf_counter
from concurrent.futures import ThreadPoolExecutor


def task(th_id):
    print(f'Starting the task {th_id}...')
    sleep(1)
    return f'Done with task {th_id}'


start = perf_counter()
with ThreadPoolExecutor() as exc:
    results = exc.map(task, [1, 2, 3])
    for result in results:
        print(result)
exc.shutdown()
finish = perf_counter()
diff = round(finish-start, 4)
print(f"It took {diff} second(s) to finish.")
print("exit")
