"""
	Ejemplo 7: uso de funcion lambda
	@ricardoifc
"""
#cada elemento de datos, tiene (edad y estatura)

lista = (10, 2, 3, 5, 1)
funciones = lambda x: x+100
print(min(list(map(funciones, lista)))