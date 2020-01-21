"""
    @reroes
    uso de la librería itertools 
    referencia: https://docs.python.org/3/library/itertools.html

    repeat() # 
    repeat(10, 3) --> 10 10 10

"""

from itertools import *

print("Uso de la función repeat()")

variable = list(repeat(20, 2))
print(variable)


variable = list(repeat(1.2, 10))
print(variable)
