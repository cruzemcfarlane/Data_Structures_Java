import java.util.*;

public class SearchDriver
{ 

Scanner sc;

public static void main(String args[])
    {
       // enter array size
        String s;
        int pos,newnum;
        char Choice;
        int result= -1;
        int searchval;
        long Starttime,nStarttime;
        long Endtime,nEndtime;
        Scanner sc;
        Random rn = new Random();
        
        System.out.println("Enter array size: ");
        sc = new Scanner(System.in);
        s = sc.next();
        int size = Integer.parseInt(s);
       // populate list with [SIZE] random? numbers 
       myList NumList  = new myList(size);
       for (pos = 0;pos <size;pos ++)
            {
               int n = (int)(rn.nextFloat() * 10 + 1);
               if (pos ==0)
                    newnum = n;
               else 
                    newnum = n + NumList.get(pos-1);
               NumList.addItem(newnum);
               //System.out.println("Added " +newnum  + " at position " + pos);
            }
       System.out.println("Completed populating Array");
       Choice = 'N';
       while (Choice!='Q')
            {
               System.out.println("[S]equential Search, [B]inary Search, [Q]uit");
               sc = new Scanner(System.in);
               s = sc.next();
               Choice = s.charAt(0);
               
               if ((Choice =='S') || (Choice =='B'))
                    {
                        System.out.println("Enter search value: ");
                        sc = new Scanner(System.in);
                        s = sc.next();
                        searchval = Integer.parseInt(s);
                        Starttime =System.currentTimeMillis();
                        nStarttime = System.nanoTime();
                        switch(Choice)
                        {
                        case 'S':{  
                                    result = NumList.seqSearch(searchval);
                                       break;
                                }
                        case 'B':{  result = NumList.binSearch(searchval,0,size);
                                    break;
                                }
                         }
                         Endtime = System.currentTimeMillis();
                         nEndtime = System.nanoTime();
                         System.out.println("Duration : " + (Endtime - Starttime)+ " milliseconds (" + (nEndtime - nStarttime) + " nanoseconds)");
                        if (result >=0)
                            System.out.println(searchval + " found at position " + result);
                        else
                            System.out.println(searchval + " not found"); 
                    }
                            
                        }//while
                      System.out.println("GOODBYE!!!");
                    } 
       // FOR IMPACT // CAN RECORD TIMESTAMP
       // Find worst case search time = search [LAST ITEM] or [SIZE]
       // FOR IMPACT // CAN RECORD TIMESTAMP , SUBTRACT FROM PREVIOUS TIME STAMP, DISPLAY DIFFERENCE
       
       //
    }
    