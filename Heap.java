class Heap {
   public class Node {
      private int input;
      
      public Node(int key) {
         this.input = key;
      }
     
      public int getKey(){
         return input;
      }
      public void setKey(int input){
         this.input=input;
      }
   }
   private Node[] heap;
   private int max;
   private int size;
  
  
   
   public Heap(int max){
      this.max = max;
      this.size = 0;
      heap = new Node[max];
   }

      
   public boolean insert(int key){
		if(isFull()){
			return false;
		}
		Node temp = new Node(key);
		heap[size] = temp;
		fixUp(size++);
		return true;
	}
   
	public void fixUp(int index){
		int parent = index-1 / 2;
		Node bottom = heap[index];
		
		while(index > 0 && heap[parent].getKey() < bottom.getKey()){
			heap[index] = heap[parent];							
			index = parent;
			parent = (parent - 1) / 2;
		}
		heap[index] = bottom;
	}
   
   public int deleteRoot(int[] arr){													
		int result = arr[0];
		arr[0] = arr[size-1];
      
		fixDown(0);
      System.out.println("The root ["+result + "] has been deleted. New root: ["+arr[size-1]+"]");
      arr[size-1] = 0;
		return result;
	}
   
   public void fixDown(int index){
		int largerChild;
		Node top = heap[index];										
		while(index < size/2){											
			int leftChild = 2 * index + 1;
			int rightChild = leftChild + 1;
		
			if(rightChild < size && heap[leftChild].getKey() < heap[rightChild].getKey()){		
				largerChild = rightChild;
			}
			else{
				largerChild = leftChild;
			}
			if( top.getKey() >= heap[largerChild].getKey() ){
				break;
			}
			heap[index] = heap[largerChild];
			index = largerChild;											
		}
		heap[index] = top;													
	}
	
   
   public void heapSort(int[] arr) {
      int i;
      for(i=arr.length-1;i>=0;i--){
      
         heapify(arr,i+1);
         swap(arr,0,i);
         
      }
   }
   
   public void heapify(int[] arr,int len) {
   
      int i,j,k;
      for(i=0;i<len;i++){
         j=i;
         k=(i-1)/2;
         
         while(k>=0&&arr[j]>arr[k]){
            swap(arr,j,k);
            j=j/2;
            k=k/2;
         }
      }
   }
   
   public void print(int[] arr) {
      System.out.print("heap[] = {");
      for(int i = 0; i<arr.length; i++) {
         System.out.print(arr[i]+", ");
      }
      System.out.print("}\n");
   }
   
   public void swap(int[] arr, int left, int right) {
      
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
   } 
   public int size() {
      return size;
   }
   public void setSize(int n) {
      this.size = n;
   }
   
   public boolean isFull() {
      return size==max;
   }

   
}