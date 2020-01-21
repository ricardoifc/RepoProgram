class Error(Exception):
    """Clase base para excepciones en el módulo."""
    pass
# error de la marca
class añoFError(Error):
	"""docstring for MarcaError"""
	def __init__(self, arg):
		super(añoFError, self).__init__()
		self.arg = arg
# error de el pais
class PaisError(Error):
	"""docstring for PaisError"""
	def __init__(self, arg):
		super(PaisError, self).__init__()
		self.arg = arg
# error de el costo
class CostoError(Error):
	"""docstring for CostoError"""
	def __init__(self, arg):
		super(CostoError, self).__init__()
		self.arg = arg