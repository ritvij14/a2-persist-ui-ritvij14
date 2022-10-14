# A2-PersistUI
Ritvij Kumar Sharma

2019A8PS0666G

f20190666@goa.bits-pilani.ac.in

## Description
- This is a die game. The game involves a die being rolled by the user in the range of 1-6 with a randomized result everytime. If a user rolls a six on the die user wins 5 coins and if there are two consecutive sixes the user wins 10. Alternatively if a user rolls two same consecutive numbers other than 6 they loose 5 coins. Every roll of die updates the number of single sixes, double sixes, total dice rolled and number of other double numbers on the screen.

Common bugs in the application included the absence of a reset button to auto reset the fields mentioned in the application, user has to destroy the activity to create the a new instance of the same activity.

- A toast is used to provide simple feedback about an operation in a small popup. It only fills the amount of space required for the message and the current activity remains visible and interactive. Toasts automatically disappear after a timeout.

The makeText() method returns a Toast object. Use the makeText() method, which takes the following parameters:

The application Context.

The text that should appear to the user.

The duration that the toast should remain on the screen.

To display the toast, call the show() method.

Using the above method in the  WalletActivity to display Toast a message of "Congratulation!" will be shown whenever a user rolls a six.

- The roll method of the Die6 class, implemented from the Die interface, sets a random integer value from the random package in the java.utils.random library and returns it to the rolldie method of the WalletViewModel class. As a result, every time a six is rolled, the value of the coins is successively increased by 5! Similar updates are made to the textview of the screen showing the value of the coins in the UI element of the WalletActivity screen. Every time a six is rolled, the rolldie method additionally increases the WalletViewModel members single sixes and the number of total die rolls. The ViewModel class was created with lifecycle consideration in mind to store and manage UI-related data. Data may survive configuration changes like rotating screens thanks to the ViewModel class. The screen activity is restored whenever the screen is rotated from portrait from landscape and back to portrait. The values remains the same on screen rotation.

- More rules are implemented to improve the user experience, such as increasing the coin balance by 10 whenever a string of sixes is rolled by keeping track of the previous roll value in a separate member of the wallet view model, and decreasing the coin balance by 5 whenever a string of numbers other than six is rolled.

The ViewModel class, which is detailed in the Android Developer documentation, is used for all tasks to ensure that the UI state is preserved during screen rotation from portrait to landscape and back to portrait.
In order to display all components, including buttons, dynamic and static textviews, and to allow the user to keep track of the number of sixes, double sixes, balance, double others, and total dice rolls without causing the components to be positioned incorrectly and obstructing the user's view, it is necessary to properly manage the size and positioning of textviews on the screen. The layout folder of the app's res directory contains a separate XML file that creates a separate landscape-oriented user interface. Instead of utilising hardcoded values in the xml files, the individual strings used in the textviews of the screen are managed by string resources in the values folder of the res directory.
All concepts learned in the OOP's fundamentals are implemented in the project such as inheritance of WalletViewModel from ViewModel and implementation of interface like Die6 implemented Die interface with methods of roll and value over written in the Die6 java class.

The IDs of the textviews is used in the automated testing as mentioned in the assignment.

## Testing

Test cases for the code were written using Mockito framework.

Mockito is a mocking framework. It is a Java-based library used to create simple and basic test APIs for performing unit testing of applications. It can also be used with other frameworks such as JUnit and TestNG.

Unit testing:
Unit testing is a software testing technique in which individual components/parts of the software is tested, i.e., a group of computer programs, usage procedure, etc. Unit testing of an object is done during the development of an application. The aim of unit testing is to isolate a segment of code (unit) and verifies its correctness. A unit is referred to as an individual function or procedure (program). The developers usually perform it during testing.

I created a mock object of Die6 class and returned fabricated return values when called by the WalletViewModel class by injecting the mock object in the WalletViewModel class and testing the fields of single_sixes,double_sixes,coins,double_others,tot_dice_rolls by manually testing the roll die method with a given data stored in array. On comparing the values of expected and actual results the test cases can be run and the correctance of the code can be checked by by passing the die6 class avoiding the random values and using values from a fixed array. The approach was slightly challenging for me to use Mockito as it was new to me and I have to read several documentations to understand the implementation of the Mockito a more readable test cases creation process by individually testing unit classes and mocking others classes used in the test class.

#### Suggestions from running Accessibility scanner on the app:

Text contrast: increased item's text foreground to background contrast ratio to make it more readable

Text Scaling: modified the layoutsParams to allow for text expansion.

- It took me around 9 hours atleast to complete the assignment

- The assignemt rating is 8/10 for me.