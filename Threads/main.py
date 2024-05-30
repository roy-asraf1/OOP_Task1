
from Thhreads.MyThread import MyThread

if __name__ == '__main__':
    thread_names = ['Mike', 'George', 'Wanda', 'Rachel', 'Nina']
    for i in range(5):
        print(i)
        thread = MyThread(i)
        thread.setName(thread_names[i])
        thread.start()
        thread.join()

    print("main exit")
