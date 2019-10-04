(*#open "printf";;*)

let magique a =
 let n = vect_length a in
 let i = ref (n - 1) in
 let j = ref (n / 2) in
 for k = 1 to n * n do
  a.(!i).(!j) <- k;
  if k mod n = 0 then decr i else
   begin
    i := (!i + 1) mod n;
    j := (!j + 1) mod n;
   end
 done;;

let erreur s = printf "Erreur fatale: %s\n" s; exit 1;;

let lire () =
 printf "Taille du carré magique, svp ? ";
 let n = int_of_string (read_line ()) in
 if n <= 0 || n mod 2 = 0 then erreur "Taille impossible" else n;;

let imprimer a =
 for i = 0 to vect_length a - 1 do
  for j = 0 to vect_length a - 1 do
   printf "%4d " a.(i).(j)
  done;
  printf "\n"
 done;;

let main () =
 let n = lire () in
 let a = make_matrix n n 0 in
 magique a;
 imprimer a;
 exit 0;;

main ();;