OBJECTIVE:
The objective of this project was to create a functional entertaining application using Kotlin. This application must provide users with life hacks and myth-busting facts based on a game where you’re given a “hack” and you have to figure if it’s a real hack or just a myth. The goal is to entertain the user while spreading useful information and knowledge to keep them safe on the internet.

DESIGN DEVELOPMENT PROCESS:
1.  PROBLEM ANALYSIS
•  People are struggling with identifying genuine life hacks versus popular myths due to overwhelming misinformation online.
•  Design an entertaining but yet informative app to help the user learn practical, verified tips throughout the day.
2.  Algorithm Design
•  Design multiple UI Layouts using XML.
    - </> activity_main.xml
    - </> activity_quiz.xml
    - </> activity_score.xml 

•  activity_main will serve has the opening/.   introduction layout where there’ll be a start button which will take you to quiz layout
•  quiz activity layout will be the main layout of the app where you’ll be give texts views for both hack and feedback. It will also include Boolean buttons Hack or Myth with serve as True or False. 

•  Created the activity_main.xml visuals using Adobe.
•  Make the UI layout more appealing by adding colour to my layout.
	•	activity_score.xml will have the score, total score and a review button 

3.  DEVELOPMENT/CODING
•  Used Kotlin.
•  Create classes for all xml layouts 
	•	MainActivity.kt 
	•	Hack.kt 
	•	QuizActivity.kt
	•	ScoreActivity.kt 

•  All layouts will be have to be linked to their class and the logic must work simultaneously with relevant classes and to keep loop running 
•  Implemented IF statements to check category selection.ELSE statements to create while loops. 

4.  TESTING
•  Ran the project through Android Studio Emulator (Medium Phone API 37).
5.  DOCUMENTATION
•  APP features
•  Include a category selection feature where the user can type in a category (Home, Kitchen, Money, Health, General).
•  It also includes a suggest button, which, upon click, it will pop up a life hack or reveal a myth.
•  And there is a fact display.
•  Testing:
•  It took time for the app to run upon testing due to problems with my emulator.
•  After a couple of attempts, the app ran. First, there were a few crashes due to syntax errors, such as not closing a line of code.
•  Improvements:
•  If given more time I would've improved my UI design with a more interactive layout.
•  Adding animation to the background.
•  Adding a search feature to find specific hacks or myths.
----
CONCLUSION:
This project was a success. I was able to develop an application that helps give out verified life hacks and debunk popular myths to the user according to the category that the user inputs. It's a straightforward application that is also colourful, making it more interesting for the user.
