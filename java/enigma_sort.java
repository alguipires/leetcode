/*
public class enigma_sort {
    #include<stdio.h>
    #include<stdlib.h>
    #include<time.h>
    #define TAM 10
    int main()
    {
        srand(time(NULL));
        printf("Enigma Sort\n");
        printf("===========\n\n\n");
        int dados[TAM], i = 0;
        printf("Sequencia Gerada\n");
        printf("----------------\n");
        for (i = 0; i < TAM; i++) // gera numeros aleatorios e insere na matriz
        {
            dados[i] = rand() % 100;
            printf("%2d ", dados[i]);
        }
        int j, aux;
        bool flag;
        do //do while para ordenação
        {
            for(i = 0; i < TAM; i++)
            {
                j = rand() % TAM; // numero aleatorio do tamanha da matriz
                if (i != j)
                {
                    aux = dados[i];
                    dados[i] = dados[j];
                    dados[j] = aux;
                }
            }
            flag = true; // marcação para que está ordenado
            for (i = 1; flag && (i < TAM); i++) // loop para ficar verificando se todos os elementos estão ordenados
            {
                if (dados[i] < dados[i-1]) // se não está ordenado recebe false e do while continuara executando
                    flag = false;
            }
        } while (!flag); // loop até que flag receba true
        printf("\n\n");
        printf("Sequencia Ordenada\n");
        printf("------------------\n");
        for (i = 0; i < TAM; i++) // imprime a matriz ordenada
            printf("%2d ", dados[i]);
        return(0);
    }
}
*/
