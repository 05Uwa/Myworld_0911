import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HANAKO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HANAKO extends Actor
{
    /**
     * Act - do whatever the HANAKO wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int fruits = 0;
    public void act()
    {
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(-4);
        }
        if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(0);
        move(4);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(90);
        move(4);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(270);
        move(4);
        }
        Actor actor = getOneIntersectingObject( ORANGE.class );
        if ( actor != null){
            fruits +=1 ;
            getWorld().removeObject( actor );
            if (fruits == 10){
            getWorld().showText( "CLEAR", 400, 200 );
            Greenfoot.stop();
        }
        }
        Actor act = getOneIntersectingObject( APPLE.class );
        if ( act != null){
            getWorld().removeObject( act );
            fruits +=1 ;
            if (fruits == 10){
            getWorld().showText( "CLEAR", 400, 200 );
            Greenfoot.stop();
        }
        }
    }
}
