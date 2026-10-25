package test;

public class block {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4,
                5, 6, 7, 8,
                9, 10, 11, 12};
        BlockInfo block1 = new BlockInfo(4, 0, 3);
        BlockInfo block2 = new BlockInfo(8, 4, 7);
        BlockInfo block3 = new BlockInfo(12, 8, 11);
        BlockInfo[] blocks = {block1, block2, block3};
        int number = 7;
        int index = getindex(blocks, arr, number);
        System.out.println(index);
    }

    public static int getindex(BlockInfo[] block, int arr[], int number) {
        int i = findblock(number, block);
        if (i == -1) {
            return -1;

        }
        int q = block[i].getStartlength();
        int p = block[i].getEndlength();
        for (int i1 = q; i1 < p; i1++) {
            if (number == arr[i1]) {
                return i1;
            }

        }
        return -1;


    }

    //确定在哪一块
    public static int findblock(int number, BlockInfo[] blocks) {
        for (int i = 0; i < blocks.length; i++) {
            if (number <= blocks[i].getMax()) {
                return i;
            }

        }
        return -1;
    }
}

class BlockInfo {
    private int max;
    private int startlength;
    private int endlength;

    public BlockInfo() {
    }

    public BlockInfo(int max, int startlength, int endlength) {
        this.max = max;
        this.startlength = startlength;
        this.endlength = endlength;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartlength() {
        return startlength;
    }

    public void setStartlength(int startlength) {
        this.startlength = startlength;
    }

    public int getEndlength() {
        return endlength;
    }

    public void setEndlength(int endlength) {
        this.endlength = endlength;
    }
}