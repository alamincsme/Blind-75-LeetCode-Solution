package heap;

public class HeapExample {
    public static int left(int i ){
        return  2 * i ;
    }

    public static int right (int i ) {
        return  2 * i + 1 ;
    }

    public static int parent(int i ) {
        return  i / 2 ;
    }

    public static boolean is_max_heap (int H[] , int heap_size) {
        int i , p ;

        for ( i = heap_size; i > 1 ; i--) {
            p = parent(i) ;
            System.out.printf("i = %d, p = %d\tH[i] = %d, H[p] = %d\n", i , p, H[i] , H[p]);
            if (H[p] < H[i]) {
                return false ;
            }
        }
        return true ;
    }


    public static void main(String[] args) {
        int heap_size = 9 ;
        int[] H = {0,19,7,17,3,5,12,10,1,2};

        //check heap
        boolean isHeap = is_max_heap(H, heap_size);
        if (isHeap) System.out.println("Max heap.");
        else System.out.println("is not max heap.");

//        i = 9, p = 4	H[i] = 2, H[p] = 3
//        i = 8, p = 4	H[i] = 1, H[p] = 3
//        i = 7, p = 3	H[i] = 10, H[p] = 17
//        i = 6, p = 3	H[i] = 12, H[p] = 17
//        i = 5, p = 2	H[i] = 5, H[p] = 7
//        i = 4, p = 2	H[i] = 3, H[p] = 7
//        i = 3, p = 1	H[i] = 17, H[p] = 19
//        i = 2, p = 1	H[i] = 7, H[p] = 19
//        Max heap.
    }

}
