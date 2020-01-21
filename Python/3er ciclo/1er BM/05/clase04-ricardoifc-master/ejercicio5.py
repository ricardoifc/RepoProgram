"""
	@ricardoifc
	ejercicio5
"""
"""
Manejo de colecciones y tuplas


# Encontrar la siguiente estructura
#

[(16.333333333333332, 'Ángel'), (16.666666666666668, 'José'), (13.0, 'Ana')]
(16.666666666666668, 'José')
[(13.0, 'Ana'), (16.666666666666668, 'José'), (16.333333333333332, 'Ángel')]

 

Dadas las siguientes estructuras

"""

paraleloA = [(19, 10, 20), (20, 20, 10), (20, 10, 9)]
nombres = ["Ángel", "José", "Ana"]
# saco el promedio de las 3 notas y lo uno en un zip con nombre
prom = (list(zip((list(map(lambda x: (x[0] + x[1] + x[2]) / 3, paraleloA))),
 nombres)))
#imprimo el prom, el maximo y despues convierto en reversa y imprimo reversa
print(prom)
print(max(prom))
prom.reverse()
print(prom)