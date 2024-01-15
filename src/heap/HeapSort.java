package heap;

public class HeapSort {
    public static int left (int i) {
        return 2 * i ;
    }
    public static int right(int i) {
        return 2 * i + 1 ;
    }

    public static int parent (int i ) {
        return  i / 2 ;
    }

   public static void max_heapify (int heap[] , int heap_size, int i) {
        int l , r , largest , t ;
        l = left(i);
        r = right(i);
        if (l < heap_size && heap[l] > heap [i]) {
            largest = l ;
        } else {
            largest = i ;
        }

        if (largest != i) {
            t = heap[i] ;
            heap[i] = heap[largest] ;
            heap[largest] = t ;

            max_heapify(heap, heap_size , largest);
        }
   }

   public static void print_heap (int[] heap , int heap_size) {
        int i ;
        for (i  = 1 ; i <= heap_size; i++) {
            System.out.print(heap[i] + " ");
        }
   }

    public static void main(String[] args) {
        int [] heap = {0, 19,7,12,3,5,17,10,1,2};
        print_heap(heap , heap.length - 1);
        System.out.println();
        max_heapify(heap , heap.length -1 , 3);
        print_heap(heap , heap.length - 1);
    }


}
