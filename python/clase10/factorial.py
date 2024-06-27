def factorial(n):
    # verificar que el numero sea mayor o igual a 0
    if n < 0:
        return "El numero debe ser mayor o igual a 0"
    # si el numero es 0 , el factorial es 1
    if n == 0:
        return 1
    
    # recursivo : n * factorial de (n-1)
    return n * factorial(n-1)

    # solicitar al usuario un numero 
numero = int(input("Introduzca un numero mayor o igual a 0: "))

    # calcular el factorial e imprimir el resultado
resultado = factorial(numero)
print(f"El factorial de {numero} es {resultado}")