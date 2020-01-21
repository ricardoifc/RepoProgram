"""
	Ejercicio 5
	@ricardoifc
"""
#uso pos1 y pos 2 para separar los numeros, despues cada numero lo
#le saco la raiz y los otros al cuadrado
datos = [(10,2), (8,7), (5,4), (3,11), (10,11)]
pos1 = lambda x: x[0]
pos2= lambda x: x[1]

raizCuadrada = lambda x: (pos1(x)**0.5)
potenciaCuadrada = lambda x: (pos2(x)**2)

print(list(map(raizCuadrada, datos)))
print(list(map(potenciaCuadrada, datos)))