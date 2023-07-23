package io.zipcoder;

import java.util.ArrayList;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        int interval = -1;

        for (int i = 0; i < playList.length; i++) {

            if (playList[i].equals(selection)) {
                interval = i;
            }
        }

    int forward = Math.abs(interval - startIndex);
        int backward = playList.length - Math.abs(interval - startIndex);
        if (forward < backward){

            return forward;
        }
        else {

            return backward;
        }
    }
}
