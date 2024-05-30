# Keyword def that marks the start of the function header.
# A colon (:) to mark the end of the function header.
# In python, the function definition should always be present before the function call.
# Otherwise, we will get an error.
import logging

logging.basicConfig(level=logging.DEBUG,
                    filename='functions.log', filemode='w',
                    format='(%(threadName)-9s) %(message)s', )


def func1(text):
    """
    This function prints the text passed in as
    a parameter
    """
    print(text)


func1("hello Python")
logging.debug(func1.__doc__)

print(func1.__doc__)
print(func1("the function does not return anything"))


def func2(arr):
    """
    This function checks passing a List as an Argument
    """

    arr[0] = arr[0]*10


logging.debug(func2.__doc__)


list0 = [1, 2, 3, 4]
func2(list0)
print(list0)
string = "23456"
print(string.isdigit())
# if string.isdigit():
#    func2(string) error: string is immutable


def func3(x):
    x = x*10
    print("inside the func  ", x)


y = 25
func3(y)
print(y)


def func4(text="Israel"):
    print(text)


func4("USA")
func4()


def func5():
    pass
