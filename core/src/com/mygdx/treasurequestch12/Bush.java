package com.mygdx.treasurequestch12;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class Bush extends Solid {
    public Bush(float x, float y, Stage s) {
        super(x, y, 32, 32, s);
        loadTexture("bush.png");
        setBoundaryPolygon(8);
    }
}
