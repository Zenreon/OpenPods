package com.dosse.airpods.pods.data;

import com.dosse.airpods.R;

public class BeatsX extends SinglePods {

    public BeatsX (Pod singlePod) {
        super(singlePod);
    }

    @Override
    public int getDrawable () {
        return getPod().isConnected() ? R.drawable.beatsx : R.drawable.beatsx_disconnected;
    }

    @Override
    public String getModel () {
        return MODEL_BEATS_X;
    }

}