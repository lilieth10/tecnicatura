# Sentencia if/else
condicion = True

if condicion == True:
    print('Condición Verdadera')
elif condicion == False:
    print('Condición Falsa')
else:
    print('condición sin especificar')



#Ejecución Debug en if/else

condicion = 10

if condicion == True:
    print('Condición Verdadera')
elif condicion == False:
    print('Condición Falsa')
else:
    print('condición sin especificar')



#Ejercicio: Conversión de número a texto

num = int(input('Digite un número en el rango del 1 al 3:'))
numTexto = ''
if num == 1:
  numTexto = 'Número uno'
elif num == 2:
  numTexto = 'Número dos'
elif num == 3:
  numTexto = 'Número tres'
else:
  numTexto = 'Has ingresado un número fuera de rango'
print(f'El número ingresado es: {num} - {numTexto}')

#6.2 Ejercicio 1

a = float(input('Digite el valor de a:'))
b = float(input('Digite el valor de b:'))
c = float(input('Digite el valor de c:'))
resultado = (a ** 3 * (b ** 2 - 2 * a * c)) / (2*b)
print(f"El resultado es : {resultado} ")


#6.3 Sintaxis simplificada (Operador Ternario)

condicion =  False
print("Condicion Verdadera") if condicion else print("Condicion Falsa")