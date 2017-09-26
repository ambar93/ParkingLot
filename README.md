# Parking Lot
 An auto generate -  car ticketing program
. The project is an automated ticketing system that allows customers to use parking lot without human intervention.
 As cars request to park in the parking lot, a search is made to find the closest slot and allot that car to that slot. 
The project also lets one know in which slot a car is parked, the overall status of the parking lot, registration number of cars that are of one color.
 The project is designed specifically to handle such queries with ease.
# Getting Started
 The following instructions will give detailed list of steps to execute the program on your machine
The given project takes two forms of input and based on the input given by the user the program is either interactive or reads from a given file. Refer to deployment section, to know
how to run the project.
#Prerequistes
To run the project on your local machine, you need to download the Zip folder or 
clone the project with the following command
git clone https://github.com/ambar93/ParkingLot.git

The following command will create a folder with following stucture in the directory where 
you cloned/unzipped the folder
.git
.metadata
com.parkingLot
RemoteSystemTempFiles
input.txt
parking_lot
README.md

The source code of the project lies in com.parkingLot folder. The file input.txt 
is used to give input to the program. You can modify the contents of this file to
run test cases you wish to test. The shell script file parking_lot is the file that will
be used to run the project. It contains commands to take input from user, compile,
build, test and run the project.


#Installing 
To run the Parking Lot Project. Follwoing should be present in the system

Maven
Steps to install Maven for Ubuntu 
sudo apt-get install software-properties-common
sudo apt-add-repository universe
sudo apt-get update
sudo apt-get install maven

Java OpenSdk
Steps to install 
// you mention which version ? and steps to install

To check the above two are successfully installed, run the following commands
mvn -version
java -version

#Running
To run the project. Go inside ParkingLot folder 
commsnd to go inside the folder - cd ParkingLot.
After navigating to this folder. Run either of the below command
For file as input parameters
command to run - ./parking_lot input.txt
For interactive mode
command to run - ./parking_lot

This command will execute the shell script. It will compile build test and run the 
code.

#Testing 
The parking_lot shell script runs the test by the command mvn test. These test
cover the functionality of the project.Testng is used to write the test cases. 
These test cases run on all the functions, asserting the given and expected 
output.

#Project Structure
The given project has mainclass called App.java. This file is responsible of taking 
input from user and then calling the appropriate functions. Apart from App.java, the 
Apptest.java is the file where test cases are written
The project contains a java file named Car.java. The file acts as a model for Car, with
color, slot and registration number as data members. We keep slot as a data member
since each car will be assoicated with a slot number.
The utility class called parkingUtil.java has all the functions implemented in it.
These functions are called by App.java on basis of input passed by the user.
We have made a seperate java file called CartoColorDictionary.java . This file
basically maintains a hashmap with key as color and value as list of car objects. 
Though I could have got slot numbers/ registration numbers that belong to a 
particular color, the searching time will be very high. So here a sperate class called 
ColorToCarDictionary which will add and remove and list ids of a particular color.
