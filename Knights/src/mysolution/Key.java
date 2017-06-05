package mysolution;

import mysolution.KnightMovesMain;

public class Key {
	private boolean isVowel;
	private char name;
	private StringBuilder possibleMoves;
	private Key key;
	private int vowelCount;

	public Key(boolean isVowel, char name){
		this.isVowel=isVowel;
		this.name=name;
		possibleMoves = new StringBuilder();
	}
	public Key(Key key, int vowelCount){
		this.key = key;
		this.vowelCount = vowelCount;
	}
	public StringBuilder getPossibleMoves(){
		return possibleMoves;
	}
	public boolean getIsVowel(){
		return isVowel;
	}
	public Key getKey(){
		return key;
	}
	public int getVowelCount(){
		return vowelCount;
	}
	public void setPossibleMoves(int i, int j){
		char c;
		if (i+2>-1 && j+1>-1 && i+2<4 && j+1<5){
			c=KnightMovesMain.keyboard[i+2][j+1];
			if(c!='0'){
				possibleMoves.append(c);
			}
		}
		if (i+2>-1 && j-1>-1 && i+2<4 && j-1<5){
			c = KnightMovesMain.keyboard[i+2][j-1];
			if(c!='0'){
				possibleMoves.append(c);
			}
		}
		if (i-2>-1 && j+1>-1 && i-2<4 && j+1<5){
			c = KnightMovesMain.keyboard[i-2][j+1];
			if(c!='0'){
				possibleMoves.append(c);
			}
		}
		if (i-2>-1 && j-1>-1 && i-2<4 && j-1<5){
			c = KnightMovesMain.keyboard[i-2][j-1];
			if(c!='0'){
				possibleMoves.append(c);
			}
		}
		if (i+1>-1 && j+2>-1 && i+1<4 && j+2<5){
			c = KnightMovesMain.keyboard[i+1][j+2];
			if(c!='0'){
				possibleMoves.append(c);
			}
		}
		if (i+1>-1 && j-2>-1 && i+1<4 && j-2<5){
			c = KnightMovesMain.keyboard[i+1][j-2];;
			if(c!='0'){
				possibleMoves.append(c);
			}
		}
		if (i-1>-1 && j+2>-1 && i-1<4 && j+2<5){
			c = KnightMovesMain.keyboard[i-1][j+2];
			if(c!='0'){
				possibleMoves.append(c);
			}
		}
		if (i-1>-1 && j-2>-1 && i-1<4 && j-2<5){
			c =KnightMovesMain.keyboard[i-1][j-2];
			if(c!='0'){
				possibleMoves.append(c);
			}
		}
	}
}