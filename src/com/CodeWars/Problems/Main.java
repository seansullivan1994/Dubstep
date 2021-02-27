package com.CodeWars.Problems;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(SongDecoder("WUBWUBABCWUB"));
        System.out.println(SongDecoder("RWUBWUBWUBLWUB"));
    }
    //Removes WUBs to retrieve original song lyrics from a remix
    public static String SongDecoder (String song)
    {
        String  pattern = "WUB";
        String songWithSpaces = song.replaceAll(pattern," ");
        song = songWithSpaces.trim().replaceAll(" +", " ");
        return song;
    }
}
