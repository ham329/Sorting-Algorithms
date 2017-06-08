class Selection {

   /*
   *  SELECTION SORT 
   *  
   *  @params: int[] array
   *  @throws: none
   *  @return: none
   */
   
   public void selectionSort(int arr[]) {
      int n = arr.length;
   
      for(int i = 0; i < n; i++) { //outer loop that continues until last index
         int small = arr[i]; //small is now the first index of the array
         int pos = i; //keep track of position
      
         for(int j = i + 1; j < n; j++) {//innerloop thats offset by 1 
            if(arr[j] < small) { //checks if arr[j] is smaller than 'small', if true, that is now new small
             
               small = arr[j]; //new small if true
               pos = j;
            }
         }
         //swap the minimum element with the current index
         int temp = arr[pos];  
         arr[pos] = arr[i]; 
         arr[i] = temp;
      }
   }
}