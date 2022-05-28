class Hashentry {
   private int key;
   private char value;
   
   HashEntry(int key, char value) {
      this.key=key;
      this.value=value;
   }
   
   public int getKey() {
      return key;
   }
   
   public char getValue(){
      return value;
   }
}

class HashMap {
   int tableSize = 200;
   //200, 400, 700
   HashEntry[] table;
   
   HashMap() {
      table = new HashEntry[tableSize];
      for (int i = 0; i<tableSize; i++) {
         table[i]=null;
         }
      
      }
     public int get(int key) {
        int hash = (key % tableSize);
         while(table[has] != null && table[hash].getKey() != key){
           hash = (hash +1) % tableSize;
           }
            if(table[hash] == null) {
               return -1;
            }
            else {
               return table[hash].getValue();
            }
         
      }
   //}
}

public class FunHashYay {

}