"""
	Ejemplo 4: uso de funcion lambda
	@ricardoifc
"""
#cada elemento de datos, tiene (edad y estatura)

datos = ((30, 1.79),(25,1.60),(35,1.68))

dato = lambda x: x[2]
edad = lambda x: x[1]*100
print(edad(dato(datos)))