public class Main {

    private CustomList nwcustomList = new CustomList(25000);
    private int[] arrList = nwcustomList.getCustomList();

    public static void  main(String [] args){
        new Main().run();
    }

    public void run(){
        System.out.println("\n Project begins now! ");
        long startTime = System.currentTimeMillis();
        //run code
        //assignment1();
       // assignment2();
       // assignment3();
        long endTime = System.currentTimeMillis();
        System.out.println("\nProject spent " + (endTime - startTime) + " ms");

    }

    private void assignment1() {
        BubbleSort bubbleSort = new BubbleSort(arrList);
        //bubbleSort.getArrList();
        Thread a1 = new Thread(bubbleSort);
        a1.start();
        try{
            a1.join();
        } catch (InterruptedException i){
            i.printStackTrace();
        }
    }

    private void assignment2() {
        ArraySpilter arraySpilter = new ArraySpilter(arrList);
        BubbleSort bubbleSort1 = new BubbleSort(arraySpilter.getFirstPart());
        BubbleSort bubbleSort2 = new BubbleSort(arraySpilter.getSecondPart());

        Thread thread1 = new Thread(bubbleSort1);
        Thread thread2 = new Thread(bubbleSort2);

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            //
            e.printStackTrace();
        }

        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            //
            e.printStackTrace();
        }

        ArrayMerger arrayMerger = new ArrayMerger(bubbleSort1.getArrList(),bubbleSort2.getArrList());
        for(int i : arrayMerger.getMergedArray()){
        System.out.print(i + " ");
        }
    }

    private void assignment3() {
        ArraySpilter arraySpilter = new ArraySpilter(arrList);
        BubbleSort bubbleSort1 = new BubbleSort(arraySpilter.getFirstPart());
        BubbleSort bubbleSort2 = new BubbleSort(arraySpilter.getSecondPart());

        Thread thread1 = new Thread(bubbleSort1);
        Thread thread2 = new Thread(bubbleSort2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            //
            e.printStackTrace();
        }

        ArrayMerger arrayMerger = new ArrayMerger(bubbleSort1.getArrList(),bubbleSort2.getArrList());
        for(int i : arrayMerger.getMergedArray()){
            System.out.print(i + " ");
        }
    }
}
