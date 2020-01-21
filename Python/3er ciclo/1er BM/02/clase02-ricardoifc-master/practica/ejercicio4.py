"""
	Ejercicio 4
	@ricardoifc
"""
#elemento elevado a la tercera
datos = (10,2,8,7,5,4,3,11,0, 1)
funciones = lambda x: x**3

print(list(map(funciones, datos)))