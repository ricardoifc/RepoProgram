"""
    @reroes
    uso de la librería itertools 
    referencia: https://docs.python.org/3/library/itertools.html

    accumulate() # 
    accumulate([2,3,1,10]) 

"""

from itertools import *

print("Uso de la función acumulate()")

variable = list(accumulate([2,3,1,10]))
print(variable)


variable = list(accumulate([2.2,3,1,10]))
print(variable)

