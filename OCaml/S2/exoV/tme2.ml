let float_of_3int (a, b, c) =
	(float_of_int a, float_of_int b, float_of_int c )
	
let valeur_poly (a,b,c) f =
	let (a2,b2,c2) = ( float_of_3int (a,b,c) )  in 
	( a2 *. f ) +. ( b2 *. f ) +. (c2 *. f )
	
let discriminant  (a,b,c) = b*b - 4*a*c

let nb_solutions a = if a=0 then 1 else if a >0 then 2 else 0

let solutions (a , b, c) : (float * float) = 
	let (a2, b2, c2) = float_of_3int (a, b, c) in
		match (nb_solutions ( discriminant (a,b,c) ) )with
		  0 -> (0.0 , 0.0)
		|	1 -> ( (-.b2) /. 2 *. a2  ,  (-b2) /. 2 *. a2  ) 
		| 2 -> ( (-.b2) +. float_of_int discriminant /. (2 *. a2 ), 
						 (-.b2) -. float_of_int  discriminant ) /. ( 2 *. a2 ) )	


