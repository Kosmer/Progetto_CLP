grammar SimpLanPlus ;

prog   : exp        				#singleExp          				
       | (dec)+ (stm)* (exp)?       #decstmExp
       ;

dec    : type ID ';'    			#idInit                              
       | type ID '(' ( param ( ',' param)* )? ')' '{' body '}'		#funDec
       ;
         
param  : type ID ;

body   : (dec)* (stm)* (exp)?
	   ;

type   : 'int'  
       | 'bool' 
       | 'void'
       ;  

blockseqstm : (stm)+;

stm    : ID '=' exp ';'							#varStm
       | ID '(' (exp (',' exp)* )? ')' ';'		#funStm
       | 'if' '(' cond=exp ')' '{' thenBranch=blockseqstm '}' ('else' '{' elseBranch=blockseqstm '}')?		#ifStm
	   ;
	   
blockseqstmexp	: (stm)* exp;
           
exp    :  INTEGER						#intExp
       | 'true' 						#trueExp
       | 'false'						#falseExp
       | ID 							#varExp
       | '!' exp						#notExp
       | left=exp (mul='*' | div='/') right=exp			#muldivExp
       | left=exp (plus='+' | sub='-') right=exp 			#addsubExp
       | left=exp (greater='>' | lesser='<' | greater_equals='>=' | lesser_equals='<=' | equals='==') right=exp 			#compareExp
       | left=exp (and='&&' | or='||') right=exp 							#andorExp
       | 'if' '(' cond=exp ')' '{' thenBranch=blockseqstmexp '}' 'else' '{' elseBranch=blockseqstmexp '}' 		#ifExp
       | '(' exp ')'					#parExp
       | ID '(' (exp (',' exp)* )? ')'		#funExp
       ;
       

 
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

//Numbers
fragment DIGIT  : '0'..'9';    
INTEGER         : DIGIT+;

//IDs
fragment CHAR   : 'a'..'z' |'A'..'Z' ;
ID              : CHAR (CHAR | DIGIT)* ;

//ESCAPE SEQUENCES
WS              : (' '|'\t'|'\n'|'\r')-> skip;
LINECOMENTS     : '//' (~('\n'|'\r'))* -> skip;
BLOCKCOMENTS    : '/*'( ~('/'|'*')|'/'~'*'|'*'~'/'|BLOCKCOMENTS)* '*/' -> skip;

ERR             : .  -> channel(HIDDEN); 