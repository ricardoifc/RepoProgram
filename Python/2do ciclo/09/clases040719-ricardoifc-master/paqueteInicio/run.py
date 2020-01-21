def obtener_primer_letra(pais):
	valor = pais.lower()
	return valor[0]

def obtener_promedio_notas(nota1, nota2, nota3):
	promedio = (nota1 + nota2 + nota3) / 3
	return promedio

def obtener_tipo_notas(nota1, nota2, nota3):
	promedio = (nota1 + nota2 + nota3) / 3

	if(promedio < 10):
		tipo = "Insuficiente"
	else:
		if(promedio >=10 and promedio <=12):
			tipo = "Regular"
		else:
			if(promedio >12 and promedio <=16):
				tipo = "Bueno"
			else:
				if(promedio >16 and promedio <=18):
					tipo = "Muy Bueno"
				else:
					if(promedio >18):
						tipo = "Sobresaliente"
	return tipo


def suma_numeros(valor, valor2):
	suma = 0
	valor = valor +1
	while(valor < valor2):
		suma = suma + valor
		valor = valor + 1
	return suma

def obtener_promedio_notas_dos(lista):
	promedio = 0
	suma = 0
	for i in (lista):
		suma = i + suma
	promedio = suma / len(lista)
	return promedio 

def obtener_tabla(a, numero2):
	cont = 1
	cadena = "Tabla del %d\n" % (a)
	while cont <= numero2:
		total = a * cont
		cadena = "%s%d * %d = %d\n" % (cadena, a, cont, total)
		cont = cont + 1
	return cadena

def reporte_persona(nombre, ciudad, pais):
	cadena = "\t\t%s\nCiudad: %s\nPais: %s" % (nombre, ciudad, pais)
	return cadena