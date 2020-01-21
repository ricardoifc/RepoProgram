"""
	Ejercicio 2
	@ricardoifc
"""
#con x1, x2 son (cuenca, azuay) y los uso despues de los dos puntos
#creo mi cadena y despues hago que x1 se hagan mayusculas, imprimp la cadena
cadena_personalizada = lambda x1, x2: ("%s capital de %s" % (x1.upper(), 
	x2.upper()))
print(cadena_personalizada("Cuenca","Azuay"))