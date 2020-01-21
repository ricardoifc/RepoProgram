"""
	@ricardoifc
"""
"""
Dado un conjunto de palabras, filtrar todas aquellas que sean palindromas
"""
palabras = ["oro", "pais", "ojo", "oso", "radar", "sol", "seres"]
reversa = filter(lambda x: "".join(reversed(x)) == x, palabras)
print(list(reversa))