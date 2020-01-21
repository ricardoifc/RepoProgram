"""
file: ejercicio2.py
@ricardoifc
"""
numeroEstudiante = input("ingrese el número de estudiantes\t")
numeroEstudiante = int(numeroEstudiante)
cadena = ""
cadena = "%sIngreso de nombres y notas de estudiantes\n" %\
		(cadena)

contador = 1

while contador <= numeroEstudiante:
	nombre = input("ingrese su nombre\t")
	nota = input("ingrese una nota\t")
	nota2 = input("ingrese una nota2\t")

	nota = float(nota)
	nota2 = float(nota2)

	promedio = (nota + nota2)/2

	cadena = "%sEstudiante con %s, tiene un promedio de %f\n" % \
		(cadena, nombre, promedio)
	print(cadena)
	contador = contador + 1