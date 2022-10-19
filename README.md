<table align="center"><tr><td align="center" width="9999">
<img src="https://www.ibexa.co/var/site/storage/images/6/1/6/0/210616-2-eng-GB/Endava_Logo_RGB_Original_cut.png" align="center" width="50%" alt="Endava">

# Assignment 10

Entry into OOP (Object-Oriented Programming) using a Animal friendly example
</td></tr></table>

### Before we begin: What is OOP? Why should we use it?
To answer that question, it is better to look at [this](https://www.w3schools.com/java/java_oop.asp) article from W3Schools in which they explain OOP pretty simplistic.

## The Goal
Once we are done, we want to have a full functional and object-oriented zoo.<br>
It should contain classes defining the different Animals, as well as their favourite food, and their favourite toy.
 

## Task 1
*Fork & Clone this Project*<br>
*a barebones Main class is provided*<br>
What can every Animal do? Let's start this journey with adding actions to our Animals
* Create an Interface, that will have common things each Animal can do.
* Creating an Interface class is the easy part, actually creating the methods is not as trivial as you might think.
  * a Method inside an Interface is constructed as follows: *Visibility* *ReturnType* *MethodName*();
  * As you can see, the Method body is missing. Remember the Talk we had about Interfaces?

## Task 2
What does every Animal have in common? a Name? a Gender? a Species? <br>
well if any of those came to mind, you were absolutely right.
* Create an Abstract class, holding common properties among all types of **Animals**.
* make it implement your Animal Interface and make the override methods abstract.

## Task 3
 Lets create a few more AnimalTypes, try Flying and Swimming Animals.
* Create a Flying Animal, and a Swimming Animal, and make them extend your Abstract Animal class.
* Add a few more methods to your Flying or Swimming Animal, that are specific to them.

## Task 4
Now that we have our abstracts and interfaces, lets create some Animals.
* Create a few Animals, and make them extend your Abstract Animal (or your Flying/Swimming Animal) class.
* Implement all the methods, and provide the properties using the **super** keyword in your constructor.<br>

And now, we have a fully functional Zoo, with Animals that can do things, and have properties right? Well no.
Animals can't just walk around, they need to be in an enclosure.

## Task 5
Let's create an Enclosure class, that will hold our Animals.
Bear in mind, that certain Animals need to be in certain Enclosures.<br>
Use what you have learned so far, to create one or more Enclosure classes, that will hold Animals. Add Methods / Properties to your liking.

**BONUS**<br>
Make your Enclosure use a Generic Type, so that it can hold a specific type of Animal.<br>
Modify your methods to use the Generic Type, and make sure that the Animal you are trying to add to the Enclosure is of the correct type.