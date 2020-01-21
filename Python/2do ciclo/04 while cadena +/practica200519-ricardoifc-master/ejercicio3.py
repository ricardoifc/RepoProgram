"""
file: ejercicio3.py
@ricardoifc
"""
numeroEstudiante = input("ingrese el número de estudiantes\t")
numeroEstudiante = int(numeroEstudiante)
cadena = ""

contador = 1
promedioTotal = 0
valorPormedioTotal=0

while contador <= numeroEstudiante:
	nombre = input("ingrese su nombre\t")
	apellido = input("ingrese su apellido\t")
	nota = input("ingrese una nota\t")
	nota2 = input("ingrese una nota2\t")

	nota = float(nota)
	nota2 = float(nota2)

	promedio = (nota + nota2)/2
	promedioTotal = promedio + promedioTotal

	cadena = "%s%s %s, con notas:\n%f\n%f\ntiene un promedio de %f\n" % \
	(cadena, nombre, apellido, nota, nota2, promedio)
	contador = contador + 1

numeroEstudiante = float(numeroEstudiante)
valorPormedioTotal = promedioTotal / numeroEstudiante
cadena = "%sEl promedio del curso es %f" % (cadena, valorpromedioTotal)
print(cadena)