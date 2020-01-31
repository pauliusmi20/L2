

(* isabelle.mounier@lip6.fr *)


let xor (a :bool) (b:bool):bool = 	
	(a || b)&& not(a && b) 

type cmp = bool * bool * bool

let cmp1 (a:bool) (b:bool):cmp = 
	match (a  ,b )with 
	(true , false) -> (true,false,false)
	|(true, true) ->  (false,true,false)
	|(false ,false )-> (false,true,false)
	|(false , true ) -> (false, false, true)


let lex ((a1,a2,a3):cmp)((b1,b2,b3):cmp):cmp =
	if a1 || (a2 && b1) then (true,false,true)
	else if a2 && b2 then (false,true,false)
	else (false,false,true)



type duet =  bool * bool

type quartet = duet * duet 

type octet = quartet * quartet



let cmp2 ( (a1 , a2):duet) ((b1 , b2):duet ):cmp = lex (cmp1 a1  b1 ) (cmp1 a2 b2)

let cmp4 ((a1 , a2):quartet )((b1 , b2):quartet):cmp = lex (cmp2 a1  b1) (cmp2 b1 b2)

let cmp8 ((a1 , a2):octet) ((b1 , b2):octet) = lex (cmp4 a1  b1 ) (cmp4 a2 b2)

let cmp16 (a1 , a2) (b1 , b2) = lex (cmp8 a1  b1 ) (cmp8 a2 b2) 


let i2d a =
	if a / 2 == 1 then 
		if ( a mod 2 ) == 1 then (true , true) 
		else (false ,true)

	else 
		if  a mod 2  == 1 then
			if ( a/2 mod 2 ) == 1 then (true, true)
			else (true, false ) 
		else if a/2 mod 2 == 1 then (false,true)
			else (false, false )

let i2q a =  i2d (a) , i2d (a/4) 


let i2o a =  i2q ( a ) , i2q (a/16) 


let cd (a , b) = 
	if not (xor a b) then (a , b)
	else (not a , not b)

let cq (a , b) = ( cd b , cd a )

let co (a , b) = ( cq b , cq a )


let i2ofinale (a:int):octet = co ( i2o  a )

let comparer (a:int)(b:int):cmp  = cmp8 (i2ofinale a ) (i2ofinale b ) 




