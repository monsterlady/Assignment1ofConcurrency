public class ArrayMerger {
    private int[] mergedArray;

    public ArrayMerger(int[] array1,int[] array2) {
        this.mergedArray = new int[array1.length + array2.length];
        int index1 = 0;
        int index2 = 0;
        int indexMergedArray = 0;

        while(true){
            if(index1 < array1.length && index2 < array2.length){
                if (array1[index1] < array2[index2]) {
                    mergedArray[indexMergedArray] = array1[index1];
                    indexMergedArray++;
                    index1++;
                } else if (array1[index1] > array2[index2]) {
                    mergedArray[indexMergedArray] = array2[index2];
                    indexMergedArray++;
                    index2++;
                }
            } else if (index2 < array2.length){
                mergedArray[indexMergedArray] = array2[index2];
                indexMergedArray++;
                index2++;
                break;
            } else if (index1 < array1.length){
                mergedArray[indexMergedArray] = array1[index1];
                indexMergedArray++;
                index1++;
                break;
            } else {
                break;
            }
        }
    }

    public int[] getMergedArray() {
        return mergedArray;
    }
}
