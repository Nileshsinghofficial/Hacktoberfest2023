class BinarySearch{  
 public static void binarySearch(int a[], int i, int j, int key){  
   int mid = (i + j)/2;{
   while( i <= j ){  
      if ( a[mid] < key ){  
        i = mid + 1;     
      }else if ( a[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         j = mid - 1;  
      }  
      mid = (i + j)/2;
      
       
   } 

   if(a[mid]==x) 
    return(mid);  
    
   if ( i > j ){  
      System.out.println("Element is not found!");  
   }  
 }  
 public static void main(String args[]){  
        int a[] = {10,20,30,40,50,60,55,69};  
        int key = 69;  
        int j=a.length-1;
        binarySearch(a,0,j,key);     
 }  

