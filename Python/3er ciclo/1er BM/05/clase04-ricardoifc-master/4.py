"""
	@ricardoifc
	ejercicio3
"""
lista = [(100,2), (20, 4), (30, 1)]
lista2 = ["b", "a", "c"]
print(list(zip((sorted(lista, key = lambda x: x[0])), (sorted(map(lambda x: x.upper(), lista2), reverse=True)))))