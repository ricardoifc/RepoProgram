"""
	@ricardoifc
"""
"""
Dadas las siguiente ciudades, filtrar aquellas que tienen un número par como longitud en sus caracteres.

Loja, Pichincha, Guayaquil, Zamora, Ibarra, Manabi, Machala,  Portoviejo, Macas
"""
ciudad = ["Loja", "Pichincha", "Guayaquil", "Zamora", "Ibarra", "Manabi", 
"Machala", "Portoviejo", "Macas"]
validar = filter(lambda x: len(x)%2 == 0, ciudad)
print(list(validar))