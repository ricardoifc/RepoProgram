def suma(a, b):
	return a+b

def product(a, b):
	return a * b

def disparador(f, a, b):
	print(f(a, b))

disparador(product, 1, 10)
disparador(suma ,1, 10)
