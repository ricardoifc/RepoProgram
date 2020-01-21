"""
	@ricardoifc
	ejercicio3
"""
lista = [(100,2), (20, 4), (30, 1)]
lista2 = ["b", "a", "c"]
# las dos listas las uno con zip y en la primera lista tomo la primera posicion y la segunda reversa
print(list(zip((sorted(lista, key = lambda x: x[0])), (sorted(map(lambda x: x.upper(), lista2), reverse=True)))))