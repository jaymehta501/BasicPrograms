package Arrays;

public class LongestPositiveSequence {
	public void longestPositiveSequence(int[] numbers){
		
	    int maxSeqIndexinArray = 0;
	    int curSeqIndexinArray = 0;
	    boolean seqflag = false;
	    int maxSeqLen = 0;
	    int curSeqLen = 0;
	    
	    int[] result = new int[numbers.length];
	    
	    for (int i =0; i<numbers.length; i++){
	        
	        if (numbers[i] > 0) {
	            
	            if (seqflag == true){
	                
	                curSeqLen++;
	            }
	            
	            else {
	                
	                curSeqLen = 1;
	                seqflag = true;
	                curSeqIndexinArray = i;
	            }
	            
	        }else {
	            
	            if(curSeqLen>maxSeqLen){
	                
	                maxSeqLen = curSeqLen;
	                maxSeqIndexinArray = curSeqIndexinArray;
	            }
	            
	            seqflag = false;
	            
	        }
	        
	        
	    }
	    
	    if (maxSeqLen>0){
	        
	        System.out.println(maxSeqLen);
	        
	        System.out.print("[");
	        
	        for(int i = maxSeqIndexinArray; i < numbers.length; i++){
	            
	              
	            if (numbers[i]>0){
	            	
	            	System.out.print(numbers[i] + ",");
	            } 
	            
	            else {
	            	System.out.print("]");
	            	break;}
	            
	        } 
	        
	    }
		
	}
	
	public static void main(String[] args){
		LongestPositiveSequence sequence = new LongestPositiveSequence();
		int a[] = new int[] {1,2,-3,2,3,4,-6,1,2,3,4,5,-8,5,6};
		sequence.longestPositiveSequence(a);
		
	}
}