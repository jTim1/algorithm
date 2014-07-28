
public class Sort<T> {

    public void insertionSort(int tab[]) {
        int temp = 0;
        int i, j;
        for (i = 1; i < tab.length; i++) {
            temp = tab[i];
            for (j = i; j > 0 && tab[j - 1] > temp; j--) {
                tab[j] = tab[j-1];
            }
            tab[j] = temp;
        }
    }

    public void selectionSort(int tab[]) {
        for(int i=0;i<tab.length-1;i++) {
            int min=i;
            for(int j=i+1;j<tab.length;j++) {
                if(tab[j]<tab[min]){
                    min = j;
                }
            }
            int temp = 0;
            if (min != i) {
                temp = tab[min];
                tab[min] = tab[i];
                tab[i] = temp;
            }
        }
    }

    public void mergeSort(int tab[]) {
        recursiveMergeSort(tab, 0, tab.length - 1);
    }

    private void recursiveMergeSort(int[] tab, int g, int d) {
        if(g==d){
            return;
        }
        int middle = (d+g)/2;
        recursiveMergeSort(tab, g, middle);
        recursiveMergeSort(tab, middle+1, d);
        int[] resultMerge = new int[d-g+1];
        merge(tab, g, middle, d, resultMerge);
    }

    void merge(int[] tab, int g, int middle, int d, int[] resultMerge) {
        int i=g;
        int j=middle+1;
        int k=0;
        while(k<resultMerge.length) {
            if (i > j) {
                resultMerge[k++] = tab[j];
                continue;
            }
            if(j > d) {
                resultMerge[k++] = tab[i];
                continue;
            }
            if (tab[i] < tab[j]) {
                resultMerge[k++] = tab[i++];
            }
            else {
                resultMerge[k++] = tab[j++];
            }
        }
    }

    public void shellSort(char tab[]) {
        int initialStep = 1;
        while (initialStep < tab.length / 3) {
            initialStep = initialStep * 3 + 1;
        }
        for (int currentStep = initialStep; currentStep >= 1; currentStep /= 3) {
            for (int i = currentStep; i < tab.length; i++) {
                int temp=tab[i];
                int j;
                for (j = i; j >= currentStep && tab[j] <= tab[j - currentStep]; j -= currentStep) {
                    if(temp<tab[j-currentStep]) {
                        tab[j]=tab[j-currentStep];
                    }
                    else {
                        break;
                    }
                }
                tab[j]= (char) temp;
            }
        }
    }

    void swap(char[] tab, int i, int j) {
        char temp;
        temp=tab[i];
        tab[i]=tab[j];
        tab[j]=temp;
    }
}
