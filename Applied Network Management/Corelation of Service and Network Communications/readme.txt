######################################################################################################################################
#						  Readme     Use db.conf                                                            #
######################################################################################################################################

You are in folder assignment2.
The purpose of this assignment is to find the correlation between servers and network elements. The results are presented through a web dashboard.

This document describes the information about the various files in this folder, modules/software needed and steps to run this assignment.

######################################################################################################################################
#						   Contents                                                                       #
######################################################################################################################################

This folder consists of 13 files in total:

1.  adddevice.php
2.  addserver.php
3.  backend
4.  deletedevice.php
5.  deleteserver.php
6.  device.pl
7.  FullSizeRender.jpg
8.  getting.php
9.  gettingserver.php
10.  index.html
11. monitor.php
12. readme.txt
13. Server.pl

######################################################################################################################################
#                                              Software Requirements                                                              #
######################################################################################################################################

1. Operating System: Ubuntu 14.04 LTS.

2. You need to install Apache server, MySQL and PHP.

3. Modules which are needed to be installed from CPAN are:
	 Data::Dumper
	 DBD::Mysql
	 DBI
   FindBin
   File::Basename
   File::Spec::Functions
	 LWP::Simple
	 LWP::UserAgent
   Net::SNMP
   Net::SNMP::Interfaces
	 RRDs

###################################################################################################################################### 
                                            Steps to run this assignment
######################################################################################################################################

1. Go to the terminal in move to the directory where this folder is present, say, /var/www/html/et2536-saad15/assignment2/ 
   (It is assumed that the working directory configured in the apache server is /var/www/html/, change the path accordingly) 

2. Run the shell script "backend" in the terminal with the command "perl backend".

3. Now, open a web browser and type the following URL: (It is assummed that the folder is in /var/www/html/.
	 http://localhost/et2536-saad15/assignment2/index.php

4. Choose the desired options to view the server and device metrics.

NOTE:
-----
Make sure to create the servers and devices table in the MySQL database prior to running the backend script in the terminal. 
They are automatically created by accessing the index page of the second assignment through the front end. Thus, it is advised to first add the device and server credentials through the front end.

This script by default probes the SNMP devices whose credentials are entered.

The user can delete these devices information through web GUI, and insert the devices he wishes to probe.
