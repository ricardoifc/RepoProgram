"""
	@ricardoifc
	Problema 1
"""
#Se abre el archivo
file = open("promedios.txt")
promedio = file.read()
#Filtramos las notas superiores a 16.5
resultado = filter(lambda x: x <= 16.5, promedio)
#imprimimos la lista
print(list(resultado))