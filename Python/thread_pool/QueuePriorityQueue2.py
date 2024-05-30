from queue import PriorityQueue


class Job(object):
    def __init__(self, priority, description):
        self.priority = priority
        self.description = description
        print('New job:', description)
        return

    # overload < operator
    def __lt__(self, other):
        return self.priority < other.priority


def PQ_Example2():
    q = PriorityQueue()
    q.put(Job(3, 'Mid-level job'))
    q.put(Job(10, 'Low-level job'))
    q.put(Job(1, 'Important job'))

    while not q.empty():
        next_job = q.get()
        print('Priority: ', next_job.priority, '  Processing job:', next_job.description)


PQ_Example2()
