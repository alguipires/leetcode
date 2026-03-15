# !/bin/python3

import os


#
# Complete the 'contacts' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts 2D_STRING_ARRAY queries as parameter.
#

def contacts(queries):
    # instancia as variaveis auxiliares e o dicionário que irá armazenar a trie
    trie_dict = {}
    results = []

    for queri in queries:
        # Faço a separação da tupla de queries
        operation = queri[0]
        word = queri[1]

        # verifico a operação conforme a 1 tupla
        if operation == "add":
            # passo para uma nova variavel o dict global da trie, para que eu possa navegar por ele
            current_trie = trie_dict
            # iteraçã oem cada letra da palavra a ser adicionada
            for char in word:
                # se não tem a letra no dict atual, adiciona ela com um contador de 0
                if not char in current_trie:
                    current_trie[char] = {'_count': 0}
                # se tem a letra acesso o dict da letra e incremento o contador de palavras que passam por ela
                current_trie = current_trie[char]
                current_trie['_count'] += 1

        elif operation == "find":
            # operação de busca no dict nested, passa o dict global para a variavel auxiliar
            current_trie = trie_dict
            counter = 0

            # para cada letra da palavra a ser buscada, verifico se ela existe no dict atual, se sim acesso o dict da letra e pego o contador de palavras que
            # passam por ela, se não tem a letra no dict atual, significa que não tem nenhuma palavra que começa com aquele prefixo, então o contador é 0 e eu quebro o loop
            for char in word:
                if char in current_trie:
                    current_trie = current_trie[char]
                    counter = current_trie['_count']
                else:
                    counter = 0
                    break

            results.append(counter)

    return results


if __name__ == '__main__':
    queries_row = ['add hack', 'add hackerrank', 'find hac', 'find hak']

    queries = []

    for i in (queries_row):
        queries.append(i.rstrip().split())

    result = contacts(queries)

    print(result)
