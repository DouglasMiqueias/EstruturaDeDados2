//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[] vetor = new int[10];

    for(int i = 0; i < vetor.length; i++)
    {
        vetor[i] = (int) Math.floor(Math.random() * vetor.length);
    }

    System.out.println("Vetor desordenado " + Arrays.toString(vetor));

    quickSort(vetor, 0, vetor.length - 1);

    System.out.println("Vetor ordenado " + Arrays.toString(vetor));


}

static void quickSort(int[] vetor, int esquerda, int direita)
{
    if(esquerda < direita)
    {
        int p = particao(vetor, esquerda, direita);
        quickSort(vetor, esquerda, p);
        quickSort(vetor, p + 1, direita);
    }

}

static int particao(int[] vetor, int esquerda, int direita)
{
    int meio = (int) (esquerda + direita) / 2;
    int pivot = vetor[meio];
    int i = esquerda - 1;
    int j = direita + 1;

    while(true){
        do{
            i++;
        }while(vetor[i] < pivot);
        do{
            j--;
        } while(vetor[j] > pivot);
        if(i >= j){
            return j;
        }
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }

}
