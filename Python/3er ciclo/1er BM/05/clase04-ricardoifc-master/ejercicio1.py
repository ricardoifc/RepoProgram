"""
	@ricardoifc
	ejercicio1
"""
listaA = [10, 2, 3, 4]
listaB = ["a", "b", "c", "d"]

lista1 = (sorted(listaA))
lista2 = (sorted(listaB, reverse=True)) # convierto en reversa la lista
listaFinal = list(zip(lista1, lista2)) #uno la lista
print(listaFinal) # imrpimo la lista