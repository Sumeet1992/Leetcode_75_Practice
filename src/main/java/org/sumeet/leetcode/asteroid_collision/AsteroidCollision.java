package org.sumeet.leetcode.asteroid_collision;

import java.util.Stack;

public class AsteroidCollision {

    public static void main(String[] args) {
        AsteroidCollision asteroidCollision = new AsteroidCollision();
        int[] asteroids = {-5,10,-5};
        int[] finalAsteroids = asteroidCollision.asteroidCollision(asteroids);

        for (int finalAsteroid : finalAsteroids) {
            System.out.print(finalAsteroid + " ");
        }
    }

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> asteroidsLeft = new Stack<>();

        for(int asteroid : asteroids){
            boolean collided = false;

            while(!asteroidsLeft.isEmpty() && asteroid < 0 && asteroidsLeft.peek() > 0){
                if(Math.abs(asteroid) == Math.abs(asteroidsLeft.peek())){
                    asteroidsLeft.pop();
                    collided = true;
                    break;
                }
                else if(Math.abs(asteroidsLeft.peek()) < Math.abs(asteroid)){
                    asteroidsLeft.pop();
                }
                else if (Math.abs(asteroidsLeft.peek()) > Math.abs(asteroid)) {
                    collided = true;
                    break;
                }
            }
            if(!collided){
                asteroidsLeft.push(asteroid);
            }
        }

        int[] finalAsteroidArray = new int[asteroidsLeft.size()];
        for(int i = asteroidsLeft.size() - 1; i>=0; i--){
            finalAsteroidArray[i] = asteroidsLeft.pop();
        }

        return finalAsteroidArray;
    }

}
