﻿# Draw figures
 
 This programm allows to print figures with "*" by directly passing a condition into a method. 
 F. e. like drawFunction((x, y) -> x == y, 5); will draw something like:
 
 *         
   *       
     *     
       *   
         * 
 
 To do that, it goes through all the "coordinates" represented by i and j, and tests them using a predicate functional interface for matching the passed condition.
