📌 Bubble Sort em Python – Versão Tradicional vs Otimizada
📖 Descrição

Este projeto foi desenvolvido para a disciplina de Estrutura de Dados com o objetivo de implementar e analisar o algoritmo de ordenação Bubble Sort na linguagem Python.

Foram implementadas duas versões do algoritmo:

✅ Versão tradicional

🚀 Versão otimizada (com interrupção antecipada)

O projeto também inclui testes de desempenho utilizando listas grandes para comparar o comportamento das duas implementações.

🧠 Sobre o Bubble Sort

O Bubble Sort é um algoritmo de ordenação simples baseado na comparação de elementos adjacentes.

Funcionamento:

Percorre o vetor comparando dois elementos vizinhos.

Se estiverem fora de ordem, realiza a troca.

A cada passagem, o maior elemento da parte não ordenada é movido para o final.

O processo se repete até que toda a lista esteja ordenada.

🔹 Versão 1 – Bubble Sort Tradicional

Esta versão executa todas as passagens independentemente de a lista já estar ordenada.

Complexidade:

Melhor caso: O(n²)

Caso médio: O(n²)

Pior caso: O(n²)

Ela sempre percorre completamente a estrutura, mesmo que nenhuma troca seja necessária.

🔹 Versão 2 – Bubble Sort Otimizado

Nesta versão foi adicionada uma variável de controle chamada houve_troca.

Como funciona a otimização:

A cada passagem, o algoritmo verifica se ocorreu alguma troca.

Se nenhuma troca for realizada, significa que a lista já está ordenada.

O algoritmo encerra antecipadamente usando break.

Complexidade:

Melhor caso: O(n)

Caso médio: O(n²)

Pior caso: O(n²)

Essa melhoria reduz comparações desnecessárias quando o vetor já está ordenado ou quase ordenado.

🛠️ Tecnologias Utilizadas

Python 3

Biblioteca time para medição de desempenho

Biblioteca random para geração de listas de teste

📂 Estrutura do Projeto
BubbleSort/
│
├── bubble_sort_tradicional.py
├── bubble_sort_otimizado.py
└── README.md
🧪 Testes de Desempenho

Foram realizados testes utilizando listas grandes, incluindo:

Listas já ordenadas

Listas aleatórias

Listas quase ordenadas

Nos testes com listas já ordenadas, a versão otimizada apresentou desempenho significativamente superior, pois encerra na primeira passagem.

Já em listas totalmente desordenadas, ambas apresentaram comportamento semelhante, mantendo complexidade O(n²).

▶️ Como Executar

Certifique-se de ter o Python 3 instalado.

Clone o repositório:

git clone https://github.com/seu-usuario/nome-do-repositorio.git

Acesse a pasta do projeto:

cd nome-do-repositorio

Execute qualquer uma das versões:

python bubble_sort_tradicional.py

ou

python bubble_sort_otimizado.py
📊 Análise dos Resultados

A principal diferença entre as versões ocorre no melhor caso:

📌 Versão tradicional continua executando todas as iterações.

📌 Versão otimizada interrompe assim que detecta que não há trocas.

Isso torna a versão otimizada mais eficiente para listas já ordenadas ou parcialmente ordenadas.

Entretanto, no pior caso, ambas continuam apresentando complexidade quadrática, o que limita o uso do Bubble Sort para grandes volumes de dados.

🎯 Conclusão

Com esta atividade foi possível:

Compreender o funcionamento interno do Bubble Sort

Analisar sua complexidade

Implementar uma melhoria simples e eficiente

Comparar desempenho entre versões

O Bubble Sort é um algoritmo didático, fundamental para entender os conceitos básicos de ordenação e análise de eficiência algorítmica.
