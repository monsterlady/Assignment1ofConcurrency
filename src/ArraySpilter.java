public class ArraySpilter  {
    private int[] firstPart;
    private int[] secondPart;
    public ArraySpilter(int[] arrarytospilt) {
        this.firstPart = new int[arrarytospilt.length / 2];
        this.secondPart = new int[arrarytospilt.length - firstPart.length];
        for(int i =0; i < arrarytospilt.length;i++) {
            if (i < firstPart.length) {
                firstPart[i] = arrarytospilt[i];
               // System.out.print(firstPart[i] + " ");
            } else {
                secondPart[i - arrarytospilt.length / 2] = arrarytospilt[i];
                //System.out.print( secondPart[i - firstPart.length] + " ");
            }
        }
    }

    public int[] getFirstPart() {
        return firstPart;
    }

    public int[] getSecondPart() {
        return secondPart;
    }
}
