
import java.io.*;

class Main {
	
	/*
	 * Traitement de la suite d'instruction declaration de var au debut
	 */
	
	 Parser parser ;
	 Program prog ; //Programme principale
	 Program prog2 ;//Programme qui fait les declaration de variable exclusivement en debut de programme
	 ValueEnvironment v = new ValueEnvironment();;
	 
	 String Err = "" ;
		 
	public Main(String name) throws Exception {
		File input = new File(name);
    	Reader reader = new FileReader(input);
    	Lexer lexer = new Lexer(reader);
        LookAhead1 look = new LookAhead1(lexer);
        
         parser = new Parser(look);
        try {
        	prog2 = parser.nontermCode2();
        	prog = parser.nontermCode();
        	
        	System.out.println("The code is correct\n********************");
         
        				prog2.run(v);
                            prog.run(v);
              
        }
        catch (Exception e){
        	System.out.println("The code is not correct.");
        	System.out.println(e);
        	Brui brui  = new Brui("music/MC_Error",true);
        	
        	Err = e.getMessage() ;
        	brui.jou();
        }
	}
	
  
}
