public class Main {

    private CustomList nwcustomList = new CustomList(50000);
    private int[] arrList = nwcustomList.getCustomList();

    public static void  main(String [] args){
        new Main().run();
    }

    public void run(){
        long startTime = System.currentTimeMillis();
        //run code
        assignment1();
        //assignment2();
        //assignment3();
        //assignment4();
        //assignment5();
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
    }

    private void assignment3() {
    }

    private void assignment4() {
    }

    private void assignment5() {
    }


}
