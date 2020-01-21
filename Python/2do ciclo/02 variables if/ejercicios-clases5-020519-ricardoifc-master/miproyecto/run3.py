"""
	: run.pyfile
	autor: @ricardoifc
	nota mayor o igual a 18; sobresaliente
	nota mayor o igual a 16 y menor a 18: muy buena
	nota mayor o igual a 13 y menor a 16: buena
	nota menor a 13: insuficiente
"""

from misvariables import *

# uso de condicial simple

nota = input("Ingrese la nota 1\n")
nota = int(nota)

if nota >=18:
	print("%s - %d" % ("Sobresaliente",nota))
else:
	if (nota >=16) and (nota <18):
		print("%s - %d" % ("Muy buena",nota))
	else:
		if (nota >=13) and (nota <18):
			print("%s - %d" % ("Buena",nota))
		else:
			print("%s - %d" % ("Insuficiente",nota))
	
