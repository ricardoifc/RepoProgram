lista = [10, 9, 11, 12, 20, 19, 19]
"""
    @ricardoifc
"""

from itertools import *
lista = [10, 9, 11, 12, 20, 19, 19]
print("suma aritmetica")
# calculo la suma de la lista y divido por el tamaño de la lista
resultado1 = (lambda x: sum(x) / len(x)) (lista)
print(resultado1)
print("desviacion media")
# por cada uno le resto la media en una lista
resultado2 = list(map(lambda x: x - resultado1, lista))
print(resultado2)
print("varianza")
# sumo la desviacion elevado al cuadrado y despues divido para tamaño de lista
resultado4 = (lambda x: (x) / len(lista)) (sum(list(map(lambda x: (x**2), \
	resultado2))))
print(resultado4)






