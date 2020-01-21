"""
	@ricardoifc
	ejercicio6
"""
"""
Manejo de colecciones y tuplas


# Encontrar la siguiente estructura
#

[(4.333333333333333, 13, 'Ángel'), (4.666666666666667, 14, 'Ana')]

Dadas las siguientes estructuras

"""

paraleloA = [(19, 10, 20), (1, 2, 10), (20, 10, 9), (1, 4, 9)]
nombres = ["Luis", "Angel", "Jose", "Ana"]

# saco el promedio y los pongo en una nueva lista
promedios = list(map(lambda x: (x[0] + x[1] + x[2]) / 3, paraleloA))
# umo las notas y pongo en una nueva lista
suma = list(map(lambda x: (x[0] + x[1] + x[2]), paraleloA))
# uno en un zip
notas = list(zip(promedios, suma, nombres))

# filtro los nombres de angel y ana
validar = filter(lambda x: x[2] == "Angel" or x[2] == "Ana" , notas)
# imprimo la lista
print(list(validar))
