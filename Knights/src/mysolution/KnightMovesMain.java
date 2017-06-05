package mysolution;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import mysolution.Key;

public class KnightMovesMain {
	int maxVowelAllowed;
	Map <Character, Key> keys = new LinkedHashMap<Character, Key>();
	public static final char[] vowels = {'A', 'E', 'I', 'O', 'U'};
	public static char[][] keyboard = {
										{'A', 'B', 'C', 'D', 'E'},
										{'F', 'G', 'H', 'I', 'J'},
										{'K', 'L', 'M', 'N', 'O'},
										{'0', '1', '2', '3', '0'}
									};
	
	
	public KnightMovesMain(int maxVowelAllowed){
		this.maxVowelAllowed = maxVowelAllowed;
	}
	
	public static boolean isVowel(char c){
		boolean found=false;
		for (char x : vowels){
			if (x==c){
				found=true;
			}
		}
		return found;
	}
	
	public void setKeys(){
		for(int i=0; i<4; i++){
			for(int j=0; j< 5; j++){
				if (keyboard[i][j] != '0'){
					Key key = new Key(isVowel(keyboard[i][j]), keyboard[i][j]);
					key.setPossibleMoves(i, j);
					this.keys.put(new Character(keyboard[i][j]), key);
				}
			}
		}
	}
	public void printKeys(){
		for (Map.Entry entry : keys.entrySet()) {
			System.out.println(entry.getKey() + ", " + ((Key)entry.getValue()).getIsVowel()+ " "+ ((Key)entry.getValue()).getPossibleMoves());
		}
	}
	/* this is very slow because for each char in sequence of possible moves the method is called recursively
	 * this worked fine till number 8
	public long findcombinationsCount(int n){//find the count of possible sequences for each key as the starting point
		long combinations=0;
		for (Map.Entry entry : keys.entrySet()){
			combinations=combinations+findcombinationsCount1((((Key)entry.getValue()).getPossibleMoves()).toString().toCharArray(), n, 1, ((Key)entry.getValue()).getIsVowel()?1:0, entry.getKey().toString());
//			for (String key : sequenceSet) {
//				System.out.println(key);
//			}
		}
		return combinations;
	}

	public long findcombinationsCount1(char[] n, int maxSeqLen, int currentLength, int vowelCount, String str){
		int newVowelCount=0; 
		if (n.length <=0){
			return 0;
		}
		else{
			long pathCount=0;
			for(char c : n){
				if (maxSeqLen <= currentLength){
					return pathCount;
				}
				else if (keys.get(c).getIsVowel()) {
//					System.out.println(vowelCount);
					if (vowelCount > maxVowelAllowed){
						continue;
					}
					else{
						newVowelCount=vowelCount+newVowelCount;
					}
				}
				StringBuilder s=new StringBuilder(str);
				s.append(c);
				if (s.length()==maxSeqLen)
					pathCount++;
				pathCount = pathCount + findcombinationsCount1(keys.get(c).getPossibleMoves().toString().toCharArray(), maxSeqLen, currentLength+1, newVowelCount, s.toString());
			}
			return pathCount;
		}
	}*/
	
	public long findcombinationsCount(int n) {
		  if (n<=0){   
		   return 1;
		  }
		  HashMap <Key, Long> seqMap= new HashMap<Key, Long>();
		  
		  for (Map.Entry entry : keys.entrySet()){   
			  Key seqBuilder= new Key((Key)entry.getValue(), ((Key)entry.getValue()).getIsVowel()?1:0);
			  seqMap.put(seqBuilder, 1L);
			  //System.out.println((seqBuilder. .getPossibleMoves()) ;
		  }
//		  for (Key x : keys.values()){
//		  System.out.println(x.getPossibleMoves() );
//		  }
		  long totalPaths = findcombinationsForEachKey(seqMap, 1, n);
		  return totalPaths;
//		  return 0;
		 }
	private long findcombinationsForEachKey(HashMap <Key, Long> seqMap, int currentLen, int n) {
		 
		  if (currentLen>=n){
		   long numberOfPaths=0;
		   for (Long pathCount : seqMap.values()) {   
		    numberOfPaths+=pathCount;
		   }      
		   return numberOfPaths;
		  }   
		    
		  HashMap <Key, Long> seqMapNew= new HashMap<Key, Long>();
		  for (Entry<Key, Long> seqEntry : seqMap.entrySet()) {
		   Key currKey = seqEntry.getKey();
		   //System.out.println(currKey);
		   Long pathCount = seqEntry.getValue();
		   StringBuilder possibleMoves =currKey.getKey().getPossibleMoves();
		      
		   for (char keyName : possibleMoves.toString().toCharArray()) {
			   Key key = keys.get(keyName);
		    int vowelCount=currKey.getVowelCount();
		    if (key.getIsVowel()){
		     if (vowelCount>=maxVowelAllowed){
		      continue;
		     } 
		     vowelCount++;
		    }
		    Key newSeq = new Key(key,vowelCount);  
		    Long currentPath = seqMapNew.get(newSeq);
		    if (currentPath==null)
		    	seqMapNew.put(newSeq,pathCount);
		    else {
		    	seqMapNew.put(newSeq,currentPath+pathCount);
		    }
		   }   
		  }
		  return findcombinationsForEachKey(seqMapNew,currentLen+1,n);
		 }  
	
	public static void main(String[] args) {
		KnightMovesMain knightsMoves = new KnightMovesMain(2);
		knightsMoves.setKeys();
		knightsMoves.printKeys();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What should be the length of the sequences");
	    long combinationsCount = knightsMoves.findcombinationsCount(keyboard.nextInt());
	    System.out.println("possible number of combinations are "+combinationsCount);   
	}

}
