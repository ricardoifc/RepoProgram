"""
file: ejercicio1.py
@ricardoifc
"""

nombre = input("ingrese su nombre\t")
nota = input("ingrese una nota\t")
nota2 = input("ingrese una nota2\t")

nota = float(nota)
nota2 = float(nota2)

promedio = (nota + nota2)/2

cadena = "Estudiante con %s, tiene un promedio de %f" % \
	(nombre, promedio)
print(cadena)