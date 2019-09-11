public class BubbleSort implements Runnable{

    private int [] arrList;
    private int lengthofArr;

    public BubbleSort(int [] arr) {
        this.arrList = arr;
        this.lengthofArr = arrList.length;
    }

    @Override
    public void run(){

        for(int i = 0; i < lengthofArr - 1; i++){
            for(int l = 0; l < lengthofArr - 1 -i; l++){
                if(arrList[l] > arrList[l+1]){
                    int holder = 0;
                    holder  = arrList[l+1];
                    arrList[l+1] = arrList[l];
                    arrList[l] = holder;
                }
            }
        }
        getArrList();
    }

    public int[] getArrList() {
        return arrList;
    }
}
