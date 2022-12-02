# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

    * **YOUR WRITING HERE**
I would turn the number into a string, use .length()-1 to get the last digit of the string, then turn that into a substring. then i would right if statemtents for the actual letter, and within those if statements i would write if statements if the last digit of the number is greater than or equal to 7 add a plus to that letter, if the number is greater than or equal to 4 , then print just the letter and then an else for the "-". 

2. Discuss how you would make sure 100 is not misrepresented as an A-.
  * **YOUR WRITING HERE**
I would make a seperate if statement stating if the number is equal to 100, pring "A+".

3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
  * **YOUR WRITING HERE**
I would make F if the number is less than 60, print "F" and nothing else.
