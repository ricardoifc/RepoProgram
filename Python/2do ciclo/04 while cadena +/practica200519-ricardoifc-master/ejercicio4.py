"""
file: ejercicio3.py
@ricardoifc
"""
"""
numeroEstudiante = input("ingrese el número de estudiantes\t")
numeroEstudiante = int(numeroEstudiante) 
"""
cadena = ""

bandera = True
contador = 1
promedioTotal = 0
valorPormedioTotal=0

while bandera == True:
	nombre = input("ingrese su nombre\t")
	apellido = input("ingrese su apellido\t")
	nota = input("ingrese una nota\t")
	nota2 = input("ingrese una nota2\t")

	nota = float(nota)
	nota2 = float(nota2)

	promedio = (nota + nota2)/2
	promedioTotal = promedio + promedioTotal

	cadena = "%s%s %s, con notas:\n%.2f\n%.2f\ntiene un promedio de %.2f\n" % \
	(cadena, nombre, apellido, nota, nota2, promedio)
	opcion = input("¿Quiere seguir? s seguir y n acabar")
	if(opcion == "n"):
		bandera = False
	else:
		contador = contador + 1

contador = float(contador)
valorPormedioTotal = promedioTotal / contador
cadena = "%sEl promedio del curso es %.2f" % (cadena, valorPormedioTotal)
print(cadena)