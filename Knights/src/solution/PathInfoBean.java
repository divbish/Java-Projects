package solution;

import solution.Keyboard.Key;

public class PathInfoBean {
 final private Key key; 
 final private int vowelCount;
  
 public PathInfoBean(Key key, int vowelCount) {   
  this.key = key;
  this.vowelCount = vowelCount;
 }
  
 public Key getKey() {
  return key;
 }
  
 public int getVowelCount() {
  return vowelCount;
 }
 
 
 @Override
 public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + ((key == null) ? 0 : key.hashCode());
  result = prime * result + vowelCount;
  return result;
 }
 
 @Override
 public boolean equals(Object obj) {
  if (this == obj)
   return true;
  if (obj == null)
   return false;
  if (getClass() != obj.getClass())
   return false;
  PathInfoBean other = (PathInfoBean) obj;
  if (key == null) {
   if (other.key != null)
    return false;
  } else if (!key.equals(other.key))
   return false;
  if (vowelCount != other.vowelCount)
   return false;
  return true;
 }
  
 @Override
 public String toString() {
  return "PathInfoBean [key=" + key + ", vowelCount=" + vowelCount + "]\n";
 }
}