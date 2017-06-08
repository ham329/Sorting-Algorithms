class Merge {

   /*
   *  MERGE SORT
   *  
   *  @params: int[] array, leftBound, rightBound
   *  @throws: none
   *  @return: none
   */
   public void mergeSort(int[] arr, int leftBound, int rightBound) {
      int mid = 0;
      //checks if leftBound is smaller than rightBound
      if(leftBound < rightBound) {
         mid = (leftBound + rightBound) / 2; //middle index of array
         mergeSort(arr, leftBound, mid); //sort the left side of the array
         mergeSort(arr, mid + 1, rightBound);//sort the right side of the array
         merge(arr, leftBound, mid, rightBound);//combine together
      }
   }
   
   private void merge(int[] arr, int i, int mid, int j) {
      int temp[] = new int[arr.length];
      int l = i;
      int r = j;
      int m = mid + 1;
      int k = l;
      
      while(l <= mid && m <= r) {
         //copy to temp array
         if(arr[l] <= arr[m]) {
            temp[k] = arr[l];
            k++;
            l++;
         }
         //copy to temp array
         else {
            temp[k] = arr[m];
            k++;
            m++;
         }
      }
      //swaps if l is less than mid
      while(l <= mid) {
         temp[k] = arr[l];//temp at index k gets assigned to l
         k++;
         l++;
      }
      
      while(m <= r) {
         temp[k] = arr[m]; 
         k++;
         m++;
         
      }
      
      //place everything back to original array
      for(int t = i; t <= j; t++) {
         arr[t] = temp[t];
      }
      
   }
}