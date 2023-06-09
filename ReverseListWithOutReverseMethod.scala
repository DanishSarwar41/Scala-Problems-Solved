
/*
You are given a list of  elements. Reverse the list without using the reverse function.

Solution : 
*/ 

def f(arr:List[Int]):List[Int] = {
    var indx = arr.zipWithIndex.map{case(_,i) => i}
    var l = arr.length-1
    var rev = List.empty[Int]
    for (_<-arr){
        rev = rev :+ arr(l)
        l-=1
}
return rev
}

/*
Explanation : 
- The variable 'indx' adds index to 'arr' using zipWithIndex method, it then uses map method to extract only the index values.
- The variable 'l' extracts the length of list.
- The variable 'rev' is initialized as empty and then in for loop every element from 'arr' list is appended using ':+' in reverse order.
*/

