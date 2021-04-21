package ie.tudublin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	//String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	ArrayList<String> notes = new ArrayList<String>();


	public void loadScore() {

		String[] splitstr = score.split("");

		notes.addAll(Arrays.asList(splitstr));

		/*

		for(int i = 0; i<score.length(); i++) {
			
			if(isDigit(score.charAt(i) )) {

				Note note = new Note(score.charAt(i), 1);
				notes.add(note);
			}
			
			if(!isDigit(score.charAt(i)))
			{
				Note duration = new Note(score.charAt(i), 2);
				notes.add(duration);
			}
			
			
		}*/

		
	
		/*Collections.addAll(notes,splitstr);
		notes.addAll(Arrays.asList(splitstr));*/
		//print(notes);
		
	}

	public void printScores(){

		for(String note : notes){

			println(note);
		}

	}
	
	private void elseif(boolean b) {
	}

	private boolean isDigit(char charAt) {
		return false;
	}

	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		//println(i);
	}

	public void setup() 
	{
		loadScore();
		printScores();
		
	}

	public void draw()
	{
		background(255);
		
	}

	void drawNotes()
	{
	}
}
