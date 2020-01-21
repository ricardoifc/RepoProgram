"""
	@ricardoifc
	Problema 2
"""
notas = [(5, 5, 10), (10, 2, 4), (10, 1, 9), (10, 2, 3)]

nota1 = lambda x: x[0]
nota2 = lambda x: x[1]
nota3 = lambda x: x[2]
funcion = lambda x: (nota1(x) + nota2(x) + nota3(x))
print(list(map(funcion, notas)))