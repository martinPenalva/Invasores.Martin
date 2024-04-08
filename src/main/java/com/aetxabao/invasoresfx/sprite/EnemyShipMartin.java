package com.aetxabao.invasoresfx.sprite;

import com.aetxabao.invasoresfx.util.Rect;
import javafx.scene.image.Image;
import org.apache.log4j.Logger;

public class EnemyShipMartin extends EnemyShip {
    private static Logger log = Logger.getLogger(EnemyShipDiagonal.class);
    public EnemyShipMartin(Rect gameRect, Image img, int N) {
        super(gameRect, img, N);
        log.debug("EnemyShipDiagonal N="+N);
    }

    @Override
    public void update() {
        if (x > gameRect.right - width - xSpeed || x + xSpeed < gameRect.left) {
            xSpeed = -xSpeed;
        }
        x = x +100 + xSpeed;
        y = y + 100 + ySpeed;
        updateFrame();
    }

}
