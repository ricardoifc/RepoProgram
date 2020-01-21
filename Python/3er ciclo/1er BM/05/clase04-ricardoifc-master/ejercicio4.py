"""
	@ricardoifc
	ejercicio4
"""
"""
Manejo de colecciones y tuplas


# Encontrar la siguiente estructura
#

[(16.333333333333332, 'Ángel'), (16.666666666666668, 'José'), (13.0, 'Ana')]

Dadas las siguientes estructuras:

"""

paraleloA = [(19, 10, 20), (20, 20, 10), (20, 10, 9)]
nombres = ["Ángel", "José", "Ana"]
# hago una lista, un zip y en la primera antes de la coma hago un list, map y uso lambda
# para calcular el promedio y despues uso la lista nombres 
print(list(zip((list(map(lambda x: (x[0] + x[1] + x[2]) / 3, paraleloA))), nombres)))