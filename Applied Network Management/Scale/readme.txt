######################################################################################################################################
#						  Readme     Use db2.conf                                                            #
######################################################################################################################################

You are in folder assignment4.
The purpose of this assignment is to find the systemuptime for about 150 devices using non-blocking SNMP calls. Each device is probed every 30 seconds. The results are presented through a web dashboard.

This document describes the information about the various files in this folder, modules/software needed and steps to run this assignment.

######################################################################################################################################
#						  Contents                                                                      #
######################################################################################################################################

This folder consists of 5 files in total:

1. A4.php
2. backend
3. backend.pl
4. index.php
5. readme.txt

######################################################################################################################################
#                                              Software Requirements                                                            #
######################################################################################################################################

1. Operating System: Ubuntu 14.04 LTS.

2. You need to install Apache server, MySQL and PHP.

3. SNMP Modules which are needed to be installed from CPAN are:
	 Data::Dumper
	 DBD::Mysql
	 DBI
   FindBin
   File::Basename
   File::Spec::Functions
 
###################################################################################################################################### 
                                            Steps to run this assignment
######################################################################################################################################

1. Go to the terminal in move to the directory /var/www/html/et2536-saad15/assignment4/ 
   (Move to the path of your working directory configured in your Apache server)

2. Run the perl script "backend.pl" in the terminal with the command "perl backend.pl". 
	 This script has a sleep command which runs the script "sysup.pl" every 30 seconds.

3. Now, open a web browser and type the following URL: (it is assumed that the working directory is in /var/www/html/)
	 http://localhost/et2536-saad15/assignment4/index.php

4. This page displays the list of all the devices.

5. You can select any one device and view the detailed information of that device such as IP, Port, Community, SysUpTime, Number of sent and  	 lost requests, Local web server time.
