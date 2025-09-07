package com.example.video;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        Decoder dec = new Decoder();
        FilterEngine fe = new FilterEngine();
        Encoder enc = new Encoder();
        SharpenAdapter sharpenAdapter = new SharpenAdapter(new LegacySharpen());
        VideoPipelineFacade facade = new VideoPipelineFacade(dec, enc, fe, sharpenAdapter);
        Path out = facade.process(Path.of("in.mp4"), Path.of("out.mp4"), true, 0.5, 2);

        // Frame[] frames = dec.decode(Path.of("in.mp4"));
        // frames = fe.grayscale(frames);
        // frames = fe.scale(frames, 0.5);
        // Legacy filter not used due to odd API
        // Path out = enc.encode(frames, Path.of("out.mp4"));
        System.out.println("Wrote " + out);
        // TODO: Replace all above with VideoPipelineFacade.process(...)
    }
}
