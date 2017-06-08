class Insertion {

   /*
   *  INSERTION SORT
   *  
   *  @params: int[] array
   *  @throws: none
   *  @return: none
   */
   
   public void insertionSort(int[] input){
      int temp;//temp for swap
      for (int i = 0; i < input.length-1; i++){ //outerloop continues until end of array
         for(int j = i ; j > 0 ; j--){ //innerloop
            if(input[j] < input[j-1]){//checks if arr[j] is less than the previous index   
               //swap
               temp = input[j];
               input[j] = input[j-1];
               input[j-1] = temp;
            }
         }
      }
   } 
}