"""
	: run.pyfile
	autor: @ricardoifc
"""

from misvariables import *

# uso de condicial simple

nota = input("Ingrese la nota 1\n")
nota2 = input("Ingrese la nota 2\n")
nota = int(nota)
nota2 = int(nota2)

if nota >= 18:
	print("%s - %d" % (mensaje,nota))
else:
	print("%s - %d" % (mensaje2,nota2))

if nota2 >= 18:
	print("%s - %d" % (mensaje,nota))
else:
	print("%s - %d" % (mensaje2,nota2))
