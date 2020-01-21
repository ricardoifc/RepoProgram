"""
	@ricardoifc
"""
# Funcional - aplicando función filter

datos = [18, 19, 20, 10, 11, 12]

resultado = filter(lambda x: x >= 18 or x <= 10, datos)
print(resultado)
print(list(resultado))