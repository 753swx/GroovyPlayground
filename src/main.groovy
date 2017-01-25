//String str = "Brest.gif"
//str = str[0..-4]
//println(str)
//println(str.replace('rest', 'soap'))

//int x = 5;
//assert x == 2;
//assert x == 5;

def combinations = [[1, 2, 3], [4, 5, 6]].combinations()
println combinations



[[1, 2, 3], [4, 5, 6]].eachCombination { println it[0] + '&' + it[1] }


 

