class Quick {

   /*
   *  QUICK SORT
   *
   * @params: int arr, leftBound, rightBound
   *
   */
  
   public void quickSort(int[] arr, int i, int j) {
      if(i < j) {
         comparisons++;
         int pos = partition(arr, i, j);
         quickSort(arr, i, pos - 1);
         quickSort(arr, pos + 1, j);
      }
   }

   private int partition(int[] arr, int i, int j) {
      int pivot = arr[j];
      int small = i - 1;

      for(int k = i; k < j; k++) {
         if(arr[k] <= pivot) {
            small++;
            swap(arr, k, small);
         }
      }

      swap(arr, j, small + 1);
      return small + 1;
   }

   private void swap(int[] arr, int k, int small) {
      int temp;
      temp = arr[k];
      arr[k] = arr[small];
      arr[small] = temp;
   }


}