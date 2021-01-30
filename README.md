
# Java arrays practice
<hr>
[![forthebadgeJava](https://forthebadge.com/images/badges/made-with-java.svg)]
[![forthebadgeOfficeSpace](https://forthebadge.com/images/badges/compatibility-pc-load-letter.svg)]
[![forthebadgeLicence](https://img.shields.io/github/license/JRybelis/SortingArrays?style=for-the-badge)]
[![forthebadgeContributors](https://img.shields.io/github/contributors/JRybelis/SortingArrays?color=bright&style=for-the-badge)] 


> The project showcases three console programs which utilise arrays to solve problems: 
<hr>

## Bubble sort: 
A bubble sort of array items in both ascending and descending order. 
***

## Dimensional array sort:
A sorting of a _"two-dimensional"_ array and then pushing its row elements to cycle from left to right, and then from right to left, a little bit more each time it goes down a row. <br/>
| Array items being sorted ascending and cycled forward | Array items being sorted ascending and cycled reverse |
|------------|------------|
|![Forward](https://github.com/JRybelis/SortingArrays/blob/master/img/forwardShift.png?raw=true)|![Reversed](https://github.com/JRybelis/SortingArrays/blob/master/img/reverseShift.png?raw=true)|
***

## Game of entropy: 
A program that creates _"cells"_, represented as the char 'x' and has them either multiply or die each cycle, based on the rules of John Horton Conway's ["Life"](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life#Rules "Link to the rules on Wikipedia"). <br/>


![principles](https://redcatlabs.com/2014-10-14_Reverse-GoL/img/2d_life_rules-736575_500x500.gif) <br/>

It is set up to run for 50 cycles, unless it runs into a loop where the cells start repeating the same behaviour. 

--- 

#### An example of a successful game (cells survive through 50 generations): 
| Life cycles:| 5           | cycles      | displayed   | per row     |
|-------------|-------------|-------------|-------------|-------------|
|![Gen. 1](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle1.png)| ![Gen. 2](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle2.png)| ![Gen. 3](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle3.png)| ![Gen. 4](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle4.png)| ![Gen. 5](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle5.png)|
|             |             |             |             |             |
|![Gen. 6](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle6.png)| ![Gen. 7](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle7.png)| ![Gen. 8](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle8.png)| ![Gen. 9](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle9.png)| ![Gen. 10](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle10.png)|
|             |             |             |             |             |
|![Gen. 11](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle11.png)| ![Gen. 12](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle12.png)| ![Gen. 13](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle13.png)| ![Gen. 14](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle14.png)| ![Gen. 15](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle15.png)|
|             |             |             |             |             |
|![Gen. 16](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle16.png)| ![Gen. 17](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle17.png)| ![Gen. 18](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle18.png)| ![Gen. 19](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle19.png)| ![Gen. 20](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle20.png)|
|             |             |             |             |             |
|![Gen. 21](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle21.png)| ![Gen. 22](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle22.png)| ![Gen. 23](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle23.png)| ![Gen. 24](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle24.png)| ![Gen. 25](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle25.png)|
|             |             |             |             |             |
|![Gen. 26](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle26.png)| ![Gen. 27](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle27.png)| ![Gen. 28](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle28.png)| ![Gen. 29](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle29.png)| ![Gen. 30](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle30.png)|
|             |             |             |             |             |
|![Gen. 31](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle31.png)| ![Gen. 32](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle32.png)| ![Gen. 33](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle33.png)| ![Gen. 34](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle34.png)| ![Gen. 35](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle35.png)|
|             |             |             |             |             |
|![Gen. 36](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle36.png)| ![Gen. 37](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle37.png)| ![Gen. 38](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle38.png)| ![Gen. 39](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle39.png)| ![Gen. 40](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle40.png)|
|             |             |             |             |             |
|![Gen. 41](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle41.png)| ![Gen. 42](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle42.png)| ![Gen. 43](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle43.png)| ![Gen. 44](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle44.png)| ![Gen. 45](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle45.png)|
|             |             |             |             |             |
|![Gen. 46](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle46.png)| ![Gen. 47](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle47.png)| ![Gen. 48](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle48.png)| ![Gen. 49](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle49.png)| ![Gen. 50](https://github.com/JRybelis/SortingArrays/blob/master/img/Cycle50.png)|
|             |             |             |             |             |
<br/>
***

#### An example of the program spotting a repeating sequence (all of the cells deteriorated) and breaking from iteration through life-cycles:


[![Entropy](https://github.com/JRybelis/SortingArrays/blob/master/img/BreakAtCycle20.png?raw=true)]  
