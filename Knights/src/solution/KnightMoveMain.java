package solution;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
 
import solution.Keyboard.Key;
/**
 * 
 * @author Deniz Turan, http://denizstij.blogspot.co.uk denizstij AT gmail.com
 * 
 */
public class KnightMoveMain {
 private final int maxVowelCount;
  
 public KnightMoveMain(int maxVowelCount){
  this.maxVowelCount=maxVowelCount;
 }
  
 public long findNumberOfSequence(int lenOfSequence) {
  if (lenOfSequence<=0){   
   return 1;// number of empty set is 1
  }
  
  Map <PathInfoBean, Long> pathInfoMap= new LinkedHashMap<PathInfoBean, Long>();
  
  for (Key key : Keyboard.INSTANCE.getKeySet()) {   
   PathInfoBean pathinfo= new PathInfoBean(key, key.isVowel()?1:0);
   pathInfoMap.put(pathinfo, 1L);
   System.out.println(key);
  }
   
  long numberOfPaths = findNumberOfSequence1(pathInfoMap,1,lenOfSequence);
  return numberOfPaths;
 }
  
 private long findNumberOfSequence1(Map <PathInfoBean, Long> pathInfoMap ,int sequenceLen, int lenOfSequence) {
 
  if (sequenceLen>=lenOfSequence){
   long numberOfPaths=0;
   for (Long pathCount : pathInfoMap.values()) {   
    numberOfPaths+=pathCount;
   }      
   return numberOfPaths;
  }   
    
  Map <PathInfoBean, Long> pathInfoMapNew= new LinkedHashMap<PathInfoBean, Long>();
  for (Entry<PathInfoBean, Long> pathInfoBeanEntry : pathInfoMap.entrySet()) {
   PathInfoBean pathInfoBean = pathInfoBeanEntry.getKey();
 
   Long pathCount = pathInfoBeanEntry.getValue();
   Set<Key> possibleMoveSet =pathInfoBeanEntry.getKey().getKey().getKnightMoves();
      
   for (Key key : possibleMoveSet) {
    int vowelCount=pathInfoBean.getVowelCount();
    if (key.isVowel()){
     if (vowelCount>=maxVowelCount){
      continue;
     } 
     vowelCount++;
    }
    PathInfoBean newPathInfoBean = new PathInfoBean(key,vowelCount);  
    Long currentPath = pathInfoMapNew.get(newPathInfoBean);
    if (currentPath==null)  // first time 
     pathInfoMapNew.put(newPathInfoBean,pathCount);
    else {
     // we have already, so just lets aggregate both branch
     pathInfoMapNew.put(newPathInfoBean,currentPath+pathCount);
    }
   }   
  }
  return findNumberOfSequence1(pathInfoMapNew,sequenceLen+1,lenOfSequence);
 }  
  
 public static void main(String[] args) {  
  KnightMoveMain km= new KnightMoveMain(2);
  long now = System.currentTimeMillis();
  for (int n=2;n<=2;n++) {
   long numberOfPaths = km.findNumberOfSequence(n);
   System.out.println(n+"==>"+numberOfPaths);   
  }
  long elapsedTime = System.currentTimeMillis()-now;
  System.out.println("Total Elapsed Time (msec):"+elapsedTime);
 }
}