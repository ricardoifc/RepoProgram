"""
	Ejemplo 6: uso de funcion lambda
	@ricardoifc
"""
#cada elemento de datos, tiene (edad y estatura)

datos = (
		(100, 170),
		(200, 168),
		)

anios = lambda x: x[0]
estatura = lambda x: x[1]

funciones = lambda x: (anios(x)/12.0, estatura(x)/100)

print(list(map(funciones, datos)))