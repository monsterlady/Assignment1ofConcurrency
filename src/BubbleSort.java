public class BubbleSort implements Runnable{

    private int [] arrList;
    private int lengthofArr;

    public BubbleSort(int [] arr) {
        this.arrList = arr;
        this.lengthofArr = arrList.length;
    }

    @Override
    public void run(){
        int temp = 0;
        boolean swap;
        for (int i = arrList.length - 1; i > 0; --i) { // 每次需要排序的长度
            swap=false;
            for (int j = 0; j < i; ++j) { // 从第一个元素到第i个元素
                if (arrList[j] > arrList[j + 1]) {
                    temp = arrList[j];
                    arrList[j] = arrList[j + 1];
                    arrList[j + 1] = temp;
                    swap=true;
                }
            }
            if (!swap){
                break;
            }
        }
    getArrList();
}

    public int[] getArrList() {
        return arrList;
    }
}
