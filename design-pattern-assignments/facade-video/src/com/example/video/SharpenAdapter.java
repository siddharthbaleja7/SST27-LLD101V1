package com.example.video;
import java.util.Objects;

public class SharpenAdapter {
    private final LegacySharpen legacySharpen;
    public SharpenAdapter(LegacySharpen legacySharpen){
        this.legacySharpen = Objects.requireNonNull(legacySharpen,"legacy");
    }
    public Frame[] sharp(Frame[] frames,int stergth){
        Objects.requireNonNull(frames,"frames");
        String handle = "FrameHandle";
        String result = legacySharpen.applySharpen(handle, stergth);
        return frames;
    }
}
