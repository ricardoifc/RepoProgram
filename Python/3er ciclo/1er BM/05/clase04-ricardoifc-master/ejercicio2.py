"""
	@ricardoifc
	ejercicio2
"""
lista = [(100,2), (20, 4), (30, 1)]
lista2 = ["b", "a", "c"]
# uno en un zip las dos listas
print(list(zip((sorted(lista2)),(sorted(lista, key = lambda x: x[1])))))