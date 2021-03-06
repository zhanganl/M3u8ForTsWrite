package com.douyaim.qsapp.media;

import com.wangw.m3u8fortswrite.TSFileBuffer;

/**
 * Created by wangw on 2017/3/10.
 */

public class TsMuxer {

    public static final int FRAMETYPE_SPS = 1001;
    public static final int FRAMETYPE_PPS = 1002;
    public static final int FRAMETYPE_I = 1003;
    public static final int FRAMETYPE_P = 1004;

    static {
        System.loadLibrary("tsmuxer");
    }

    public native static void addH264Data(byte[] inputBuffer,int length,int frameType,long ts,TSFileBuffer outPutBuffer);

    public native static void addAACData(byte[] inputBuffer, int length, int samplerate, int channum, long ts);

    public native static void close(TSFileBuffer outputBuffer);
}
