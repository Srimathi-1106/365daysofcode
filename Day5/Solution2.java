//LEETCODE PROBLEM- 2126. Destroying Asteroids

class Solution {
    public boolean asteroidsDestroyed(long mass, int[] asteroids) {
        Arrays.sort(asteroids);
        for(int i=0;i<asteroids.length;i++)
        {
            if(mass>=asteroids[i])
            {
                mass+=asteroids[i];
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}