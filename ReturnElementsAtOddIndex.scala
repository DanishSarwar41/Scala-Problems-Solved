/* 
Problem : For a given list with  integers, return a new list removing the elements at odd positions. The input and output portions will be handled automatically. You need to write a function with the recommended method signature.

Signature Method : 

 def f(arr:List[Int]):List[Int] = ______________________

Solution:
*/

def f(arr:List[Int]):List[Int] = {
arr.zipWithIndex.filter{ case(_,index) => index%2!=0}.map{case(element,_) => element}
}


/* 
Explanation of Solution:
- The zipWithIndex pairs each element to its corresponding Index.
- The filter method keeps only the tuples which are not odd.
- The map method using case method, extracts the elements of the odd index.
*/
