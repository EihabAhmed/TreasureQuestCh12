package com.mygdx.treasurequestch12;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class Arrow extends BaseActor {
    public Arrow(float x, float y, Stage s) {
        super(x, y, s);

        loadTexture("arrow.png");
        setSpeed(400);
    }

    @Override
    public void act(float dt) {
        super.act(dt);
        applyPhysics(dt);
    }
}
