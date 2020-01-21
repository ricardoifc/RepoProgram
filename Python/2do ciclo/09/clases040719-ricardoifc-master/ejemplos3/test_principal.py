"""
	Ejemplo de test de código
"""
from principal import promedio_notas
def test_obtener_suma():
	a = 10
	b = 5
	assert 15 == obtener_suma(a, b)

def test_promedio_notas():
	"""
	Dadas unas notas, encontrar el promedio de ellas
	"""
	n1 = 10
	n2 = 10
	n3 = 10
	assert 10 == promedio_notas(n1, n2, n3)
