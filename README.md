# ChatApplication
This is mini project using Socket Programming in Java implementing Chat Application with a server and client

The client and server can communicate with each other by sending short messages.
There are two main .java files 1. Client.java 2. Server.java

To execute this project open to CMD's in split screen mode (Split Screen is just to show how 2 programs communicate with each other)

On one CMD first use type this
>> javac Server.java

>> java Server

Remeber to execute Server.java first then on another CMD type this code
>> javac Client.java

>> java Client

As soon as Client executes (already before this Server is waiting for connection) Client will send request to get connected with Server
<img width="398" alt="image" src="https://github.com/akashpandit3010/ChatApplication/assets/109208423/8d092d20-924f-46a9-bd42-0fcb5e629605">

You will see above system prompt, allow this

Only after succesful connection between Client and Server, On both CMD's program will ask for name. You can answer this and continue.
Type messages and communicate and ENJOY!!!

This will be a loop which will endlessly execute untill you feel to END.

Steps to END connection:
Note: Connection can never be terminated by Server program
So when its the chance of Client to type message just type "END" and you will see the program automatically exits loop.
END is case sesitive exit command.

Incase you want client and server program to run on two different machines you will have to modify Socket declaration part in boh the files replace IP addresses of the machines

Thank you
Akash Pandit

