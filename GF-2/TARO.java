import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TARO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TARO extends Actor
{
    /**
     * Act - do whatever the TARO wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(4);
        }
        if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(0);
        move(-4);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(270);
        move(4);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(4);
        }
        
        Actor actor = getOneIntersectingObject( ORANGE.class );
        if( actor != null ){
            //Greenfoot.stop();
        }
        Actor act = getOneIntersectingObject( APPLE.class );
        if( act != null ){
            //Greenfoot.stop();
        }  
    }
    
}
