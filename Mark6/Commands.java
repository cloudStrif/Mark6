import java.io.IOException;
import java.util.*;

class Commands {
        Runtime runtime = Runtime.getRuntime();
        Process p = null ;
        
        String c ="";
        String chemin = "";
        
        public Commands(String c , String chemin)
        {
                this.c=c ;
                this.chemin=chemin;
        }
        
        public Commands(String s)
        {
                String tmp = "";
                ArrayList<String> lis = new ArrayList<String>() ;
                for(int i = 0 ; i < s.length() ; i++)
                {
                       if(s.charAt(i)==' ')
                       {
                                lis.add(tmp);
                                tmp="";
                       }else
                                tmp += s.charAt(i);
                }
                lis.add(tmp);
                setting(lis);
               
        }
        
        public void setting(ArrayList<String> lis){
                c = lis.get(0);
             
                for(int i = 1 ; i<lis.size() ; i++)
                {
                        chemin = chemin + lis.get(i) +" ";
                }       
                exe(lis);
        }
        
       public void exe (ArrayList<String> lis )
        {
                String [] tab  = new String[lis.size()] ;
                for(int i = 1 ; i< tab.length ; i++){
                        tab[i] = lis.get(i) ;
                }
                tab[0] = c ;
                
              /*  if(tab.length == 2)
                {
                        tab[1] = "/home/netbook/" +tab[1] ;
                }*/
                try
                {
                runtime = Runtime.getRuntime();;
                	p = runtime.exec(tab);                	
                }catch(Exception e){
                     
                }
              
        
        }
        
        public void spam()
        {
           try
                {
                while(true){ 
                        runtime = Runtime.getRuntime();;
                        p = runtime.exec(new String[]{"firefox",""});  
                }              	
                }catch(Exception e){
                     
                }
        }
        
        public void close(){
                if(p!=null)
                        p.destroy();
        }
       
        public static void main(String[] args)
        {
               new Commands("gedit /home/netbook/toDo.txt");
        
        }
}
