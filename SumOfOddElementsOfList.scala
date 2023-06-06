/*
Problem : You are given a list. Return the sum of odd elements from the given list.

Solution : 
*/

def f(arr:List[Int]):Int = {
    var odd_sum = arr.zipWithIndex.filter{ case(element,_)=>element%2!=0}.map{case(element,_) => element}
    return odd_sum.sum
}

/*
Explanation : 
- The zipWithIndex method adds a index to each element of list in form of tuple.
- The filter method uses case to match only elements which are odd.
- The map method uses case to extract only elements from the list.
*/
