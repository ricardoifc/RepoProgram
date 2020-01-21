"""
    @ricardoifc
"""

from itertools import *
lista = [1,2,3,4]
variable1 = list(map(lambda x: list(repeat(x, 10)), lista))
print(variable1)

variable2= list(map(lambda x: list(accumulate(x)), variable1))
print(variable2)

variable3 = list(map(lambda x: sum(x), variable1))
print(variable3)
variable4 = list(map(lambda x: (x)[9], variable2))
print(variable4)