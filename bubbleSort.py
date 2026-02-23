import time
import random

def bubbleSort(lista_grande_ordenada):  
    n = len(lista_grande_ordenada)  
    for j in range(n):
        for i in range(n-1-j):
            if(lista_grande_ordenada[i] > lista_grande_ordenada[i+1]):
                lista_grande_ordenada[i], lista_grande_ordenada[i+1] = lista_grande_ordenada[i+1], lista_grande_ordenada[i]
    return lista_grande_ordenada

#lista = random.sample(range(1, 1001), 1000)
#print("Lista original:", lista)

inicio = time.time()
#sorted_lista = bubbleSort(lista)
#lista_ordenada = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
lista_grande_ordenada = list(range(1, 1000001))
#lista_quase_ordenada = [1, 2, 3, 4, 6, 5, 7, 8, 9, 10]
fim = time.time()

print("Lista ordenada:", lista_grande_ordenada)
print(f"Tempo de execução: {fim - inicio:.6f} segundos")