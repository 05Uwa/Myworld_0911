import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int timecount = 1000;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 450, 1); 
        addObject( new TARO(),0,0);
        addObject( new HANAKO(),800,450);
        int A = 0;
        int B = 800;
        int C = A + (int)(Math.random()*((B-A)+1));
        int D = 0;
        int E = 450;
        int F = D + (int)(Math.random()*((E-D)+1));
        for (int i = 0; i < 5; i++) {
        addObject( new APPLE(),(A + (int)(Math.random()*((B-A)+1))),((int)(Math.random()*((E-D)+1))));
        }
        int G = 0;
        int H = 800;
        int I = G + (int)(Math.random()*((H-G)+1));
        int J = 0;
        int K = 450;
        int L = J + (int)(Math.random()*((K-J)+1));
        for (int o = 0; o < 5; o++){
            addObject(new ORANGE(),(G + (int)(Math.random()*((H-G)+1))),((int)(Math.random()*((K-J)+1))));
        }
    }
    public void act(){
            timecount --;
        showText(String.valueOf(timecount),50,50);
        if (timecount == 0){
            showText( "TIME OVER", 400, 200 );
            Greenfoot.stop();
        }
    }
    }

