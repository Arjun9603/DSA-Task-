class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        if(bills[0]!=5)return false;
        for(int i=0; i<bills.length;  i++ )
        {
            if(bills[i]==5)
            {
                five++;
            }
            else if(bills[i]==10 && five>0)
            {
                ten++;
                five--;
            }
            else if(bills[i]==20 && ten>0 && five>0)
            {
                ten--;
                five--;
            }
            else if(bills[i]==20 && five>2)
            {
                five-=3;
            }
            else {
                return false;
            }
            
        }
        return true;
    }
    
}