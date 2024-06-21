# Operadores aritmeticos
operandoA = 8
OperandoB = 5

#Ejercicio 4.1

suma = operandoA + OperandoB
print(f"resultado de la suma: {suma}")
print(f"El resultado de la suma es: {suma}")

resta = operandoA - OperandoB
print(f"El resultado de la resta es: {resta}")

multiplicacion = operandoA * OperandoB
print(f"El resultado de la multiplicacion es: {multiplicacion}")

Division = operandoA / OperandoB
print(f"El resultado de la Division es: {Division}")

Division = operandoA // OperandoB
print(f"El resultado de la Division int es: {Division}")

Modulo = operandoA % OperandoB
print(f"El resultado del Modulo es: {Modulo}")

exponente = operandoA ** OperandoB
print(f"El resultado del exponente es: {exponente}")


#Ejercicio 4.2 Rectangulo

alto = int(input("Proporciona el alto del rectangulo: "))
ancho = int(input("Proporciona el ancho del rectangulo: "))
area = alto * ancho
perimetro = (alto + ancho) * 2
print("Area: ", area)
print("Perimetro: ", perimetro)


#Ejercicio 4.3 Operadores de asignacion y comparacion

miVariable3 = 10
print(miVariable3)
miVariable3 += 1
print(miVariable3)

miVariable3 -= 2 
print(miVariable3)

miVariable3 *= 3
print(miVariable3)

miVariable3 /= 2
print(miVariable3)


#Ejercicio 4.3 Operadores de comparacion

d = 4
b = 2
resultado = d == b # comprobamos si son iguales
print (resultado)

#Operador Mayor que 
resultado = d > b 
print(resultado)


#Operador Menor que 
resultado = d < b 
print(resultado)


#4.4 Ejercicio 1 y 2

a = int(input("Digite un Numero: "))
print(f"El residuo de la division es: {a % 2}")
if a % 2 == 0:
  print(f"El valor de a es: {a} es un numero PAR")
else:
  print(f"El valor de a es: {a} es un numero IMPAR")


  edadAdulto = 18
  edadPersona = int(input("Digite su edad: "))
  if edadPersona >= edadAdulto:
    print(f"Su edad es: {edadPersona} es mayor de edad")
  else:
     print(f"Su edad es: {edadPersona} es menor de edad")