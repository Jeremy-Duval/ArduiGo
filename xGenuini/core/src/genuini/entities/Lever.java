/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genuini.entities;

import com.badlogic.gdx.physics.box2d.Body;
import genuini.screens.GameScreen;

/**
 *
 * @author Adrien
 */
public class Lever extends StaticElements{

    public Lever(GameScreen screen, Body body,int ID) {
        super(screen,body,ID);
        
    }

    @Override
    public void update(float delta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createFilter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
