"""
	@ricardoifc
	Problema 3
"""
fraseSplit = []
frase= ("No hay medicina que cure lo que no cura la felicidad")
palabras = ["medicina", "cure" ,"cura", "felicidad"]
fraseSplit = (frase.split())
print(fraseSplit)
resultado = filter(lambda x1, x2: x1 == x2 ,fraseSplit, palabras)
print(resultado)