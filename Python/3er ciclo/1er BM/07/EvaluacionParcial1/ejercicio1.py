import codecs
import json
# abrimos archivos
archivo1 = codecs.open("archivos/alumnos.csv", "r")
archivo2 = codecs.open("archivos/notas_asignaturas.csv", "r")
# leemos lineas y despues convertimos en diccionarios con json
lista1 = archivo1.readlines()
linea1Dic = [json.loads(l) for l in lista1]
lista2 = archivo2.readlines()
linea2Dic = [json.loads(l) for l in lista2]
# las 2 lineas uno en una sola
# pregunta 1 
print("pregunta 1\n")
listaF = list(zip(map(lambda x: list(x.items()), linea1Dic), map(lambda x: 
	list(x.items()),linea2Dic)))
print(listaF)

# Pregunta 2 Ordenar por apellido
print("pregunta 2\n")
listaOrdenadaApellidos = list(sorted(listaF, key = lambda x: x[1]))
print(listaOrdenadaApellido)

# pregunta 3 Ordenar en Base web-semantica
print("pregunta 3\n")
listaOrdenadaSemantic = list(sorted(listaF, key = lambda x: x[1][2]))
print(listaOrdenadaSemantic)

# pregunta 4)
print("pregunta 4\n")
# validarNotas = list(filter(lambda x: x[1][0] = 10 and x[1][1] >= 10 , listaOrdenadaSemantic))
# print(validarNotas)

# pregunta 6
print("pregunta 6\n")
minimo = list(map(lambda x: list(x[1][0]),listaOrdenadaSemantic))
# uso min
print("minimo:")
print(list(filter(lambda x: list(x[1][0]) == min(minimo), listaOrdenadaSemantic)))
