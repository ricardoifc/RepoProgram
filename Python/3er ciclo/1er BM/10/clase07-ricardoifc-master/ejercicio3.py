"""
    @reroes
    uso de la librería itertools 
    referencia: https://docs.python.org/3/library/itertools.html

    chain() # 
    chain([2,3],[10], [1, 10, 100]) 

"""

from itertools import *

print("Uso de la función chain()")

variable = list(chain([2,3],[10], [1, 10, 100])) 
print(list(variable))
