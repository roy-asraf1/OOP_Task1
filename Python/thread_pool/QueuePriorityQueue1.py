from queue import PriorityQueue


def PQ_Example1():
    customers = PriorityQueue()
    customers.put("Harry")
    customers.put("Charles")
    customers.put("Richard")
    customers.put("Stacy")
    for i in range(customers.qsize()):
        print(customers.get())

    customers = PriorityQueue()
    customers.put("Harry")
    customers.put("Charles")
    customers.put("Richard")
    customers.put("Stacy")


PQ_Example1()

