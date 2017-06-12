package HW;

public class ArrayList{

        private final static int ArrayListSize = 10;
        private int[] array;
        private int size;

        public ArrayList(){
            this.size = 0;
            array = new int[ArrayListSize];
        }
        public  void  add(int value){
            if(size == array.length){
                int[] newArray = new int[array.length*2];
                System.arraycopy(array,0,newArray,0,size);
                array = newArray;
            }
            array[size++]= value;
         }
         public void print(){
            if (size>0){
             System.out.println("List: ");
             for (int i = 0; i <size ; i++) {
                 System.out.print(array[i]+" ");
             }
             System.out.println();
            }else{
                System.out.println("List is empty.");
            }

         }
         public int getValueByIndex(int index){
             int result = 0;
             if(index>=0 && index<size){
             for (int i = 0; i < size ; i++) {
                 if(index == i){
                     result = array[i];
                    }
                }
             } else {
                 throw new IndexOutOfBoundsException("Index out of bounds ");
             }
              return result ;
         }
         public void contains(int value){
             boolean flag = false;
             for (int i = 0; i < size ; i++) {
                 if (value == array[i]) {
                     flag = true;
                 }
             }
             if(flag){
                 System.out.println("There is such value!");
             } else {
                 System.out.println("There is not such value!");
             }
         }
          public void clear(){
              for (int i = 0; i < array.length ; i++) {
                  if(size > 0){
                      array[i]= 0;
                      --size;
                  } else{
                      break;
                  }
              }

          }
          public int indexOf (int value){
              int result = 0;
              for (int i = 0; i < size ; i++) {
                  if(value == array[i]){
                      result = i;
                  }
              }
              return result;
          }
          public int getSize(){
              int count = 0 ;
              for (int i = 0; i < size ; i++) {
                  count++;
              }
              return  count;
          }
          public void sort(){
              int step = size/2;
              while (step>0){
                  for( int i=0; i< (size - step); i++){
                     int j = i;
                      while(j>= 0 && array[j]>array[j+step]){
                          int temp = array[j];
                          array[j] = array[j + step];
                          array[j + step] = temp;
                          j--;
                      }
                  }
                  step = step/2;
              }
              for (int i = 0; i <size ; i++) {
                  System.out.println( array[i]);
              }
          }
          public void addAll(ArrayList newArray){
              for (int i = 0; i<newArray.getSize(); i++){
                  this.add(newArray.getValueByIndex(i));
              }
          }





}
