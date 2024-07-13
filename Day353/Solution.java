// LEETCODE PROBLEM - 2751. Robot Collisions

class Solution {
    class Robot{
        int p,h,d;
        Robot(int p,int h,int d)
        {
            this.p=p;
            this.h=h;
            this.d=d;
        }
    }
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n=positions.length;
        Robot r[]=new Robot[n];
        for(int i=0;i<n;i++)
        {
            r[i]=new Robot(positions[i],healths[i],directions.charAt(i)=='R'?1:0);
        }
        Arrays.sort(r,(a,b)->a.p-b.p);
        Stack<Robot> stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            boolean f=true;
            if(!stack.isEmpty())
            {
                while(f)
                {
                    Robot top=stack.peek();
                    if(top.d==1 && r[i].d==0)
                    {
                        if(top.h<r[i].h)
                        {
                            r[i].h--;
                            stack.pop();
                            f=true;
                            if(stack.isEmpty())
                            {
                                stack.push(r[i]);
                                f=false;
                            }
                        }
                        else if(top.h>r[i].h)
                        {
                            top.h--;
                            f=false;
                        }
                        else
                        {
                            f=false;
                            stack.pop();
                        }
                    }
                    else
                    {
                        stack.push(r[i]);
                        f=false;
                    }
                }
            }
            else
            {
                stack.push(r[i]);
            }

        }
        List<Integer> finalRobotsHealths = new ArrayList<>();

        Map<Integer,Integer> positionToHealth = new HashMap<>();
        while(!stack.isEmpty()){
            Robot robot = stack.pop();
            positionToHealth.put(robot.p, robot.h);
        }
        
        for(int pos:positions){
            if(positionToHealth.containsKey(pos)){
                finalRobotsHealths.add(positionToHealth.get(pos));
            }
        }
        return finalRobotsHealths;
    }
}

