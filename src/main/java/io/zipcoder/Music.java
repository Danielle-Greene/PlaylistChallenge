package io.zipcoder;

import java.util.ArrayList;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        ArrayList<Integer> songs = new ArrayList<Integer>();

        for (int i = 0; i < playList.length; i++){

            if (playList[i].equals(selection)){
                songs.add(i);
            }
        }

        songs.add(songs.get(songs.size() - 1) - playList.length);
        songs.add(songs.get(0) + playList.length);
        
        return null;
    }
}
