package solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 * 
 * @author Deniz Turan, http://denizstij.blogspot.co.uk denizstij AT gmail.com
 * 
 */
public class Keyboard{
 
 final private  Set <Key> KEYSET= new LinkedHashSet<Key>();    
 final public static Key A= new Key('A', true);
 final public static Key B= new Key('B', false);
 final public static Key C= new Key('C', false);
 final public static Key D= new Key('D', false);
 final public static Key E= new Key('E', true);
 final public static Key F= new Key('F', false);
 final public static Key G= new Key('G', false);
 final public static Key H= new Key('H', false);
 final public static Key I= new Key('I', true);
 final public static Key J= new Key('J', false);
 final public static Key K= new Key('K', false);
 final public static Key L= new Key('L', false);
 final public static Key M= new Key('M', false);
 final public static Key N= new Key('N', false);
 final public static Key O= new Key('O', true);
 final public static Key _1= new Key('1', false);
 final public static Key _2= new Key('2', false);
 final public static Key _3= new Key('3', false);
 
 final public static Keyboard INSTANCE= new Keyboard();
 
  private void init(){  
  KEYSET.add(A.setKnightMoves(H,L));
  KEYSET.add(B.setKnightMoves(I,K,M));
  KEYSET.add(C.setKnightMoves(F,J,L,N));
  KEYSET.add(D.setKnightMoves(G,M,O));
  KEYSET.add(E.setKnightMoves(H,N));
  KEYSET.add(F.setKnightMoves(C,M,_1));
  KEYSET.add(G.setKnightMoves(D,N,_2));
  KEYSET.add(H.setKnightMoves(A,E,K,O,_1,_3));
  KEYSET.add(I.setKnightMoves(B,L,_2));
  KEYSET.add(J.setKnightMoves(C,M,_3));
  KEYSET.add(K.setKnightMoves(B,H,_2));
  KEYSET.add(L.setKnightMoves(A,C,I,_3));
  KEYSET.add(M.setKnightMoves(B,D,F,J));
  KEYSET.add(N.setKnightMoves(C,E,G,_1));
  KEYSET.add(O.setKnightMoves(D,H,_2));
  KEYSET.add(_1.setKnightMoves(F,H,N));
  KEYSET.add(_2.setKnightMoves(G,I,K,O));
  KEYSET.add(_3.setKnightMoves(H,J,L));   
 }
  
 // Singleton
 private Keyboard(){
  init();
 }
 
public Set <Key> getKeySet() {
  return KEYSET;
 }
 
public static class Key{
 final private char key;
 final private boolean isVowel;
 private Set<Key> knightMoves;
  
 Key(char key, boolean isVowel){
  this.key=key;
  this.isVowel=isVowel;
 }
 
 public Key setKnightMoves(Key ...knightMoves) {
  this.knightMoves=Collections.unmodifiableSet(new HashSet<Key>(Arrays.asList(knightMoves)));
  return this;
 }
 
 public Set<Key> getKnightMoves() {
  return knightMoves;
 }
 
 @Override
 public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + key;
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
  Key other = (Key) obj;
  if (key != other.key)
   return false;
  return true;
 }
 public char getKey() {
  return key;
 }
  
 public boolean isVowel() {
  return isVowel;
 }
 @Override
 public String toString() {
  return "Key [key=" + key + ", isVowel=" + isVowel +"]";
 }
}
}